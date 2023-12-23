package Exception;

public class Main205 {

	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt("2byte"));
		} catch (NumberFormatException e) {
			System.out.println(e);
		}finally {
		System.out.println("例外発生の有無にかかわらず実行したい処理です");
		}
		System.out.println("このプログラムを終了します");
	}
}