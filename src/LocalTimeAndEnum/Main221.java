package LocalTimeAndEnum;
import java.time.LocalDate;

public class Main221{
	public static void main(String[] args) {
		LocalDate birthday = null;
		try {
			birthday = LocalDate.of(1995, 4, 31);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(birthday);
	}
}