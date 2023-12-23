package Statics;

public class Q05 {
	public static void printMessage(String message, int count) {
		  for (int i = 0; i < count; i++) {
		    System.out.println(message);
		  }
	}
	public static void main(String[] args) {
		printMessage("Hello", 5); 
	}
}