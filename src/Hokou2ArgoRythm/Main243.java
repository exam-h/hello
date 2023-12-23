package Hokou2ArgoRythm;

public class Main243 {
	public static void main(String[] args) {
		int a = 1;
        int b = 2;
        System.out.println(a + ":" + b);

        int c = b;
         b = a;
         a = c;
        
        System.out.println(a + ":" + b);
    }
}