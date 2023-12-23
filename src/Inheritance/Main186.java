package Inheritance;

public class Main186 {

	public static void main(String[] args) {
		Bicycle bi1 = new Bicycle(110);
		Bicycle bi2 = new Bicycle(110);
		Bicycle bi3 = new Bicycle(119);
		
		System.out.println(bi1.equals(bi2));
		System.out.println(bi2.equals(bi3));
    }
}