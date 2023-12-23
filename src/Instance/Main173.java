package Instance;

public class Main173 {

	static NewEngineer2 compare(NewEngineer2 se1, NewEngineer2 se2) {
		return se1.id > se2.id ? se1 : se2;
	}

	public static void main(String[] args) {
		NewEngineer2 se1 = new NewEngineer2();
		NewEngineer2 se2 = new NewEngineer2();
		se1.id = 8;
		se1.name = "shinohara";
		se2.id = 2;
		se2.name = "imai";
		System.out.println("idの大きい方のSEを表示します。");
		NewEngineer2 se3 = compare(se1, se2);
		se3.show();
	}
}