package Inheritance;

public class Main185 {

	public static void main(String[] args) {
		Vehicle[] vs = { new Car3(), new Rocket(), new Ship(), new Car3(), new Rocket() };
		for (Vehicle v : vs) {
			v.run();
		}
	}
}