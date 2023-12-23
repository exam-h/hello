package LocalTimeAndEnum;

public class Main229{
	public static void main(String[] args) {
		CupSize2[] cupsizes = CupSize2.values();
		
		for(CupSize2 cupsize : cupsizes) {
			 System.out.println(cupsize + ":" + cupsize.getPrice());
		}
	}
}