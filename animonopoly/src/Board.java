import java.util.ArrayList;
import java.util.Scanner;
public class Board {
    int playersRemaining;
    int userInput;
    public Board() {
        Scanner scan = new Scanner(System.in);
        initialisePlayers();

    }


    public void initialisePlayers() {
        System.out.println(">Initialising players");
        ArrayList<Players> players = new ArrayList<>();
        Players[] playersArray;

        Scanner scan = new Scanner(System.in);
        System.out.println("How many players will be playing?");
        int desiredPlayerCount = scan.nextInt();
        playersArray = new Players[desiredPlayerCount];

        for (int i=0; i<desiredPlayerCount; i++) {
            System.out.println("For player " + (i+1) + ":");
            System.out.println("Enter your name: ");
            String nameInput = scan.nextLine();
            scan.nextLine();
            System.out.println("Enter your playing piece (A few unique characters, be creative!): ");
            String playingPieceInput = scan.nextLine();


            playersArray[i] = new Players(nameInput, playingPieceInput);
            playersArray[i].announceName();

        }
        //players.add(new Players(nameInput));

        //board:
        //instantiate a dice object
        //keep track of turns, and display player's name with player.announceName();

    }


}
