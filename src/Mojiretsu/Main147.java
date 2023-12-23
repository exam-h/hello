package Mojiretsu;

public class Main147 {
	public static void main(String[] args) {
		String str1 = "Hello";//①
		String str2= str1;//②
		System.out.println(str1 == str2);
		
		str1 = "world"; //③
		
		System.out.println(str1 == str2);
	}
}