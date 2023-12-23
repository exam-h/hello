package KihonbunpouSotsugyou;
import java.util.Random;
import java.util.Scanner;
public class Main02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int answer = new Random().nextInt(10)+1;
		int maxCount = 5;
		long startTime = System.currentTimeMillis();
		
		while(count<maxCount){
			System.out.println(maxCount + "回以内に数を当ててね");
			System.out.println("キーボードから数値を入力してください");
			 int guess = scanner.nextInt();
			 count++;
			 
			 if (guess == answer) {
				 if(count <= 3) {
				 System.out.println("大あたり！すごいことだよ");
				 }else {
					 System.out.println("あたり。まあまあすごいよ。");
				 }
				 break;
			 } else if (guess < answer) {
				 System.out.println("もっと大きな数字です。");
			 } else {
				 System.out.println("もっと小さな数字です。");
			 }
		}
		
		if (count > maxCount) {
			System.out.println("5回以内で答えられなかったのでゲーム終了");
		}
		
		 long endTime = System.currentTimeMillis();
		 long elapsedTime = endTime - startTime;
		 double time = elapsedTime / 600;
		 System.out.println("ゲームの実行時間: " + time + "秒");
	}
}