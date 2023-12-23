package Hairetsu;

public class Q052 {

	public static void main(String[] args) {
		int[] scores = {94,85,67,24,56,51,49,7,23,71};
		
		int max = scores[0];
		int min = scores[0];
		for (int i = 1; i < 10; i++) {
			if(scores[i] < min) {
				min = scores[i];
			}
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
	}
}	
