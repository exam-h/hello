package Mojiretsu;
public class Q08 {
	public static void main(String args[]) {
		final int COUNT = 10_000;
		String result = null;
		String st = "";
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < COUNT; i++) {
			String str = Integer.toString(i);
			st += str;
		}
		long endTime = System.currentTimeMillis();
		long sTime = endTime - startTime;
	
		StringBuilder sb = new StringBuilder();

		startTime = System.currentTimeMillis();

		for (int j = 0; j < COUNT; j++) {
			sb.append(Integer.toString(j));
		}
		endTime = System.currentTimeMillis();
		long sbTime = endTime - startTime;
			
		System.out.println(st);
		System.out.println("Stringを使った文字列の結合：" + sTime + "ミリ秒");

		System.out.println(sb);
		System.out.println("StringBuilderを使った文字列の結合 " + sbTime + "ミリ秒");
	}
}
