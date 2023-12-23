package Mojiretsu;

public class Q05 {
	public static void main(String args[]) {
		String email = "katsuya_imai●saycon.co.jp";
		// メールアドレスを「@」で分割する
		String[] parts = email.split("@");
		// 分割した結果を配列に格納する
		String username = parts[0]; // ユーザー名
		// ユーザー名とを出力する
		System.out.println("ユーザー名: " + username);
	}
}