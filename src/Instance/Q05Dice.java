package Instance;
import java.util.Random;
public class Q05Dice {
    private int sides;
    private Random random;

    public Q05Dice() {
        this.sides = 6;
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(sides) + 1;
    }
}