package Hokou2ArgoRythm;
import java.util.Arrays;
import java.util.Scanner;
public class Main240 {
	public static void main(String[] args) {
        int[] data = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("検索する値を入力してください: ");
        int target = scanner.nextInt();
        scanner.close();
        int index = Arrays.binarySearch(data, target);
        if (index < 0) {
            System.out.println(target + " は見つかりませんでした。");
        } else {
            System.out.println(target + " は、" + index + " 番目に見つかりました。");
        }
    }
}