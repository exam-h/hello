package IntarFace;

public class Main200 {

	public static void main(String[] args) {
		Comparable[]c = {new Student(29, 173), new Student(33, 169), new Student(30, 180), new Student(25, 175)};
		Student max = (Student) c[0];
		for (int i = 0;i < c.length - 1; i++) {
			if (max.compareTo(c[i + 1]) < 0) {
				max = (Student)c[i + 1];
			}
		}
		System.out.println(max);
	}
}