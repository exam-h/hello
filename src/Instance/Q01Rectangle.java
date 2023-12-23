package Instance;

public class Q01Rectangle {
	private double width; // 幅
	private double height; // 高さ
	public  Q01Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getRectangularArea() {
		return width * height;
	}
}