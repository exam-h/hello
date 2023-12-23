package Hokou1ChushouClass;
public class Main234{
	public static void main(String[] args) {
		Main234AbstractHuman1[] ah = {new Main234NormalPlayer1(), new Main234VipPlayer1() };
		for (Main234AbstractHuman1 ah1 : ah) {
			ah1.play();
		}
	}
}