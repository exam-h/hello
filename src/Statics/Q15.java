package Statics;

public class Q15 {
	public static int fib(int n) {
		if(n <= 1) {
			return 1;
		}else {
		return fib(n - 1) + fib(n - 2);
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
		System.out.println("fib(" + i + ") =" + fib(i));
		}
	}
}