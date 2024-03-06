import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {   //initialises the GUI
        SwingUtilities.invokeLater(() -> {
            GameBoard gui = new GameBoard();
            gui.setVisible(true);
        });

        Board board = new Board(); //this is our only board.





        System.out.println("Hello world!");
        //instantiate a board object
        //instantiate player objects in an array
        ArrayList<Players> players = new ArrayList<>();
        String nameInput = "test Name";
        //players.add(new Players(nameInput));

        //board:
            //instantiate a dice object
            //keep track of turns, and display player's name with player.announceName();

        Scanner scan = new Scanner(System.in);
        System.out.println("**This is an example input**\nenter player 1's name: ");
        System.out.println("[1] option 1");
        System.out.println("[2] option 2");
        System.out.println("[3] option 3");
        System.out.println("[4] option 4");
        String input = scan.nextLine();
        System.out.println(input);

        //testing a player's method:
        Players player1 = new Players();
        player1.name = input;
        player1.announceName();


        //end
    }
}