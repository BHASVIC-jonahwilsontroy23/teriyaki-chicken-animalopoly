import java.util.ArrayList;
import java.util.Scanner;
public class Board {
    int playersRemaining;

    Players[] playersArray; //2-8 players
    public Board() {
        Scanner scan = new Scanner(System.in);
        Dice die = new Dice();
        initialisePlayers();

    }


    public void initialisePlayers() {
        System.out.println(">Initialising players");
        ArrayList<Players> players = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int desiredPlayerCount = getDesiredPlayerCount();

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
                    System.out.println(">Input not accepted");
                }
            }

            playersArray[i] = new Players(nameInput, playingPieceInput, this);
            System.out.println("Your name is now: " + playersArray[i].getName() + "\nAnd your piece is: " + playersArray[i].getPlayingPiece());

        }

        //board:
        //instantiate a dice object
        //keep track of turns, and display player's name with player.announceName();

    }

    public boolean playerInfoInputIsValid(String theInput, int nameOrPiece) {
        boolean flag = true;
            if (nameOrPiece == 0) {
                for (Players players : playersArray) {
                    if (players != null) {
                        if (theInput.equals(players.getName())) {
                        flag = false;
                        break;
                        }
                    }
                }
                if (theInput.length() > 20) {
                    flag = false;
                }
            } else {
                for (Players players : playersArray) {
                    if (players != null) {
                    if (theInput.equals(players.getPlayingPiece())) {
                        flag = false;
                        break;
                    }
                }
            }
                if (theInput.length() > 3) {
                    flag = false;
                }
            }
        return flag;
    } //used in player initialisation

    public int getPlayersRemaining() {
        return playersRemaining;
    }

    public int getDesiredPlayerCount() {
        Scanner scan = new Scanner(System.in);
        int desiredPlayerCount = 0;
        while (true) {
            System.out.println("How many players will be playing? (2-8)");
            try {


                    desiredPlayerCount = Integer.parseInt(scan.nextLine());

                    if (desiredPlayerCount <= 8 && desiredPlayerCount >= 2) {
                        break;
                    } else {
                        System.out.println(">Invalid input value");
                    }



            } catch (NumberFormatException e) {
                System.out.println(">Invalid input format");
            }
        }

        return desiredPlayerCount;
    }

}
