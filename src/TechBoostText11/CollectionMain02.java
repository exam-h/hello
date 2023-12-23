package TechBoostText11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionMain02{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("青", "赤", "黄");
		// Streamの取得
		Stream<String> stream = list.stream();		
		// Streamの終端操作であるforEachを利用して、
		//stream内の全ての要素を出力する（メソッド参照版）
		stream.forEach(s -> System.out.println(s));
	}
}
