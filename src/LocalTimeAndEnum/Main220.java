package LocalTimeAndEnum;
import java.time.LocalDate;
public class Main220{
	public static void main(String[] args) {

		LocalDate birthday = LocalDate.of(1995, 4, 19);
		System.out.println(birthday);
		
		birthday = LocalDate.parse("1969-11-09");
		System.out.println(birthday);
	}
}	