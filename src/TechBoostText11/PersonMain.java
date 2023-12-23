package TechBoostText11;

public class PersonMain{
	public static void main(String[] args) {
		Person person =  () -> "foo bar";
		System.out.println(person.getName());
	}
}
