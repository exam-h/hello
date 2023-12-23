package LocalTimeAndEnum;

public class Enum{
	enum Color {
		RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);

		private int red;
		private int green;
		private int blue;

		private Color(int red, int green, int blue) {
			this.red = red;
			this.green = green;
			this.blue = blue;
		}
		 
		public int getRed() {
			return red;
		}
		
		public int getGreen() {
			return green;
		}
		public int getBlue() {
			return blue;
		}
	}
}