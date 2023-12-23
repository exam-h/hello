package Joukenbunki;
public class Q09 {
	public static void main(String[] args) {
        int score = (int) (Math.random() * 101);
        System.out.println(score);
        if (score <= 49) {
            System.out.println("点数は20点以上49点以下です");
        } else if (score <= 19) {
            System.out.println("19点以下です");
        } else if (score <= 79) {
            System.out.println("点数は50点以上79点以下です");
        } else {
            System.out.println("点数は80点以上です");
        }
    }
}