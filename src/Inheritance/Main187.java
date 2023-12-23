package Inheritance;

public class Main187 {

	public static void main(String[] args) {
		Object[] vs = { new Car4(), new PropellerPlane(), new String() };
		for (Object v : vs) {
			if(v instanceof Car4) {
				Car4 c = (Car4) v;
				c.run();
			}else if(v instanceof PropellerPlane) {
			PropellerPlane p = (PropellerPlane) v;
			p.run();
			}else{
			System.out.println("想定していないクラスです");
			}
		}
	}
}