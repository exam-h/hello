package Joukenbunki;
import java.util.Random;
public class Q05 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100);
		System.out.println(num);
		
		System.out.println(0 == num % 2 ? num + "はYES": num + "はNO");
	}
}
