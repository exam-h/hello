package Hairetsu;

public class Q051 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[10];
		scores[0] = 94;
		scores[1] = 85;
		scores[2] = 67;
		scores[3] = 24;
		scores[4] = 56;
		scores[5] = 51;
		scores[6] = 49;
		scores[7] = 7;
		scores[8] = 23;
		scores[9] = 71;
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