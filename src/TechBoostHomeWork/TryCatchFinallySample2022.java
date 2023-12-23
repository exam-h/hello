package TechBoostHomeWork;
public class TryCatchFinallySample2022{
	public static void main(String[] args) {
		try {
			Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("catch");
		} finally{
			System.out.println("finally");
		}
	}
}