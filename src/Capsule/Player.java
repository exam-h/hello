
package Capsule;

public class Player {
	
	private int balance = 1000;
		
	public void withdraw(int amount) {
		if(( balance - amount) < 0) {
			System.out.println("残高不足です");
		}else{
			balance -= amount;
			System.out.println("現在の残高です：" + balance);
		}
	}
}