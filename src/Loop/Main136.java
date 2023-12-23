package Loop;

public class Main136 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i * j + "\t"); //最後のタブは見やすさのため
			}
		}
		System.out.println(""); //改行のため
	}

}
