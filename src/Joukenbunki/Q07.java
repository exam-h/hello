package Joukenbunki;
public class Q07 {
	public static void main(String[] args) {
		double num1 = 0.1;
        double num2 = 0.2;
        double num3 = num1 + num2; 
        System.out.println(num3);
        if (num3 == 0.3) {
            System.out.println("The same");
        } else {
            System.out.println("Not the same");
        }
        num1 *= 10;
        num2 *= 10;
        num3 = num1 + num2;
        System.out.println(num3);
        if (num3 == 3) {
            System.out.println("The same");
        } else {
            System.out.println("Not the same");
        }
    }
}