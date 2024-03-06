import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Players {
    int money;
    String playingPiece;
    String name;
    boolean nextMoveIsAvailable;
    public Players() {
        money = 1000;
        nextMoveIsAvailable = true;
    }

    public void bankruptcyCheck() {
    }

    public void missAGo() {
    }

    public void announceName() {
        System.out.println("____________________________________\nPlayer " + name + "'s turn.");
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
