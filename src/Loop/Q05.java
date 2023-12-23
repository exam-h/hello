package Loop;
import java.util.Scanner;
public class Q05 {
	public static void main(String[] args) {
		System.out.println();
			int n = 0, sum = 0;
			try(Scanner sc = new Scanner(System.in)){
			for (int i = 0;i < 100; i++) {
				System.out.println();
				n = sc.nextInt();
				if(n < 0) {
				 continue;
			}
			sum += n;
			System.out.println(n + "を足します。");
			System.out.println("現在の合計は:" + sum);
							
			}
		}
	}
}
