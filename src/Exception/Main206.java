package Exception;

public class Main206 {

	public static void main(String[] args) {
		try {
			int[] numbers = {1, 2, 3};
			numbers[3] = 4;
			System.out.println(5 / 0);
			System.out.println(Integer.parseInt("2byte"));
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("このプログラムを終了します");
	}
}