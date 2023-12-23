package Statics;

public class Q19 {
	public static void main(String[] args) {
        int num = 1;
        System.out.println(num);
        local();
        System.out.println(num);
    }

    static void local() {
        int num = 2;
        System.out.println(num);
    }
}