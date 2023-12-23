package Joukenbunki;

public class Main127 {

	public static void main(String[] args) {
		int english = 80;
		int math = 75;

		if (english >= 80 && math >= 80) {
			System.out.println("S");
		} else if (english >= 80 || math >= 80) {
			System.out.println("A");
		} else if (english >= 70 || math >= 70) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}
