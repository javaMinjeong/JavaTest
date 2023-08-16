package com.test.question.Q101;

public class Coffee {

	private static int bean;
	private static int water;
	private static int ice;
	private static int milk;
	
	private static int beanUnitPrice;
	private static double waterUnitPrice;
	private static int iceUnitPrice;
	private static int milkUnitPrice;
	private static int beanTotalPrice;
	private static int waterTotalPrice;
	private static int iceTotalPrice;
	private static int milkTotalPrice;
	
	private static int americano;
	private static int latte;
	private static int espresso;
	
	//초기화 블럭
	static {
		Coffee.beanUnitPrice = 1;
		Coffee.waterUnitPrice = 0.2;
		Coffee.iceUnitPrice = 3;
		Coffee.milkUnitPrice = 4;
		
		Coffee.bean = 0;
		Coffee.water = 0;
		Coffee.ice = 0;
		Coffee.milk = 0;
		
		Coffee.beanTotalPrice = 0;
		Coffee.waterTotalPrice = 0;
		Coffee.iceTotalPrice = 0;
		Coffee.milkTotalPrice = 0;
		
		Coffee.americano = 0;
		Coffee.latte = 0;
		Coffee.espresso = 0;
		
	}
	
	
	public static int getBean() {
		return bean;
	}
	public static int getWater() {
		return water;
	}
	public static int getIce() {
		return ice;
	}
	public static int getMilk() {
		return milk;
	}
	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}
	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}
	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}
	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}
	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}
	public static int getWaterTotalPrice() {
		return waterTotalPrice;
	}
	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}
	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}
	public static int getAmericano() {
		return americano;
	}
	public static int getLatte() {
		return latte;
	}
	public static int getEspresso() {
		return espresso;
	}
	
	public static void countCoffee(Espresso espresso) {
		
		Coffee.espresso++;
		Coffee.bean += espresso.getBean();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * espresso.getBean();
		
	}
	
	public static void countCoffee(Latte latte) {
		
		Coffee.latte++;
		Coffee.bean += latte.getBean();
		Coffee.milk += latte.getMilk();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * latte.getBean();
		Coffee.milkTotalPrice += Coffee.milkUnitPrice * latte.getMilk();
		
	}
	
	public static void countCoffee(Americano americano) {
		
		Coffee.americano++;
		Coffee.bean += americano.getBean();
		Coffee.water += americano.getWater();
		Coffee.ice += americano.getIce();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * americano.getBean();
		Coffee.waterTotalPrice += Coffee.waterUnitPrice * americano.getWater();
		Coffee.iceTotalPrice += Coffee.iceUnitPrice * americano.getIce();
		
		
	}
	
	
	
}
