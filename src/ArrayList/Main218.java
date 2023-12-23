package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class Main218 {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("alice");
		names.add("bob");
		names.add("chris");

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.equals("alice")) {
				iterator.remove();
			}
		}
		System.out.println(names.toString());
	}
}	