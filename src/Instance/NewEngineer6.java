package Instance;
class NewEngineer6 {

	static int count;
	int id;
	String name;

	NewEngineer6(int id, String name) {
		this.id = id;
		this.name = name;
		count++;
		this.show();
}

	void show() {
		System.out.println(id + ":" + name + ":" + count + "人目です。");
	}
}