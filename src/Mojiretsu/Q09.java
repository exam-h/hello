package Mojiretsu;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q09 {
	public static void main(String args[]) {
		// 文字列の埋め込み
		String name = "リッチー";
		String message = String.format("%sさんをご紹介します！", name);
		System.out.println(message);
		
		// 整数の埋め込み
		int age =29;
		String ageMessage = String.format("年齢：%d歳", age);
		System.out.println(ageMessage);

				// 浮動小数点数の埋め込み
		double hight = 177.5;
		String hightMessage = String.format("身長：%.1fcm", hight);
		System.out.println(hightMessage);

		// 日付の埋め込み
		LocalDate date = LocalDate.of(1994, 1, 11); // 誕生日を設定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		String dateMessage = String.format("お誕生日：%s", date.format(formatter));
		System.out.println(dateMessage);
	}
}
