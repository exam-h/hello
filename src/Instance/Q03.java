package Instance;

public class Q03 {
	public static void main(String[] args) {
		Q03StatisticsCalculator s = new Q03StatisticsCalculator(new double[]{19.8, 33.4, 95.32, 644.2});
		System.out.println(s.getSum());
		System.out.println(s.getAverage());
		System.out.println(s.getMax());
		System.out.println(s.getMin());
	}
}