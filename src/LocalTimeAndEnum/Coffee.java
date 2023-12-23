package LocalTimeAndEnum;

public class Coffee{
	private CupSize cupSize;
	public Coffee(CupSize cupSize) {
		this.cupSize = cupSize;
	}
	public String getPrice() {
		switch (this.cupSize) { 
		case SHORT:
			return "280円です";
		case TALL:
			return "320円です";
		case GRANDE:
			return "360円です";
		case VENTI:
			return "400円です";
		default:
			return "もう一度ご注文をお願いします。";
		}
	}
}