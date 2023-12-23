package Hairetsu;

public class Q032 {

	public static void main(String[] args) {
		double[] scores = {94,85,67,24,56,51,49,7,23,71};
		double sum = 0;
		
		for (double score : scores) {
			sum += score;
		}
		
		double ave = sum / scores.length;
		System.out.println("平均点は" + ave + "点です。");
		
		
	}
}