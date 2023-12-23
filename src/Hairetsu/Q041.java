package Hairetsu;

public class Q041 {

	public static void main(String[] args) {
		double sum = 0;
		double[] scores = {94,85,67,24,56,51,49,7,23,71};
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		double ave = sum / scores.length;
		System.out.println("平均点は" + ave + "点です。");
		System.out.println("平均点以上の点数は:"  );
		
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= ave) {
				System.out.println(scores[i]);
			}
		}
	}
}	
