package Statics;

public class Q16 {
	private static void methodA(int num1, int num2) {
        methodB(num1, num2);
    }

    private static void methodB(int num1, int num2) {
        methodC(num1, num2);
    }

    private static void methodC(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    public static void main(String[] args) {
        methodA(5, 0);
    }
}