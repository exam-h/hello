package Mojiretsu;

public class Q07 {
	public static void main(String args[]) {
		String csv = "1,111-1111,愛知県名古屋市,山田太郎,090-999-99XX";
		String tsv = null;
		//ここにコードを書く
		// カンマをタブに置き換える
		tsv = csv.replace(",", "\t");
		System.out.println(csv);
		System.out.println(tsv);
	}
}