package ArrayList;
import java.util.ArrayList;
public class Main217 {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("alice");
		names.add("bob");
		names.add("chris");

		for (String str : names) {
			if (str.equals("alice")) {
				names.remove(str);
			}
		}
		System.out.println(names.toString());
	}
}