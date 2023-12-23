package Loop;
import java.util.Scanner;
public class Q111 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("正の整数を入力してください。");
		int n = scan.nextInt(); 
		System.out.println("コラッツの予想による計算結果を表示します。");
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
				} else {
				n = 3 * n + 1; 
			}
			System.out.println(n);
		}
		scan.close();
	}
}