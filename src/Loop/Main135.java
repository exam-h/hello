package Loop;

import java.util.Scanner;

public class Main135 {

	public static void main(String[] args) {
		
		int n = 0, sum = 0;
		
		try(Scanner sc = new Scanner(System.in)){
			for (int i = 0;i < 3; i++) {
				System.out.println("整数値を入力してください");
				n = sc.nextInt();
				if(n < 0) {
				 continue;
			}
			sum += n;
			System.out.println(n + "入力されました。");
			System.out.println("これまでの合計:" + sum);
							
			}
		System.out.println("終わります。");
		}
	}
}
