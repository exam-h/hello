package Mojiretsu;

public class Main148 {
	public static void main(String[] args) {
		int a = 1;
		int b = a;
		a = 2;
		System.out.println(a + ":" + b);

		int[] a1 = { 1 };
		int[] a2 = a1;
		a1[0] = 2;
		System.out.println(a1[0] + ":" + a2[0]);

		String s1 = "Hello";
		String s2 = s1;
		s1 = "Goodby";
		System.out.println(s1 + ":" + s2);
	}
}