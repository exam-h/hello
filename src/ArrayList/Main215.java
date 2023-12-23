package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Main215{
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("pencil", 100));
		list.add(new Product("eraser", 60));
		list.add(new Product("note", 80));
		for (Product product : list) {
			System.out.println(product);
		}
	}
}