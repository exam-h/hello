package Inheritance;
class Q04Computer extends Q04Goods{
	private String osType;
	private int memory;
	
	public Q04Computer(String name, int price, String osType, int memory) {
		super(name, price);
		this.osType = osType;
		this.memory = memory ;
		
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if (obj instanceof Q04Goods) {
			Q04Goods other = (Q04Goods) obj;
			return other.name.equals(this.name);
		}
		return false;
	}
}