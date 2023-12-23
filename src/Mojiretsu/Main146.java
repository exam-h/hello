package Mojiretsu;

public class Main146 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = str1; //②
		System.out.println(str1 == str2);
		str1 = "World"; //③
		System.out.println(str1 == str2);
    }
}