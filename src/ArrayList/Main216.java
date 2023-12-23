package ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main216 {
	
	public static void main(String[] args) {

		List<Product> list1 = new ArrayList<>();
		long startTime, endTime;
		
		for (int i = 0; i < 10_000; i++) {
			list1.add(new Product("pencil", 100));
		}

		startTime = System.nanoTime();
		for (int i = 0; i < 5_000; i++) {
			list1.remove(0);
		}
		endTime = System.nanoTime();

		System.out.printf("%s%,7d%s", "ArrayListからの削除\t",(endTime - startTime), "ナノ秒かかりました");

		System.out.println("");

		List<Product> list2 = new LinkedList<>(list1);
		startTime = System.nanoTime();
		for (int i = 0; i < 5_000; i++) {
        	list2.remove(0);
		}
		endTime = System.nanoTime();

		System.out.printf("%s%,9d%s", "LinkedListからの削除\t",(endTime - startTime), "ナノ秒かかりました");
	}
}	