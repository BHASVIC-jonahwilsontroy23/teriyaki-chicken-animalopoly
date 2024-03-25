import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Players {
    int money;
    String playingPiece;
    String name;
    Board board;
    int location;

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    boolean nextMoveIsAvailable;

    public Players(String nameInput, String playingPieceInput, Board boardInput) {
        money = 1000;
        nextMoveIsAvailable = true;
        name = nameInput;
        playingPiece = playingPieceInput;
        board = boardInput;
    }

    public boolean bankruptcyCheck() {
        return (money <= 0);
    }

    public void missAGo() {
         nextMoveIsAvailable = false;
    } //we need a way to make this true after they've missed their go.

    public void announceName() {
        System.out.println("____________    ________________________\n>Player " + name + "'s turn.");
    }

    public boolean isNextMoveIsAvailable() {
        if (!nextMoveIsAvailable) {
            nextMoveIsAvailable = true;
            return false;
        }
        return true;
    }

    public boolean winCheck() {
        return (money > 0 && board.playersRemaining == 1);
    }

    public String getPlayingPiece() {
        return playingPiece;
    }
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
}
