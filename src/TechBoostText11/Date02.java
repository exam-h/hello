package TechBoostText11;

import java.time.LocalDate;
import java.time.Month;


public class Date02{
	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2006,11,17);
		System.out.println(ld);
		ld = LocalDate.of(2016, Month.NOVEMBER, 24);
		System.out.println(ld);
	}
}
