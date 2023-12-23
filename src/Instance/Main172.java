package Instance;

public class Main172 {

	static void plusOne(int i) {
		i++;
		System.out.println("呼び出し先のi:" + i);
	}
	public static void main(String[] args) {
		int i = 10;
		System.out.println("呼び出し元のi:" + i);
		plusOne(i);
		System.out.println("呼び出し元のi:" + i);
	}
}