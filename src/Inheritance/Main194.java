package Inheritance;

public class Main194 {

	public static void main(String[] args) {
		Bicycle bi1 = new Bicycle(110);
		Bicycle bi2 = new Bicycle(110);
		Bicycle bi3 = new Bicycle(119);
		System.out.println(Main194.equals(bi1,bi2));
		System.out.println(Main194.equals(bi2,bi3));
	}
    
	static boolean equals(Bicycle bi1, Bicycle bi2){     
		if (bi1 == bi2) {
			return true;
		}
		if (bi2 == null) {
	return false;
		}
		if (bi1.getClass() != bi2.getClass()) {
			return false;
		}
		if (bi1.registryNumber != bi2.registryNumber) {
			return false;
		}
		return true;
	}
}