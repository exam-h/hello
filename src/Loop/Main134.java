package Loop;

import java.util.Scanner;

public class Main134 {

	public static void main(String[] args) {
		
		
		int n = 0, sum = 0;
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("整数値を入力してください｡(終了するには-1を入力)");
			n = scanner.nextInt();
			
			while (n != -1) {
				sum += n;
				System.out.println(n + "入力されました。");
				System.out.println("これまでの合計:" + sum);
				System.out.println("整数値を入力してください｡(終了するには-1を入力)");
				n = scanner.nextInt();
			}
		System.out.println("終わります。");
		}
	}

}
