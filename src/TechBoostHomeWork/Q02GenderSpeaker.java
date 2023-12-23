package TechBoostHomeWork;

public class Q02GenderSpeaker {
	public static void main(String[] args) {
	doSpeak(new Q02Man());
	doSpeak(new Q02Woman());
}

	private static void doSpeak(Q02Person person) {
		person.speak();
	
	}
}
