package Hokou2ArgoRythm;
import java.util.Arrays;
public class Main242 {
	public static void main(String[] args) {
		int[] data = {5, 1, 2, 8, 55, 13, 21, 34, 89, 3};
        Arrays.sort(data);

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}