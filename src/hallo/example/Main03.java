package hallo.example;

public class Main03 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.print(i * j + "\t"); // 最後のタブは見やすさのため
			}
		}
		System.out.println(""); // 改行のため
	}
}