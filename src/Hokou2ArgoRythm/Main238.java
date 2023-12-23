package Hokou2ArgoRythm;
import java.util.Scanner;

public class Main238 {
	public static void main(String[] args) {
		int[] dataset = {5, 1, 2, 8, 55, 13, 21, 34, 89, 3};
		Scanner scanner = new Scanner(System.in);
		System.out.print("検索する値を入力してください: ");
		int target = scanner.nextInt();
		scanner.close();
		int index = linearSearch(dataset, target);
		if (index == -1) {
			System.out.println(target + " は見つかりませんでした。");
		} else {
			System.out.println(target + " は、" + index + " 番目に見つかりました。");
		}
	}

	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}