package ArrayList;
import java.util.ArrayList;
public class Main213 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(1);
		list.add("文字列");
		int num = (Integer) list.get(0);
		String str = (String) list.get(1);
		System.out.println(num);
		System.out.println(str);
	}
}