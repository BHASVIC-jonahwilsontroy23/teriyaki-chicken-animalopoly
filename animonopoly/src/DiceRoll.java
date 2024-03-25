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
    String text = "You got " + firstDice + " and " + secondDice + ".";
    if (firstDice == secondDice)
    {
        text = text + "\nDouble! You get a card!";
    }
        gameBoard.setGUIConsoleText(text);

    }

}
