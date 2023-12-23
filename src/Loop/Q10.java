package Loop;
public class Q10 {
	public static void main(String[] args){
		/* if(args.length == 0){
		return;
		}*/
		//int max = Integer.parseInt(args[0]);
		int max = 99;
		String result = null;
		for(int i = 0; i<max;i++){
			int num =i + 1;
			result = "";
			if(num % 3 == 0) {
				result = result + "Hoge";
			}
			if(num % 5 == 0){
				result = result + "Huga";
			}
			if(result.length() == 0){
				result = result + num;
			}
			System.out.print(result +" ");
			}
		}
	}