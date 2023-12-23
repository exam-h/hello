package Hokou2ArgoRythm;

public class Main244 {
	public static void main(String[] args) {
		int[] data = {5, 1, 2, 8, 55, 13, 21, 34, 89, 3};

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}