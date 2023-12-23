package Enzanshi;
public class Q14 {
	
	public static void main(String[] args) {
		int origin_sec = 86900, min, hour, sec;
			min =  500 / 60;
			hour=  86900 / 3600;
			sec =  500 % 60;

	        System.out.println(origin_sec + "秒は" + hour + "時間" + min + "分" + sec + "秒");
	 }
}
