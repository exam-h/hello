package Inheritance;

public class Q04Goods {
	protected String name; //商品名
	protected int price; //価格
	
	public Q04Goods(String name , int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
			if (obj instanceof Q04Goods) {
			//objをGoods2クラスにキャストする
			Q04Goods other = (Q04Goods) obj;
		
			return other.name.equals(this.name);
		}
		
		return false;
	}
}