package Statics;

public class Q17 {
	public static void main(String[] args) {

		int[] scores = {60, 53, 5, 68, 82, 70, 83, 12, 3, 72, 38, 68, 92, 15, 92, 48, 13, 14, 80};
		int[] ages = {22, 29, 28, 29, 26, 23, 30, 23, 27, 23, 28, 28, 26, 27, 26, 28, 30, 25, 22};

		int sum = sum(scores);
		double avg = sum / scores.length;

		System.out.println("合計点数:" + sum);
		System.out.println("平均点数:" + avg);
		System.out.println("平均年齢:" + (double)sum(ages)/ages.length);
	}
	
	public static int sum(int[] array) {
	    int total = 0;
	    for (int element : array) {
	    total += element;
	    }
	    return total;
	}
}