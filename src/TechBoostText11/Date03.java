package TechBoostText11;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date03{
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("現在のLocalDateは" + date);
		DayOfWeek w = date.getDayOfWeek();
		System.out.println("現在の曜日は" + w);

		LocalDate dateFuture = date.plusYears(4);
		w = dateFuture.getDayOfWeek();
		System.out.println("現在から4年後のLocalDateは" + dateFuture);
		System.out.println("現在から4年後の曜日は" + w);
	}
}
