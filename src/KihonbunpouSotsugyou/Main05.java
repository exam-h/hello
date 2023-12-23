package KihonbunpouSotsugyou;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main05 {
	public static void main(String [] args) {
		// 変数に出力したいタイトル、ルールを格納
		String title = "Hit&Blow";
		String rule = "隠された3つの数字を当ててください" +
				"1つの文字は1から9の間です " +
				"3つの数字は重複しません " +
				"入力した数字の位置と数字が当たってたらHit " +
				"数字だけあってたらBlowとカウントします。";
		// タイトルとルールを出力
		System.out.println(title);
		System.out.println(rule);
		// 答えの生成
		int [] answer = new int [3];
		for (int i = 0; i < answer.length; i++) {
			// 1~9の数字をランダムに生成
			answer [i] = (int) (Math.random () * 9 + 1);
			// 重複チェック
			for (int j = 0; j < i; j++) {
				if (answer [i] == answer [j]) {
					i--;
					break;
				}
			}
		  }
		// 入力した数字を保持する配列
		int [] input = new int [3];
		// 正解までの試行回数をカウントする変数
		int count = 0;
		// 正解するまで繰り返す
		while (true) {
			count++;
			// 数字を入力する
			System.out.print("3桁の数字を入力してください：");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				String line = br.readLine();
				//入力した数字を配列に格納
				for (int i = 0; i < input.length; i++) {
					input [i] = Character.getNumericValue(line.charAt(i));
				}
			} catch (IOException e) {
				System.out.println(e);
			}
			//ヒットとブローの判定
			int hit = 0;
			int blow = 0;
			for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < input.length; j++) {
					if (i == j && answer [i] == input [j]) {
						hit++;
					} else if (answer [i] == input [j]) {
						blow++;
					}
				}
			}
			// ヒットとブローの数を出力
			System.out.println("Hit：" + hit + "  Blow：" + blow);
			// ヒットが3なら正解と判定して終了
			if (hit == 3) {
				System.out.println("正解です！");
				System.out.println("試行回数：" + count);
				break;
			}
		}
	}	
}