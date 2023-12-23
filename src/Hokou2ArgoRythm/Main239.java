package Hokou2ArgoRythm;
import java.util.Scanner;

public class Main239 {
	public static void main(String[] args) {
        int[] dataset = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("検索する値を入力してください: ");
        int target = scanner.nextInt();
        int index = binarySearch(dataset, target);
        if (index == -1) {
            System.out.println(target + " は見つかりませんでした。");
        } else {
            System.out.println(target + " は、" + index + " 番目に見つかりました。");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}