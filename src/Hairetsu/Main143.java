package Hairetsu;

public class Main143 {
	
	public static void main(String[] args) {
		int[] [] scores = {
			{10,20,30,40},
			{50,60,70,80},
			{90,10,20,30},};
		System.out.println(scores[0][3]);
		System.out.println(scores[2][3]);
		
		for (int[] score :scores) {
			for (int i : score) {
				System.out.println(i + ",");
			}
		}
	}
}