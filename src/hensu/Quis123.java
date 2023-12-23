package hensu;

import java.util.Scanner;
public class Quis123 {
    public static void main(String[] args) {
    	 Scanner stdIn = new Scanner(System.in);
    	 
        System.out.println("入力された税込み価格を税抜き価格で表示します。");
        System.out.println("計算したい金額を入力してください。0を入力すると計算を終了します。\n");
     
        final double tax = 1.1; // 税率を定義する
        int price;
        int tax_include = 0; // 税込み価格の合計
        double tax_exclude = 0; // 税抜き価格
        int sum = 0; // 税抜き価格の合計
     
        do {
          price = stdIn.nextInt();
          if (price != 0) { // 0以外の場合
            tax_include += price;
            tax_exclude = Math.ceil(price / tax);
            System.out.println("上記の税抜き価格は" + (int)tax_exclude + "円です。");
            System.out.println("-----------------------------");
            sum += tax_exclude;
          } else { // 0の場合
            System.out.println("終了します。");
            System.out.println("-----------------------------");
          }
        } while (price != 0); // 入力された内容が0の場合は処理を終了する
     
        System.out.println("税込み価格の合計値は" + tax_include + "円です。");
        System.out.println("税抜き価格の合計値は" + sum + "円です。\n");
      }
    }