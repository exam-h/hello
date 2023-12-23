package Joukenbunki;
import java.util.Random;
public class Q04 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100) % 9;
		System.out.println(num);
		switch (num) {
		case 1:
			System.out.println("大吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("中吉です");
			break;
		case 4:
			System.out.println("小吉");
			break;
		case 5:
			System.out.println("小吉");
			break;
		case 6:
			System.out.println("凶です");
			break;
		case 7:
			System.out.println("凶です");
			break;
		case 8:
			System.out.println("大凶です");
		}
	}
}
