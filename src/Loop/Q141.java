package Loop;
public class Q141 {
    public static void main(String[] args) {
        int cnt = 0;
        final int ns = 20000;
        for (double x = 0; x < ns; x++) {
            for (double y = 0; y < ns; y++) {
                if (x / (double) (ns - 1) * x / (double) (ns - 1) + y / (double) (ns - 1) * y / (double) (ns - 1) <= 1D) {
                    cnt++;
                }
            }
        }
        System.out.println((double) cnt / ((double) ns * (double) ns) * 4D);
    }
}