package Mojiretsu;
import java.util.Scanner;
public class Qa {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); // Scannerオブジェクトを作成
		 String input = ""; // 入力された文字列を格納する変数
		 while (true) { // 無限ループ
			 System.out.print("英単語を入力してください: "); // ユーザーに入力を促す
			 input = sc.nextLine(); // 入力された文字列を読み込む
			 if (input.equalsIgnoreCase("END")) { // 入力が"END"と等しいかどうかを大文字小文字を無視して判定
				 System.out.println("終了します。"); // 終了メッセージを出力
				 break; // ループを抜ける
			 }
			 System.out.println("本当に" + input + "ですね。"); // 入力された文字列に対して返事をする
		 }
		 sc.close(); // Scannerオブジェクトを閉じる
	 }
}