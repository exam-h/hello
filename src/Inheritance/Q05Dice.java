package Inheritance;

public class Q05Dice {
	private static final int FACE = 6; //面の数を保持する
	private int num; //出目を保持する
	public Q05Dice() {
		super();
	}
	public int getNum() {
		return num;
	}
	
	public void rollTheDice() {
		num = nextInt();
		System.out.println();
	}
	@Override
	private int nextInt() {
		int random = super.nextInt(FACE);
		
		random++;
		return random;
	
	}
}
