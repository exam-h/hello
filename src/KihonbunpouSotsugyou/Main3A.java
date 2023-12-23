package KihonbunpouSotsugyou;
import java.util.Scanner;
public class Main3A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int level ;
		do {
			System.out.println("レベルを選択してください。");
			System.out.println("1: 0～9");
			System.out.println("2: 0～99");
			System.out.println("3: 0～999");
			level = sc.nextInt();
			if(level < 1 || level > 3) {
				System.out.println("１～３以外の入力がありました。もう一度入力してください。");
			}
		}while(level < 1 || level > 3);
		
		int overcount = 6;
		int answer = (int) (Math.random() * Math.pow( 10,level ));
		System.out.println("5回以内に数を当ててね");
		long startTime = System.currentTimeMillis();	
		int guess ;
		for(int i = 1; i <= 5; i++) {
			System.out.println("キーボードから数値を入力してください");
			guess = sc.nextInt();
		 
			if (guess == answer) {
				if(i <= 3) {
					System.out.println("＼(^o^)／大あたり！" + i + "回目だからすごいことだよ");
				}else {
					System.out.println("あたり。まあまあすごいよ。");
				}
				break;
			}else if (guess < answer) {
				System.out.println("もっと大きな数字です。");
			} else {
					System.out.println("もっと小さな数字です。");
					if (overcount > 5) {
						System.out.println("残念！答えは" + answer + "でした。");
							System.out.println("もう一度挑戦してね。");
					}		
				}
			}
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		double time = elapsedTime / 1000;
		System.out.println("ゲームの実行時間: " + time + "秒");
	}
}
