package Inheritance;

public class Main188 {

	public static void main(String[] args) {
		Vehicle[] vs = { new Car3(), new Rocket(), new Ship(), new Surfing() };
		for (Vehicle v : vs) {
			v.run();
		}
	}
}