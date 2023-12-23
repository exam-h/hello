package Mojiretsu;
import java.util.Scanner;
public class Q03 {
	public static void main(String[] args) {
		String s = "START";
		Scanner sc = new Scanner(System.in);
		while(!s.isEmpty()) {
			System.out.println("お話ししましょう。");
		s = sc.nextLine();
		if(!s.isEmpty()) {
			System.out.println("本当に" + s + "ですね。");
			if (s.equalsIgnoreCase("END"))
				System.out.println("楽しかったです。またお会いしましょう。");
			}
		}
		sc.close();
	}
}