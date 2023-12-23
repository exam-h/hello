package Statics;

public class Main156 {

	static void count(int num) {
		for(int i = 1; i <= num; i++) {
			System.out.println(i + " ");
		}
	}		
	public static void main(String[] args) {
		count(5);
		System.out.println();
		count(10);
	}
}