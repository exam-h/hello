package TechBoostText11;

import java.util.ArrayList;
import java.util.List;

public class Tb000 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("item");

		// 要素を取り出す際、String型へのキャストが不要
	
		System.out.println(list.get(0));
	}

}
