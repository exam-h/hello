package Statics;

public class Q08 {
	public static boolean isEvenNumber(int value) {
		if (value % 2 == 0) {
			return true;
		}else {
		return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isEvenNumber(255));
	}
}