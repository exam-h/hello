package Mojiretsu;

public class Main149 {
	public static void main(String[] args) {
		String str = "新人エンジニアのためのJava研修";
		
		System.out.println(str.length() + "\n");
		
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("Python") + "\n");
		
		System.out.println(str.contains("研修"));
		System.out.println(str.contains("Python") + "\n");
		
		String str2 = str.replace("エンジニア","SE");
		System.out.println(str2);
	}
}