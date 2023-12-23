package Inheritance;

public class Q04 {
	public static void main(String[] args) {
		Q04Goods g1 = new Q04Computer("winn", 100, "x1", 256);
		Q04Goods g2 = new Q04Computer("winn", 100, "x1", 512);
		Q04Goods g3 = new Q04Computer("muc", 100, "x1", 256);

		System.out.println(g1.equals(g2));
		System.out.println(g1.equals(g3));
    }
}