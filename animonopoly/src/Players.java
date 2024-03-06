import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Players {
    int money;
    String playingPiece;
    String name;
    boolean nextMoveIsAvailable;
    public Players(String nameInput, String playingPieceInput) {
        money = 1000;
        nextMoveIsAvailable = true;
        name = nameInput;
        playingPiece = playingPieceInput;
    }

    public void bankruptcyCheck() {
    }

    public void missAGo() {
    }

    public void announceName() {
        System.out.println("____________________________________\nPlayer " + name + "'s turn.");
    }

    public boolean isNextMoveIsAvailable() {
        return nextMoveIsAvailable;
    }

    public String getPlayingPiece() {
        return playingPiece;
    }

    public String getName() {
        return name;
    }

    public void winCheck() {
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
