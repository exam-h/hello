package Mojiretsu;
import java.util.Scanner;
public class Qb {
	public static void main(String args[]) {
		String str1, str2;
		System.out.print("Input a English keyword:");
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
		System.out.print("Input another keyword:");
		str2 = sc.next();
		
		int comp = str1.compareTo(str2);
//        int comp = //ここにコードを書く
		if (comp < 0) {
			System.out.println(str1 + " is the word before " + str2 + ".");
		} else if (comp > 0) {
			System.out.println(str1 + " is the word after " + str2 + ".");
		} else {
			System.out.println("The two words are the same.");
		}
	}
}