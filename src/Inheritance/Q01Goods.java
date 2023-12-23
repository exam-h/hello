package Inheritance;
public class Q01Goods {
	protected String name; //商品名
	protected int price; //価格
	
	public Q01Goods(String name , int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void show(){
		System.out.println("商品名" + this.name + "価格" + this.price);
	}
	
}