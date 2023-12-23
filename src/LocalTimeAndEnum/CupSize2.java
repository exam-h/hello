package LocalTimeAndEnum;

public enum CupSize2 {
    SHORT(240),
    TALL(350),
    GRANDE(470),
    VENTI(590);

    private final int price;

    private CupSize2(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}