package Inheritance;

public class Bicycle extends Vehicle  {
	int registryNumber;

	public Bicycle(int registryNumber) {
	 	this.registryNumber = registryNumber;
	}
	 
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 47 * hash + this.registryNumber;
		return hash;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			final Bicycle other = (Bicycle) obj;
			if (this.registryNumber != other.registryNumber) {
			return false;
		}
			return true;
	}
}