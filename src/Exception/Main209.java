package Exception;
import java.util.Scanner;
	public class Main209 {
	public static void main(String[] args) {
		Scanner sc = null;
		System.out.println("何回数え上げますか?");
		try {
			sc = new Scanner(System.in);
			int count = sc.nextInt();
			int i = 0;
			while (i < count) {
				System.out.println(i);
				i++;
			}
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}