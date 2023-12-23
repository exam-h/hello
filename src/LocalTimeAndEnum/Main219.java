package LocalTimeAndEnum;
import java.time.LocalDateTime;
public class Main219{
	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.now();
		System.out.println(date.getYear() + "年");
		System.out.println(date.getMonth() + "月");
		System.out.println(date.getDayOfMonth() + "日");
		System.out.println(date.getDayOfWeek() + "曜日");
		System.out.println(date.getHour() + "時");
		System.out.println(date.getMinute() + "分");
		System.out.println(date.getSecond() + "秒");
		System.out.println(date.getNano() + "ナノ秒");
	}
}	