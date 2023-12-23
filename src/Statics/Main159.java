package Statics;

public class Main159 {

    public static void method() {
        System.out.println("引数なしのmethodが呼ばれました。");
    }

    public static void method(int i) {
        System.out.println("引数にint型をとるmethodが呼ばれ" + i + "を受け取りました。");
    }

    public static void method(double d) {
        System.out.println("引数にdouble型をとるmethodが呼ばれ" + d + "を受け取りました。");
    }

    public static void method(String s) {
        System.out.println("引数に文字列型をとるmethodが呼ばれ" + s + "を受け取りました。");
    }

    public static void main(String[] args) {
        method();
        method(2);
        method(3.14);
        method("Goodby.");
    }
}