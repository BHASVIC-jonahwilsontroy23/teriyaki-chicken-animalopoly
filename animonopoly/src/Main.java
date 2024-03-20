import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        // Instantiate all animals
    public static void main(String[] args) {

        Board board = new Board(); //this is our only board.

        /*



        Scanner scan = new Scanner(System.in);
        System.out.println("**This is an example input**\nenter player 1's name: ");
        System.out.println("[1] option 1");
        System.out.println("[2] option 2");
        System.out.println("[3] option 3");
        System.out.println("[4] option 4");
        String input = scan.nextLine();
        System.out.println(input);
        */
        while (1 == 1) {
            int playerscount = board.playersArray.length + 1;
            for (int i = 0; i < playerscount; i++) {

                if (board.playersArray[i].bankruptcyCheck() == false) {
                    System.out.println("Player "+i+", it is your turn.");
                    Scanner scan = new Scanner(System.in);
                    int roll = 2;
                    while (roll != 1) {
                        System.out.println("1 to roll dice.");
                        roll = Integer.parseInt(scan.nextLine());
                        if (roll == 1) {
                            //roll dice
                        }
                        if (roll != 1) {
                            System.out.println("Enter 1 to start.");
                        }
                    }
                }
            }
        }
    }
}