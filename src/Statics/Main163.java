package Statics;

public class Main163 {

	static int factorial(int n) {
		if (n <= 1) {
			return n;
		}
		return n * factorial (n - 1);
	}
	public static void main(String[] args) {
		int ans = factorial(3);
		System.out.println(ans);
	}
}