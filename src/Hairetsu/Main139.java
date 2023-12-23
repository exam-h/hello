package Hairetsu;

public class Main139 {

	public static void main(String[] args) {
		int a = 1 ;
		int b = a ;
		a = 2;
		System.out.println(a + ":" + b);
		int [] a1 = { 1 };
		int [] a2 = a1;
		a1[0] = 2;
		System.out.println(a1[0] + ":" + a2[0]);
	}
}