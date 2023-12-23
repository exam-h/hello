package TechBoostText11;

public class GenericSample01<T> {
	private T value;
	
	public void setValue(T val) {
		this.value = val;
	}

	public T getValue() {
		return this.value;
	}
}
