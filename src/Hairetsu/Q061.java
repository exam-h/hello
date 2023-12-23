package Hairetsu;

public class Q061 {

	public static void main(String[] args) {
		int[] scores = {94,85,67,24,56,51,49,7,23,71};
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]);
			for (int j = 0; j < scores[i] / 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
