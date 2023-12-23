package Inheritance;

public class Bicycle2 extends Vehicle  {
	int registryNumber;

	public Bicycle2(int registryNumber) {
	 	this.registryNumber = registryNumber;
	}
	 
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 47 * hash + this.registryNumber;
		return hash;
		}
		@Override
		public String toString() {
			return "私の防犯登録番号は、" + this.registryNumber;
		}
}