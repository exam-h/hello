package Mojiretsu;

import java.util.Scanner;

public class Main154 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("文字列を入力してください: ");
			String userInput = scanner.nextLine();

			// nullチェック
			if (userInput == null) {
				System.out.println("入力がnullです。");
				// 空文字チェック
			} else if (userInput.isEmpty()) {
				System.out.println("入力が空です。");
			} else {
				System.out.println("入力された文字列: " + userInput);
			}
		}
	}
}