package hallo.example;

import java.util.Scanner;

public class Main000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 標準入力で与えられる値は文字列
		String line = sc.nextLine();
		int num = Integer.parseInt(line);// 文字列型の数字を整数型の数字に変える "3" -> 3
		int num = sc.nextInt();
		System.out.println(num * 12);
	}
}