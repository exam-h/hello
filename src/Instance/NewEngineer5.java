package Instance;
class NewEngineer5 {

	int id;
	String name;

	NewEngineer5(int id, String name) {
		this.id = id;
		this.name = name;
		this.show();
}

	void show() {
		System.out.println("My id is " + id + ".\nMy name is " + name + ".");
	}
}