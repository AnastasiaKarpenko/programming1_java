import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        int result = random.nextInt(numberOfSides) + 1;
        return result;
    }
}
