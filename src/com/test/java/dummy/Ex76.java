package com.test.java.dummy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Ex76 {

	public static void main(String[] args) {
		
		//OpenAPI, Open Application Programming Interface
		// - 공개된 프로그래밍 기능
		// - 공공 데이터 포털
		// - 구글, 아마존, 네이버, 다음 등.. > 지도
		
		//OpenAPI > 데이터 확보 > 전부 진짜 데이터
		
		
		m1();
		//m2();
		
		
	}//main

	private static void m2() {

		/*
			{
				"name": "홍길동",
				"age": 20
				"tel": ["010-1111-1111", "010-2222-2222", "010-3333-3333"]
			
			}
		
		*/
		
		//json 문자열 안에 넣기
		String json ="{\r\n"
				+ "				\"name\": \"홍길동\",\r\n"
				+ "				\"age\": 20\r\n"
				+ "				\"tel\": [\"010-1111-1111\", \"010-2222-2222\", \"010-3333-3333\"]\r\n"
				+ "			\r\n"
				+ "			}";
		
		JSONParser parser = new JSONParser();
		
		try {
			
			JSONObject obj = (JSONObject)parser.parse(json);
			//System.out.println(obj);
			System.out.println(obj.get("name"));
			System.out.println(obj.get("age"));
			
			//tel은 통째로 하나의 문자열 출력해서 가공해줘야 함
			System.out.println(obj.get("tel"));
			
			JSONArray arr = (JSONArray)obj.get("tel");
			
			for(Object t : arr) {
				System.out.println(t);
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		//[]인건 JSONArray로 받고 아닌건 object로 받기..!
		
	}//m2

	private static void m1() {

		Scanner scan = new Scanner(System.in);
		System.out.println("[지하철 정보 검색]");
		System.out.print("역검색: ");
		
		String name = scan.nextLine();
		
		//1. 요청 URL 만들기
		String url = "http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?";
		
		url += "serviceKey=YMb9%2F3BRHDSPxMFxt90knoIjqf5hbfbxahCOxdLd9HYFH%2BYhWY8HCihETD5rDTQkcmCCHHamE%2FM1AQSFoOFX8g%3D%3D";
		//위 행동으로 인해 나는 서비스를 요청할 수 있는 자격이 생김!
		
		url += "&_type=json"; //XML or JSON
		
		url += "&numOfRows=10";
		
		url += "&pageNo=1";
		
		url += "&subwayStationName=" + URLEncoder.encode(name);
		
		//QueryString
		//주소 뒤 '?' 는 데이터를 같이 보내겠습니다.의미 > 예약어
		// - 넘기고 싶은 데이터에 Key값을 붙여야함!
		// ?키=데이터&키=데이터&키=데이터
		
		//Step 2.-----------------------------
		
		try {

			//URL 객체 생성
			URL obj_url = new URL(url);
	
			//URL와 연결하는 객체 생성 > 브라우저 대신 접속
			HttpURLConnection conn = (HttpURLConnection)obj_url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			
			BufferedReader reader = null;
			
			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			//여기서 if문의 역할은 돌려주는 작업을 성공했는지 실패했는지 확인
			
			//여기까지 오면
			//reader > 검색 결과 읽기 가능
//			String line = null;
//			
//			while((line = reader.readLine()) != null) {
//				System.out.println(line);
//				
//			}
			
			JSONParser parser = new JSONParser();
			
			JSONObject root = (JSONObject)parser.parse(reader);
			
			JSONObject response = (JSONObject)root.get("response");
			
			JSONObject body = (JSONObject)response.get("body");
			
			JSONObject items = (JSONObject)body.get("items");
			
			ArrayList<String> temp = new ArrayList<String>();
			
			
			
			//obj가 될 수도 배열이 될수도 있기에 조건문 작성
			
			if (items.get("item") instanceof JSONObject) {
				
				JSONObject item = (JSONObject)items.get("item");
				
				System.out.println("1.");
				System.out.println("호선: " + item.get("subwayRouteName"));
				System.out.println("역명: " + item.get("subwayStationName"));
				
				temp.add(item.get("subwayStationId").toString());
				
				
			} else {

				JSONArray arr = (JSONArray)items.get("item");
				
				int n = 1;
				
				for (Object obj : arr) {
				
					JSONObject item = (JSONObject)obj;
					//역 4개가 하나씩 item으로 변경이 되었고
					
					System.out.println(n + ".");
					System.out.println("호선: " + item.get("subwayRouteName"));
					System.out.println("역명: " + item.get("subwayStationName"));
					System.out.println("------------");
					n++;
					
					temp.add(item.get("subwayStationId").toString());
					
				}//for
			
			
			}//if
			
			reader.close();
			conn.disconnect();
			
			System.out.println("============");
			System.out.print("역 선택: ");
			int sel = scan.nextInt();
			
//			System.out.println(temp.get(sel - 1)); //역 ID
			
			//---------------------------
			
			url = "http://apis.data.go.kr/1613000/SubwayInfoService/getSubwaySttnExitAcctoCfrFcltyList?";
			
			url += "serviceKey=YMb9%2F3BRHDSPxMFxt90knoIjqf5hbfbxahCOxdLd9HYFH%2BYhWY8HCihETD5rDTQkcmCCHHamE%2FM1AQSFoOFX8g%3D%3D";
			
			url += "&_type=json";
			
			url += "&numOfRows=10";
			
			url += "&pageNo=1";
			
			url += "&subwayStationId=" + temp.get(sel - 1);
			
			////URL 객체 생성
			
			obj_url = new URL(url);
			
			//URL와 연결하는 객체 생성 > 브라우저 대신 접속
			conn = (HttpURLConnection)obj_url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			
			reader = null;
			
			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			////
			root = (JSONObject)parser.parse(reader);
			
			response = (JSONObject)root.get("response");
			
			body = (JSONObject)response.get("body");
			
			items = (JSONObject)body.get("items");
			
			if (items.get("item") instanceof JSONObject) {
				
				JSONObject item = (JSONObject)items.get("item");
				
				System.out.println("출구: " + item.get("exitNo") + "번");
				System.out.println("주변시설: " + item.get("dirDesc"));
				
				
			} else {

				JSONArray arr = (JSONArray)items.get("item");
				
				for (Object obj : arr) {
				
					JSONObject item = (JSONObject)obj;
					
					System.out.println("출구: " + item.get("exitNo") + "번");
					System.out.println("주변시설: " + item.get("dirDesc"));
					
				}//for
			
			
			}//if
			
			reader.close();
			conn.disconnect();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//m1
}//class
