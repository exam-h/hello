package Statics;

public class Q071 {
	public static String  printMessage(String getMessage, int count) {
		String result = "";
		for (int i = 0; i < count; i++) {
			
			result += getMessage + "I LOVE YOUxxx";
		}
		return result;
	}
	public static void main(String[] args) {
		printMessage(getMessage(),5);
	}
	private static String getMessage() {
		return "I LOVE YOUxxx";
	}
}