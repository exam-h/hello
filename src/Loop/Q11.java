package Loop;
public class Q11 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int count = 0;
		while(n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}
			count++;
		}
		System.out.println(n);
	}
}