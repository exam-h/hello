package TechBoostText11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01{
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("現在のLocalDateは" + date);
		LocalTime time = LocalTime.now();
		System.out.println("現在のLocalTimeは" + time); // 時間
		LocalDateTime dateTime = LocalDateTime.now();  // 日時
		System.out.println("現在のLacalDateTimeは" + dateTime);
	}
}
