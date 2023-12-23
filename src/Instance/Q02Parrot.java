package Instance;

public class Q02Parrot {
	String name;
	Q02Parrot(String name) {
		this.name = name;
	}
	void talk(String message) {
		System.out.println("Hello,I`m" + name + " "+ message);
	}
}
