package Statics;

public class Q01 {
	public static double getRectangleArea(double width, double height) {
			  // 長方形の面積を計算する
			  double area = width * height;
			  // 計算した面積を返す
			  return area;
			};
		
	public static void main(String[] args) {
		System.out.println(getRectangleArea(10,10));
	}
}