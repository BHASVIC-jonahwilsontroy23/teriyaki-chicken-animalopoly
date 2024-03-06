import java.util.Random;
public class Dice {
    public static void main(String[] args) {
        System.out.println("")
        Random random = new Random();
        int result = random.nextInt(6) +1;
        System.out.println("The dice rolled: " + result);
    }
}
