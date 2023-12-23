package Joukenbunki;

public class Q03 {
	public static void main(String[] args) {
		double num1 = 82;
		double num2 = 1.8 * 1.8;
		double num3 = num1 / num2;
		System.out.printf("%.3f",num3);
		if (num3 <= 18.5){
		System.out.println("やせ型です。");
		} else if (num3 <= 18.4){
		System.out.println("普通体重です。");
		} else if (num3 >= 25){
		System.out.println("肥満です");
		}	
	}
}
