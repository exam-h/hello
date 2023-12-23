package Hokou2ArgoRythm;
import java.util.Scanner;
public class Main241 {
	public static void main(String[] args) {
		// ハッシュテーブルを作成
		int[] hashTable = new int[5];

		// データをハッシュテーブルに格納（オープンアドレス法）
		int[] dataset = { 1, 2, 3, 5, 8 };
		for (int i = 0; i < dataset.length; i++) {
			int key = dataset[i] % 5;
			while (hashTable[key] != 0) {
				key = (key + 1) % 5;
			}
			hashTable[key] = dataset[i];
		}

		// ハッシュテーブルを表示
		System.out.println("ハッシュテーブル:");
		for (int i = 0; i < hashTable.length; i++) {
			System.out.println("キー: " + i + ", 値: " + hashTable[i]);
		}

		// ハッシュテーブルからデータを検索
		Scanner scanner = new Scanner(System.in);
		System.out.print("検索する値を入力してください: ");
		int searchValue = scanner.nextInt();
		scanner.close();
		int searchKey = searchValue % 5;
		while (hashTable[searchKey] != searchValue) {
			searchKey = (searchKey + 1) % 5;
		}
		int value = hashTable[searchKey];
		System.out.println(searchKey + "番目の配列に" + value + "が見つかりました。");
	}
}