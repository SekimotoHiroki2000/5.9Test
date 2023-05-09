package jp.co.aforce.test;

public class PracticeTest8 {
	
	int x = (int)(3 * Math.random());
	int y = (int)(4 * Math.random());
	String[] hiduke = {"今日", "明日", "明後日"};
	String[] tenki = {"晴れ", "曇り", "雨", "雪" };

	public void printHello() {
		System.out.println("Hello");
	}
	
	public void printRandomMessage() {
		int n = (int)(3 * Math.random());
		
		if(n == 0) {
			System.out.println("こんばんは");
		}else if(n == 1) {
			System.out.println("こんにちは");
		}else{
			System.out.println("おはよう");
		}
	}
	
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public void printMessage(String message, int count) {
		for(int i = 0; i < count; i ++) {
			System.out.println(message);
		}
	}
	
	public void printRectangleArea(double height, double width) {
		System.out.println(height * width);
	}
	
	public String getWeatherForecast() {
		return this.hiduke[this.x] + "の天気は" + this.tenki[this.y] + "でしょう。";
	}
	
	public boolean isEvenNumber(int value) {
		return value % 2 == 0;
	}
	
	public String getMessage(String name, boolean isKid) {
		if(isKid == true) {
			return "こんにちは" + name + "ちゃん";
		}else {
			return "こんにちは" + name + "さん";
		}
	}
	
	public String getLongestString(String[] array) {
		int a = 0;
		String b = null;
		for(int m = 0; m < array.length; m ++) {
			if(a <= array[m].length()){
				a = array[m].length();
				b = array[m];
		}
			}
		return b;
	}
	
	public boolean isAdult(Person person) {
		int age = person.getAge(); 
		return age >= 20;
	}
	
		
	}
	
