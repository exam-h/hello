package Loop;

import java.util.Scanner;

public class Main131 {

	public static void main(String[] args) {
		System.out.println("何回数え上げますか?");

		try (Scanner sc = new Scanner(System.in)) {
			int count = sc.nextInt();

			int i = 0;
			while (i < count) {
				System.out.println(i);
				i++;
			}
		}
	}
}