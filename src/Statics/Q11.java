package Statics;
import java.util.Random;
public class Q11 {
	public static int[] getRandomNumbers(int num) {
		// 乱数を生成するためのオブジェクトを作成する
		Random random = new Random();
		// 引数で受け取った数の要素を持つ配列を作成する
		int[] array = new int[num];
		// 配列の要素を一つずつ乱数で埋める
		for (int i = 0; i < num; i++) {
			// 0～10の乱数を生成する
			int randomNumber = random.nextInt(11);
			// 配列のi番目の要素に乱数を代入する
			array[i] = randomNumber;
		}
		// 配列の参照を返す
		return array;
	}
	public static void main(String[] args) {
		// getRandomNumbersメソッドを呼び出す
		int[] array = getRandomNumbers(10);
		// 配列の要素を一つずつ表示する
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
