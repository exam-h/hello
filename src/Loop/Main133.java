package Loop;

import java.util.Scanner;

public class Main133 {

	public static void main(String[] args) {
	
		int n = 0, sum = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("整数値を入力してください｡(終了するには-1を入力)");
				n = scanner.nextInt();
				System.out.println(n + "が入力されました｡");
				if (n == -1) {
					break;
				}
				sum += n;
				System.out.println("これまでの合計" + sum);
			}
		}
	}
}		