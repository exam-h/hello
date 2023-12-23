package Loop;
public class Q13 {
	 public static void main(String[] args) {
		 long base = 2; 
		 int exponent = 32; 
		 long result = 1; 
		 for (int i = 0; i < exponent; i++) { 
			 result = result * base; 
		 }
		 System.out.println(Integer.MAX_VALUE);
		 System.out.println(base + "の" + exponent + "乗は" + result + "です。");
	 }
}
