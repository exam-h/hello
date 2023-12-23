package Hairetsu;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Q07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2つの整数を入力してください。");
        
		try {
			int countmax = 0;
			int count = 1;
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.print(a + " " + b + " "); // 入力した2整数を出力

			// 第1引数の方が小さいことを前提としているため、第2引数の方が小さい場合は値を交換しておく
			if (b < a) {
				int tmp = b;
				b = a;
				a = tmp;
			}
			
			for (int n = a; n <= b; n++) {
				while (n != 1) {
					if (n % 2 == 0)
						n /= 2;
					else
						n = 3 * n + 1;
					System.out.println(n); // デバッグ用
					count++;
				}	
				if (count > countmax)
					countmax = count; // 1に到達するのにかかった回数が一番多かったときの回数を覚えておく部分
				count = 1;
				break;
			}
			
			System.out.println(countmax);
		} catch (InputMismatchException e) {
			System.out.println("入力は整数である必要があります。");
			
		}
	
	}		
}