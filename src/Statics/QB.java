package Statics;

public class QB {
	public static void main(String[] args) {

		int[] scores = {60, 53, 5, 68, 82, 70, 83, 12, 3, 72, 38, 68, 92, 15, 92, 48, 13, 14, 80};
		int[] ages = {22, 29, 28, 29, 26, 23, 30, 23, 27, 23, 28, 28, 26, 27, 26, 28, 30, 25, 22};

		int sum = 0;
		double avg = 0;

		System.out.println("合計点数:" + (double)sum(scores));
		System.out.println("平均点数:" + (double)sum(scores) / scores.length);
		System.out.println("平均年齢:" + (double)sum(ages)/ages.length);
	}
	// 配列の要素の合計を返すメソッド
	public static int sum(int[] array) {
	    // 合計を格納する変数
	    int total = 0;
	    // 配列の要素を一つずつ取り出して加算する
	    for (int element : array) {
	        total += element;
	    }
	    // 合計を返す
	    return total;
	}
}