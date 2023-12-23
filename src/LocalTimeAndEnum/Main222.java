package LocalTimeAndEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main222{
	public static void main(String[] args) {

		LocalDate birthday = LocalDate.of(1995, 4, 19);

		System.out.println(DateTimeFormatter.ofPattern("uuuu/MM/dd(E)", Locale.JAPANESE).format(birthday));
	}
}	