package TechBoostHomeWork;

public abstract class Q02Person {

	public abstract String getGender();

	public void speak() {
		System.out.println("I'm a " + getGender());

	}
}
