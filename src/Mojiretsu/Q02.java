package Mojiretsu;
import java.util.Scanner;
public class Q02 {
	public static void main(String[] args) {
		String password = "abc";
		String passwordIn;
		
	System.out.println("パスワード？:");
	Scanner sc = new Scanner(System.in);
	passwordIn = sc.next();
	sc.close();
	
	if (password.equals(passwordIn)) {
		System.out.println("ログインしました。");
	} else {
		System.out.println("パスワードが違います。");
		}
	}
}