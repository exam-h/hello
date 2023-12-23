package Statics;

public class Q18 {
	public static void main(String[] args) {
        int[] iscores = {60, 53, 5, 68, 82, 70, 83, 12, 3, 72, 38, 68, 92, 15, 92, 48, 13, 14, 80};
        double[] dweights = {54.7, 86.1, 82.5, 65.4, 98.9, 75.2, 81.9, 58.9, 94.4, 91.9, 90.9, 88.3, 76.8, 57.3, 68.1, 69.7, 58.6, 99.5, 93.9};
        int sumI = sum(iscores);
        double sumD = sum(dweights);
        System.out.println("スコア合計：" + sumI);
        System.out.println("体重合計：" + sumD);
    }

    public static int sum(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static double sum(double[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }
}
