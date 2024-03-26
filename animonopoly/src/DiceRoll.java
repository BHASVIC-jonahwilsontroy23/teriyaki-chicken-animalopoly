//package animonopoly.src;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll
{
    GameBoard gameBoard;
    int firstDice;
    int secondDice;
    public DiceRoll(GameBoard gameBoard1) {
        gameBoard = gameBoard1;
    }

    public void roll() {
    Random random = new Random();

    firstDice = random.nextInt(6) + 1;
    secondDice = random.nextInt(6) + 1;
    String text = gameBoard.getGUIConsoleText() + "\nRolling dice\nYou got " + firstDice + " and " + secondDice + ".";
    if (firstDice == secondDice)
    {
        text = text + "\nDouble! You get a card!";
    }
        gameBoard.setGUIConsoleText(text);

    }
    public int getFirstDice() {
        return firstDice;
    }

    public int getSecondDice() {
        return secondDice;
    }
}
