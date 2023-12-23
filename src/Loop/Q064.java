package Loop;
public class Q064 {
	public static void main(String[] args) {
		int sum = 0;
        int i = 1;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("1から100までの合計は" + sum );
    }
}
