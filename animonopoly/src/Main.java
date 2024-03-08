import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animals Penguin = new Animals(1,100,1,100,"Penguin");
        Animals Polar_Bear = new Animals(2,100,1,100,"Penguin");
        Animals Seal = new Animals(3,125,1,100,"Penguin");

        GameBoard gameBoard = new GameBoard();
        Board board = new Board(); //this is our only board.




        Scanner scan = new Scanner(System.in);
        System.out.println("**This is an example input**\nenter player 1's name: ");
        System.out.println("[1] option 1");
        System.out.println("[2] option 2");
        System.out.println("[3] option 3");
        System.out.println("[4] option 4");
        String input = scan.nextLine();
        System.out.println(input);
    }

}