package animonopoly.src;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char choice;

        do
        {
            System.out.println("Do you want to roll the dice? (C to confirm)");
            choice = scanner.next().charAt(0);
            choice = Character.toUpperCase(choice);
        }
        while (choice != 'C');

        int firstDice = random.nextInt(6) + 1;
        int secondDice = random.nextInt(6) + 1;

        System.out.println("You got " + firstDice + " and " + secondDice + ".");

        if (firstDice == secondDice)
        {
            System.out.println("Double! You get a card!");
        }
    }
}
