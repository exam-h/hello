package Joukenbunki;
public class Q06 {
	public static void main(String[] args) {
		int year = 2100; 
		 
		if(year % 4 != 0){
			System.out.println(year + "年はうるう年ではありません");
		}else if(year % 100 != 0){
		    System.out.println(year + "年はうるう年です");
		}else if(year % 400 != 0){
		    System.out.println(year + "年はうるう年ではありません");
		}else{
		    System.out.println(year + "年はうるう年です");
		}
	}		 
}