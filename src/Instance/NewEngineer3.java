package Instance;
class NewEngineer3 {

	int id;
	String name;
	void show(){
		System.out.println("私のIDは" + id + "、名前は" + name + "です。");	
	}
	public NewEngineer3(int id, String name) {
		this.id = id;
		this.name = name;
	}
}