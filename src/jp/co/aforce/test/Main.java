package jp.co.aforce.test;

public class Main {

	public static void main(String[] args) {
		PracticeTest8 syuturyoku = new PracticeTest8();
		
		//問1
		syuturyoku.printHello();
		//問2
		syuturyoku.printRandomMessage();
		//問3
		syuturyoku.printMessage("Q3.Hello");
		//問4
		syuturyoku.printMessage("Q4.Hello", 5);
		//問5
		syuturyoku.printRectangleArea(5.4, 8.3);
		//問6
		System.out.println(syuturyoku.getWeatherForecast());
		//問7
		System.out.println(syuturyoku.isEvenNumber(7));
		//問8
		System.out.println(syuturyoku.getMessage("花子", false));
		//問9
		System.out.println(syuturyoku.getLongestString(new String[] {"aaa", "bbbb","ccccc","ddddd","ee"}));
		//問10
		System.out.println(syuturyoku.isAdult(new Person("太郎", 18)));

	}

}
