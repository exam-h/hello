package Inheritance;

class Q03Computer extends Q03Goods{
	private String osType;
	private int memory;
	
	public Q03Computer(String name, int price, String osType, int memory) {
		super(name, price);
		this.osType = osType;
		this.memory = memory ;
		
	}
	
	@Override
	public void show(){
		System.out.println("商品名" + this.name + "価格" + this.price + "Osタイプ" + this.osType + "容量" + this.memory);
	}
}	