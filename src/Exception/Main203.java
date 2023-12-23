package Exception;

public class Main203 {

	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println("例外が発生しました");
			System.out.println(e);
		}
 	System.out.println("このプログラムを終了します");
	}
}