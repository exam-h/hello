package Instance;

public class Main171 {

	static void show(NewEngineer1 se) {
		se.name += "_san ";
		System.out.println(se.id + " : " + se.name);
	}
	public static void main(String[] args) {
		NewEngineer1 Yamazaki = new NewEngineer1();
		Yamazaki.id = 1;
		Yamazaki.name = "yamazaki";
        show(Yamazaki);
	System.out.println(Yamazaki.name);
	}
}