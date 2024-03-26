//package animonopoly.src;

import java.util.ArrayList;
import java.util.Random;

public class Board {
    int playersRemaining;

    Players[] playersArray; //2-8 players
    GameBoard gameBoard;

    Cards[] cardArray;
    DiceRoll die;

    public Board(){
        initialiseAnimals();
        gameBoard = new GameBoard(this);
        die = new DiceRoll(gameBoard);
        initialiseCards();
        initialisePlayers();
        gameLoop();
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
        gameBoard.setGUIConsoleText("\n>Initialising Players");
        ArrayList<Players> players = new ArrayList<>();

        int desiredPlayerCount = getDesiredPlayerCount();

        playersArray = new Players[desiredPlayerCount];
        String text;

        for (int i=0; i<desiredPlayerCount; i++) {
            text = gameBoard.getGUIConsoleText() + "\n\nFor player " + (i+1) + ":";
            gameBoard.setGUIConsoleText(text);
            String nameInput;
            while (true) {
                text = gameBoard.getGUIConsoleText() + "\n\nEnter your name (<20 characters & unique).\n[A] Enter";
                gameBoard.setGUIConsoleText(text);
                gameBoard.clearTextInput();
                gameBoard.getButtonInput();
                nameInput = gameBoard.getTextInputText();
                if (playerInfoInputIsValid(nameInput, 0)) {
                    text = gameBoard.getGUIConsoleText() + "\n>'" +nameInput+ "' accepted";
                    gameBoard.setGUIConsoleText(text);
                    break;
                } else {
                    text = gameBoard.getGUIConsoleText() + "\n>'" +nameInput+ "' not accepted";
                    gameBoard.setGUIConsoleText(text);

                }

            }

            String playingPieceInput;
            while (true) {
                text = gameBoard.getGUIConsoleText() + "\nEnter your playing piece (<4 characters & be creative!)\n[A] Enter";
                gameBoard.setGUIConsoleText(text);
                gameBoard.getButtonInput();
                playingPieceInput = gameBoard.getTextInputText();
                if (playerInfoInputIsValid(playingPieceInput, 1)) {
                    text = gameBoard.getGUIConsoleText() + "\n>'" +playingPieceInput+ "' accepted";
                    gameBoard.setGUIConsoleText(text);
                    break;
                } else {
                    text = gameBoard.getGUIConsoleText() + "\n>'" +playingPieceInput+ "' not accepted";
                    gameBoard.setGUIConsoleText(text);
                }
            }

            playersArray[i] = new Players(nameInput, playingPieceInput, this);
            text = gameBoard.getGUIConsoleText() + "\n\nYour name is now: " + playersArray[i].getName() + "\nAnd your piece is: " + playersArray[i].getPlayingPiece();
            gameBoard.setGUIConsoleText(text);

        }

        //board:
        //instantiate a dice object
        //keep track of turns, and display player's name with player.announceName();

    gameBoard.makeTextInputInvisible();
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
        int desiredPlayerCount = 0;
        String text;
        while (true) {
            text = gameBoard.getGUIConsoleText() + "\nHow many players will be playing? (2-8)\n[A] enter";
            gameBoard.setGUIConsoleText(text);
            gameBoard.getButtonInput();

            try {


                    desiredPlayerCount = Integer.parseInt(gameBoard.getTextInputText());

                    if (desiredPlayerCount <= 8 && desiredPlayerCount >= 2) {
                        text = gameBoard.getGUIConsoleText() + "\nInput '" + desiredPlayerCount + "' accepted";
                        gameBoard.setGUIConsoleText(text);
                        break;
                    } else {
                        text = gameBoard.getGUIConsoleText() + "\n>Invalid input value";
                        gameBoard.setGUIConsoleText(text);
                    }



            } catch (NumberFormatException e) {
                text = gameBoard.getGUIConsoleText() + "\n>Invalid input format";
                gameBoard.setGUIConsoleText(text);

            }
        }

        return desiredPlayerCount;
    }

    public void gameLoop() {
        String text;
        int oldLocation;
        int newLocation;
        int fee;
        do {
            for (Players player : playersArray) {
                if (!player.bankruptcyCheck() & player.isNextMoveIsAvailable()) {
                    player.announceName(); //kinda redundant now but Ill leave it here
                    text = gameBoard.getGUIConsoleText() + "\nPlayer " + player.getName()  + "'s turn.\nBalance: " + player.getMoney() + "\n[A] Roll\n[B]Upgrade Animal";
                            gameBoard.setGUIConsoleText(text);
                    if (gameBoard.getButtonInput() == 0) { // A - Roll
                    die.roll();
                    } else { // B - upgrade
                        //upgradeAnimal(); THIS AINT COMPLETED !!! THIS AINT COMPLETED !!! THIS AINT COMPLETED !!! THIS AINT COMPLETED !!! THIS AINT COMPLETED !!! THIS AINT COMPLETED !!! THIS AINT COMPLETED !!!
                        die.roll();
                    }
                    if (die.getFirstDice() == die.getSecondDice()) {
                        pickCard(player);
                    }
                    text = gameBoard.getGUIConsoleText() + "\n>Press anything to continue";
                    gameBoard.setGUIConsoleText(text);
                    gameBoard.getButtonInput();
                    {
                        oldLocation = player.getLocation();
                        newLocation = player.getLocation() + die.getFirstDice() +die.getSecondDice();
                        if (newLocation > 25) {
                            newLocation = newLocation -26;
                            text = gameBoard.getGUIConsoleText() + "\n>You passed Go. Collect $200";
                            player.setMoney(player.getMoney() + 200);
                            gameBoard.setGUIConsoleText(text);
                        } //(probable errors) PASS GO
                        movePlayer(player, oldLocation, newLocation);
                        player.setLocation(newLocation);
                        gameBoard.displayAnimalDetails(newLocation);
                    } //move player
                    if (newLocation == 13 || newLocation == 0) {
                        if (newLocation == 13) {
                            text = gameBoard.getGUIConsoleText() + "\n>You will miss your next go.";
                            player.missAGo();
                            gameBoard.setGUIConsoleText(text);
                        }
                    } else if (animalArray[newLocation].getOwned()) {
                        {
                            text = gameBoard.getGUIConsoleText() + "\nYou just landed on an owned space";
                            gameBoard.setGUIConsoleText(text);
                            player.setMoney(player.getMoney() + 200);
                            fee = animalArray[newLocation].getCost();
                            player.setMoney(player.getMoney() - fee);
                            animalArray[newLocation].getOwner().setMoney(player.getMoney() + fee); //adds money moolah ka-ching
                            text = gameBoard.getGUIConsoleText() + "\nYou just paid a $" + fee + "fee.";
                            gameBoard.setGUIConsoleText(text);
                            if (player.bankruptcyCheck()) {
                                text = gameBoard.getGUIConsoleText() + "\nYou have been bankrupted. You are out of the game.";
                                gameBoard.setGUIConsoleText(text);
                            }
                        } //pay fee
                    } else {
                        {
                        text = gameBoard.getGUIConsoleText() + "\nThis space is unowned.\n[A] purchase\n[B] skip"; //there is an edge case of "start and miss ago"
                        gameBoard.setGUIConsoleText(text);
                        if (gameBoard.getButtonInput() == 0) {
                            //yes to purchase animal
                            Animals desiredAnimal = animalArray[newLocation];
                            //can afford check
                            if (desiredAnimal.getUpgCost() < player.getMoney()) {  //upg cost vs cost ??? whats rent and what is purchase price??? ????? and how does upg cost change???
                                desiredAnimal.setOwned(true);
                                desiredAnimal.setOwner(player);
                                player.setMoney(player.getMoney() - desiredAnimal.getUpgCost());
                            } else {
                                text = gameBoard.getGUIConsoleText() + "\n>You cant afford this lmao";
                                gameBoard.setGUIConsoleText(text);
                            }
                        } else {
                            text = gameBoard.getGUIConsoleText() + "\n>skipped";
                            gameBoard.setGUIConsoleText(text);
                        }
                        }//offer purchase
                    }
                    //win check
                }
            }
        } while (!gameover());

        gameBoard.setGUIConsoleText("Game over. <IDK> has one!!");
    }

    private boolean gameover() {
        int corpses = 0;
        String text;
        for (Players player : playersArray) {
            if (player.bankruptcyCheck()) {corpses += 1;}
        }
        if (corpses == playersArray.length) {
            text = gameBoard.getGUIConsoleText() + "\n>everyone is dead lmao";
            gameBoard.setGUIConsoleText(text);
        } else if (corpses == playersArray.length -1) {
            text = gameBoard.getGUIConsoleText() + "\n>Game is over.";
            gameBoard.setGUIConsoleText(text);
            return true;
        }
        return false;
    }

    private void movePlayer(Players player, int oldSpace, int newSpace) {
        gameBoard.setPlayersPresent(oldSpace, player, true);
        gameBoard.setPlayersPresent(newSpace, player, false);
    }

    private void pickCard(Players player) {
        Random random = new Random();
        int cardNumber = random.nextInt(20);
        Cards desiredCard = cardArray[cardNumber];
        gameBoard.setGUIConsoleText(gameBoard.getGUIConsoleText() + "\n" + desiredCard.getMessage());
        player.setMoney(player.getMoney() + desiredCard.getCost());
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
