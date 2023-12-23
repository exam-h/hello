package Mojiretsu;

public class Q01 {
	public static void main(String args[]) {
		int stringLength;
		String s = "さみだれをあつめてはやしもがみがわ";
        
		stringLength = s.length();
		if (stringLength > 17) {
			System.out.println("字余りです。");
		} else if (stringLength < 17) {
			System.out.println("字足らずです");
		}else {
			System.out.println("ちょうど17文字です。");
		}
	}
}