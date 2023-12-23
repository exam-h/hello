package LocalTimeAndEnum;
public class Main228{
	public static void main(String[] args) {	
		Coffee coffee = new Coffee(CupSize.GRANDE);
			
//Coffee coffee2 = new Coffee(CupSize.Large);//   列挙された以外のサイズは存在し得ないことになる
//Coffee coffee3 = new Coffee(CupSize.GRANDEE);//   またスペルミスにも早期に気づくことができる
		System.out.println(coffee.getPrice());
	}
}	