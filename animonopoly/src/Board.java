import java.util.ArrayList;
import java.util.Scanner;
public class Board {
    int playersRemaining;
    int userInput;
    Players[] playersArray;

    public Board() {
        Scanner scan = new Scanner(System.in);
        Dice die = new Dice();
        initialisePlayers();

    }


    public void initialisePlayers() {
        System.out.println(">Initialising players");
        ArrayList<Players> players = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int desiredPlayerCount;
        while (true) {
            System.out.println("How many players will be playing? (2-8)");
            desiredPlayerCount = scan.nextInt();
            if (desiredPlayerCount <= 8 && desiredPlayerCount >= 2) {
                break;
            } else {
                System.out.println(">Input is invalid");
            }
        }

        playersArray = new Players[desiredPlayerCount];

        for (int i=0; i<desiredPlayerCount; i++) {
            System.out.println("_____________________________");
            System.out.println("For player " + (i+1) + ":");

            String nameInput;
            while (true) {
                System.out.println("Enter your name (<20 characters & unique): ");
                nameInput = scan.nextLine(); //not actually redundant.
                nameInput = scan.nextLine();
                if (playerInfoInputIsValid(nameInput, 0)) {
                    System.out.println(">Input accepted");
                    break;
                } else {
                    System.out.println(">Input is invalid");
                }
            }

            String playingPieceInput;
            while (true) {
                System.out.println("Enter your playing piece (<4 characters & be creative!): ");
                playingPieceInput = scan.nextLine();
                if (playerInfoInputIsValid(playingPieceInput, 1)) {
                    System.out.println(">Input accepted");
                    break;
                } else {
                    System.out.println(">Input not accepted. above the ");
                }
            }

            playersArray[i] = new Players(nameInput, playingPieceInput);
            System.out.println("Your name is now: " + playersArray[i].getName() + "\nAnd your piece is: " + playersArray[i].getPlayingPiece());

        }
        //players.add(new Players(nameInput));

        //board:
        //instantiate a dice object
        //keep track of turns, and display player's name with player.announceName();

    }

    public boolean playerInfoInputIsValid(String theInput, int nameOrPiece) {
        boolean flag = true;
        if (nameOrPiece == 0) {

            for (Players players : playersArray) {
                if (theInput.equals(players.name)) {
                    flag = false;
                    break;
                }
            }
            if (theInput.length() > 20) {
                flag = false;
            }

        } else {
            for (Players players : playersArray) {
                if (theInput.equals(players.playingPiece)) {
                    flag = false;
                    break;
                }
            }
            if (theInput.length() > 3) {
                flag = false;
            }
        }

        return flag;
    } //used in player initialisation


}
