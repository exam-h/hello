package TechBoostText11;

import java.util.ArrayList;
public class Sequenced01{
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList);
		
		// 最初の要素に 10 を追加
		arrayList.add(10);
		System.out.println(arrayList); // [10]
		arrayList.addFirst(3);
        System.out.println(arrayList); // [3, 10]
	}
}
