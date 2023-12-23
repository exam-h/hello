package Statics;
import java.util.Random;
import java.util.Scanner;
public class Q20 {
	public static void main(String[] args) {
		int answer = getAnswer();
		long start = System.currentTimeMillis();
		int i = 0;
		int[] history = {-1, -1, -1, -1, -1};
		i = checkTheAnswer(i, history, answer);
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000 + "秒かかったよ");
		showHistory(i, history);
	}
	public static int getAnswer() {
		Random random = new Random();
		int answer = random.nextInt(100) + 1;
		return answer;
	}
	public static int checkTheAnswer(int i, int[] history, int answer) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			System.out.print("1から100までの数を入力してください: ");
			int input = scanner.nextInt();
			history[i] = input;
			i++;
			if (input == answer) {
				System.out.println("正解です!");
				break;
			} else if (input < answer) {
				System.out.println("もっと大きい数です");
			} else {
				System.out.println("もっと小さい数です");
			}
		}
		return i;
	}
	
	public static void showHistory(int i, int[] history) {
		System.out.println("入力履歴:");        // 配列の要素を一つずつ取り出して表示する
		for (int j = 0; j < i; j++) {
			System.out.println(history[j]);
		}
	}	
}