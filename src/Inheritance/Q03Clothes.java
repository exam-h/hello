package Inheritance;

public class Q03Clothes extends Q03Goods{
	private String color;
	private String size;
	
	public Q03Clothes(String name, int price, String color, String size) {
		super(name, price);
		this.color = color;
		this.size = size;
	}

	@Override
	public void show(){
		System.out.println("商品名" + this.name + "価格" + this.price + "色" + this.color + "価格" + this.size);
	}
}	