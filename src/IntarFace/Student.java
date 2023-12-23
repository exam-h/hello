package IntarFace;
public class Student implements Comparable {
	int age;
	int height;
	public Student(int age, int height) {
		this.age = age;
		this.height = height;
	}

	@Override
	public int compareTo(Object anotherStudent) {
		Student as = (Student) anotherStudent;
		return this.height - as.height;
	}

	@Override
	public String toString() {
		return "Student{" + "年齢=" + age + ", 身長=" + height + "}";
	}
}