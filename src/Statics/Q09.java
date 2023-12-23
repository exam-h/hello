package Statics;

public class Q09 {
	public static double getMinValue(double a, double b) {
		return a < b ? a : b;
	}
	public static void main(String[] args) {
		System.out.println(getMinValue(3, 4));
	}
}