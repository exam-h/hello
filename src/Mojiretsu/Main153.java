package Mojiretsu;

public class Main153 {
public static void main(String[] args) {
	String str1 = new String("ABC");
	String str2 = str1;
	str1 = null;
	System.out.println(str2);
	str2 = null;
	System.out.println(str2);
	}
}