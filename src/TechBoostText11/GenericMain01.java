package TechBoostText11;

public class GenericMain01 {
	public static void main(String[] args) {
		GenericSample01<String> sample = new GenericSample01<>();
		sample.setValue("sample");
		String value = sample.getValue();
		System.out.println(value);
	}
}
