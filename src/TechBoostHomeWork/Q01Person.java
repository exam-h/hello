package TechBoostHomeWork;

public class Q01Person {

	public  enum Gender { MAN, WOMAN };	
	private Gender gender;

	public Q01Person(Gender gender) {
		this.gender = gender;
	}

	public void speak() {
		switch (gender) {
		case MAN:
				System.out.println("I'm a man");
			break;
		case WOMAN:
				System.out.println("I'm a woman");
			break;
		default:
		}
	}

	public static void main(String[] args) {
		Q01Person man = new Q01Person(Gender.MAN);
		man.speak();

		Q01Person woman = new Q01Person(Gender.WOMAN);
		woman.speak();
	}
}
