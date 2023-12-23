package Inheritance;

public class Q03 {
	public static void main(String[] args) {
        Q03Goods[] g = {
            new Q03Goods("ハンカチ", 750),
            new Q03Computer("パソコンA", 100000, "Win2004", 256),
            new Q03Computer("パソコンB", 150000, "WinYP", 516),
            new Q03Clothes("Jeans390", 4000, "青", "LL")};

        int total = 0;

        for (int i = 0; i < g.length; i++) {
            g[i].show();
            total += g[i].getPrice();
        }
        System.out.println("----------------------------");
        System.out.println("合計金額：" + total + "円");
    }
}