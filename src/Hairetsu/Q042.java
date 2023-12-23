package Hairetsu;

public class Q042 {

	public static void main(String[] args) {
		double sum = 0;
		double[] scores = {94,85,67,24,56,51,49,7,23,71};
		
		for (double score : scores) {
			sum += score;
		}
		
		double ave = sum / scores.length;
		System.out.println("平均点は" + ave + "点です。");
		System.out.println("平均点以上の点数は:"  );
		
		for (double score : scores) {
			if (score >= ave) {
				System.out.println(score);
			}
		}
	}
}	
