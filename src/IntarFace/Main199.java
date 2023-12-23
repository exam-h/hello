package IntarFace;

public class Main199 {

	public static void main(String[] args) {
		Comparable[]c = {new Integer(10), new Integer(20), new Integer(1500), new Integer(202)};
		Comparable max = c[0];
		for (int i = 0;i < c.length - 1; i++) {
			if (max.compareTo(c[i + 1]) < 0) {
				max = c[i + 1];
			}
		}
		System.out.println(max);
	}
}