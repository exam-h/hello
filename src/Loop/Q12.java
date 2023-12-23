package Loop;
public class Q12 {
	public static void main(String[] args) {
		double thickness = 0.0001; // meters
        double distanceToMoon = 384400000.0; // meters
        long numFolds = 0;
        while (thickness < distanceToMoon) {
            thickness *= 2;
            numFolds++;
        }
        System.out.println("0.1㎜の紙を" + numFolds + "回折ることで月に到達できます。 " );
        System.out.println("その時の紙の厚さは " + thickness + "です。");
    }
}