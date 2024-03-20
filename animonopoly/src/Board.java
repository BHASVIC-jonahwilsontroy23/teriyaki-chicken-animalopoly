import java.util.ArrayList;
import java.util.Scanner;
public class Board {
    int playersRemaining;

    Players[] playersArray; //2-8 players

    public Board() {
        Scanner scan = new Scanner(System.in);
        Dice die = new Dice();
        initialiseAnimals();
        GameBoard gameBoard = new GameBoard(this);
        initialisePlayers();

    }
    Animals[] animalArray = new Animals[26];
    public void initialiseAnimals(){
        animalArray[0] = new Animals(-1,-1,-1,-1,"");
        animalArray[1] = new Animals(2,100,1,100,"Polar_Bear");
        animalArray[2] = new Animals(3,125,1,125,"Seal");
        animalArray[3] = new Animals(4,250,2,300,"Dog");
        animalArray[4] = new Animals(5,300,2,400,"Cat");
        animalArray[5] = new Animals(6,150,3,150,"Clownfish");
        animalArray[6] = new Animals(7,150,3,150,"Catfish");
        animalArray[7] = new Animals(8,150,3,150,"Dogfish");
        animalArray[8] = new Animals(9,75,4,50,"Sheep");
        animalArray[9] = new Animals(10,75,4,50,"Cow");
        animalArray[10] = new Animals(11,125,5,125,"Rabbit");
        animalArray[11] = new Animals(12,125,5,125,"Guinea Pig");
        animalArray[12] = new Animals(14,125,5,125,"Hamster");
        animalArray[13] = new Animals(-1,-1,-1,-1,"");
        animalArray[14] = new Animals(16,200,6,250,"Gecko");
        animalArray[15] = new Animals(17,200,6,250,"Bearded Dragon");
        animalArray[16] = new Animals(18,125,7,125,"Ant");
        animalArray[17] = new Animals(19,150,7,150,"Woodlouse");
        animalArray[18] = new Animals(20,150,7,150,"Millipede");
        animalArray[19] = new Animals(21,150,8,150,"Deer");
        animalArray[20] = new Animals(22,150,8,150,"Horse");
        animalArray[21] = new Animals(23,175,8,175,"Bear");
        animalArray[22] = new Animals(24,175,9,175,"Raccoon");
        animalArray[23] = new Animals(25,175,9,175,"Badger");
        animalArray[24] = new Animals(1,100,1,100,"Penguin");
        animalArray[25] = new Animals(15,200,6,250,"Snake");
    }

    public Animals GetAnimal(int num){
        return animalArray[num];
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
    public Animals getAnimal(int index) {
        return animalArray[index];
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
