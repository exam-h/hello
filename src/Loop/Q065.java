package Loop;
import java.util.Scanner;
public class Q065 {
	public static void main(String[] args) {
		System.out.println();
			int n = 0, sum = 0;
			int i = 0;
			try(Scanner sc = new Scanner(System.in)){
				while (i <= 100) {
				System.out.println();
				n = sc.nextInt();
				if(n < 0) {
				 continue;
			}
			sum += n;
			i++;
			System.out.println(n + "を足します。");
			System.out.println("現在の合計は:" + sum);
							
			}
		}
	}
}
