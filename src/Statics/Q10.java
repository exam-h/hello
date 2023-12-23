package Statics;

public class Q10 {
	public static double  getAverage(double[] array) {
		// 配列の要素の合計を格納する変数を宣言する
		  double sum = 0;
		  // 配列の要素の数を格納する変数を宣言する
		  int count = array.length;
		  // 配列の要素を一つずつ取り出してsumに加算する
		  for (double element : array) {
		    sum += element;
		  }
		  // sumをcountで割って平均値を求める
		  double average = sum / count;
		  // averageを返す
		  return average;
		}
	public static void main(String[] args) {
		System.out.println(getAverage(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
	}
}