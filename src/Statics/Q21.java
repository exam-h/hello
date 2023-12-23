package Statics;

public class Q21 {
	public static void hanoi(char x, char y, char z, int n) {
		if (n == 1) {
			System.out.println(x + "から" + y + "へ移動");
		} else {
			hanoi(x, z, y, n - 1);
			System.out.println(x + "から" + y + "へ移動");
			hanoi(z, y, x, n - 1);
		}
	}
}