//package animonopoly.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    int playersRemaining;

    Players[] playersArray; //2-8 players
    GameBoard gameBoard;

    Cards[] cardArray;
    DiceRoll die;

    public Board(){
        Scanner scan = new Scanner(System.in);
        initialiseAnimals();
        gameBoard = new GameBoard(this);
        DiceRoll die = new DiceRoll(gameBoard);
        gameLoop();
        initialiseCards();
        animalArray[1].stoplevel = 3;
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

    public void gameLoop() {
        /*
        do {
            for (Players players : playersArray) {
                if (!players.bankruptcyCheck()) {
                    players.announceName();
                    gameBoard.setGUIConsoleText("[A] Roll\n[B]Upgrade Animal");
                    if (gameBoard.buttonInputChoice == 0) { // A - Roll
                    die.roll();
                    //rest of code.
                    //
                    }

                }
            }
        //} while (!gameover());
         } while (!playersArray[0].bankruptcyCheck());
         */
        gameBoard.setGUIConsoleText("Game over. <IDK> has one!!");
    }
/*
while (1 == 1) {
        int playerscount = board.playersArray.length + 1;
        for (int i = 0; i < playerscount-1; i++) {

            if (board.playersArray[i].bankruptcyCheck() == false) {
                board.playersArray[i].getName();
                System.out.println(nameplayer+", it is your turn.");
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
*/
    
    public void initialiseCards() {

        cardArray = new Cards[20];

        cardArray[0] = new Cards();
        cardArray[1] = new Cards();
        cardArray[2] = new Cards();
        cardArray[3] = new Cards();
        cardArray[4] = new Cards();
        cardArray[5] = new Cards();
        cardArray[6] = new Cards();
        cardArray[7] = new Cards();
        cardArray[8] = new Cards();
        cardArray[9] = new Cards();
        cardArray[10] = new Cards();
        cardArray[11] = new Cards();
        cardArray[12] = new Cards();
        cardArray[13] = new Cards();
        cardArray[14] = new Cards();
        cardArray[15] = new Cards();
        cardArray[16] = new Cards();
        cardArray[17] = new Cards();
        cardArray[18] = new Cards();
        cardArray[19] = new Cards();
        cardArray[0].setData(10, "you were dared to eat a rotten bean, You did it claim 10.");
        cardArray[1].setData(20, "You caught your older brother stealing your parents money. Blackmail him for $20.");
        cardArray[2].setData(50,"You were asked to jump of a bridge into water and succeeded! Collect $50 from your coach who bet against you.");
        cardArray[3].setData(75,"You won a car race against a old friend. Collect $75 and laugh at him.");
        cardArray[4].setData(25,"You dunked your basketball coach. Collect $25 because he bet you couldn't.");
        cardArray[5].setData(30,"You convinced your parents to give you money for 'food'. Collect $30.");
        cardArray[6].setData(100,"You found a ring on the floor and sold it. Collect $100.");
        cardArray[7].setData(70,"You saved a family from a house fire . Collect $70 for you heroic act.");
        cardArray[8].setData(15,"You just inherited a new porsche. Collect $15 for your toy porsche.");
        cardArray[9].setData(95,"You trapped a famous criminal. Collect $95 for your bravery.");
        cardArray[10].setData(-50,"You tried your luck in the casino. Pay $50, maybe another time.");
        cardArray[11].setData(-20,"You passed out drunk at your friends. Pay them $20 and dont throw up again.");
        cardArray[12].setData(-100,"You took your dog to the vet. Pay $100 for treatment.");
        cardArray[13].setData(-30,"You didnt pass your driving test. Pay $30 and try again.");
        cardArray[14].setData(-75,"You accidentally stepped in poo. Pay $75 for new shoes.");
        cardArray[15].setData(-40,"You forgot to lock your car and it got stolen. Pay $40 for a new form of transport.");
        cardArray[16].setData(-60,"You need to buy your family christmas presents. Pay $60.");
        cardArray[17].setData(-90,"You ran into your neighbors motorbike. Pay $90 for the embarrassment.");
        cardArray[18].setData(-50,"You lost your wallet at the supermarket. Pay $50.");
        cardArray[19].setData(-15,"You spilled red soda on your brand new white shoes. Pay $15 for the stain remover.");
    }
}
