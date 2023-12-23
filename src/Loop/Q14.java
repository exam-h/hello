package Loop;
import java.util.Random;
public class Q14 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			monte();
		}
	}

	public static void monte() {
		Random r = new Random(System.currentTimeMillis());
		int cnt = 0;
		final int n = 400000000;
		double x, y;
		for (int i = 0; i < n; i++) {
			x = r.nextDouble();
			y = r.nextDouble();
			if (x * x + y * y <= 1) {
				cnt++;
			}
		}
		System.out.println((double) cnt / (double) n * 4D);
	}
}