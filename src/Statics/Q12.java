package Statics;

public class Q12 {
	public static void sayHello (String name, int count) {
		String n = name;
		for (int i = 0; i < count; i++) {
		  System.out.println("Hello!" + name + "san。"); 
		}
	}	
	public static void main(String[] args) {
		sayHello("imai", 5);
	}
}