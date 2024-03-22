//package animonopoly.src;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll
{
    GameBoard gameBoard;
    public DiceRoll(GameBoard gameBoard1) {
        gameBoard = gameBoard1;
    }
    public void roll() {
    Random random = new Random();

    int firstDice = random.nextInt(6) + 1;
    int secondDice = random.nextInt(6) + 1;

    gameBoard.setGUIConsoleText("You got " + firstDice + " and " + secondDice + ".");
    if (firstDice == secondDice)
    {
        System.out.println("Double! You get a card!");
    }
}

}
