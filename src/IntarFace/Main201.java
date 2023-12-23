package IntarFace;

public class Main201 {

	public static void main(String[] args) {
		Animal[] c = { new Cat(21, 63), new Human(33, 169), new Cat(29, 55), new Human(25, 175) };
		Animal max = c[0];
		for (int i = 0; i < c.length - 1; i++) {
			if (max.compareTo(c[i + 1]) < 0) {
				max = c[i + 1];
			}
		}
		System.out.println(max);
	}
}

class Animal implements Comparable<Animal> {

	int age;
	int height;

	public Animal(int age, int height) {
		this.age = age;
		this.height = height;
	}

	@Override
	public int compareTo(Animal anotherAnimal) {
		return (this.age < anotherAnimal.age) ? -1 : ((this.age == anotherAnimal.age) ? 0 : 1);
	}

	@Override
	public String toString() {
		return this.getClass() + "{ 年齢=" + age + ", 身長=" + height + "}";
	}
}

class Cat extends Animal {

	public Cat(int age, int height) {
		super(age, height);
	}

	public void speak() {
		System.out.println("mew mew mew");
	}
}

class Human extends Animal {

	public Human(int age, int height) {
		super(age, height);
	}

	public void speak() {
		System.out.println("blah blah blah");
	}
}