package Inheritance;
class Q01Computer extends Q01Goods{
	private String osType;
	private int memory;
	
	public Q01Computer(String name, int price, String osType, int memory) {
		super(name, price);
		this.osType = osType;
		this.memory = memory ;
		
	}
	

	public void show(){
		System.out.println("商品名" + this.name + "価格" + this.price + "Osタイプ" + this.osType + "容量" + this.memory);
	}
}
