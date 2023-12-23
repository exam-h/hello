package Inheritance;

public class Main183 {

public static void main(String[] args) {
	Vehicle v = new Airplane();
	Airplane a = (Airplane) v;
	a.fly();
	}
}