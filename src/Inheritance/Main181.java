package Inheritance;

public class Main181 {

	public static void main(String[] args) {
		Engineer se = new Engineer();
		se.id = 1;
		se.name = "今井";
		se.skill = "Java";
		System.out.println("私は" + se.name + "。私のスキルは "+ se.skill + " です。");
	}
}