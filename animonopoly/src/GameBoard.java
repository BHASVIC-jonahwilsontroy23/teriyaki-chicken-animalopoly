import javax.swing.*;
import java.awt.event.*;

public class GameBoard extends JFrame {
    String[] spacesText = new String[26];
    JButton[] spacesArray = new JButton[26];
    int spaceClicked = -1; //-1 means that there is no valid space last clicked.
    private JPanel panel1;
    private JPanel animalViewerContainer;
    private JPanel westTiles;
    private JPanel eastTiles;
    private JPanel southTiles;
    private JPanel northTiles;
    private JPanel NETile;
    private JPanel NWTile;
    private JPanel SETile;
    private JPanel SWTile;
    private JPanel boardCentreContainer;
    private JTextArea GUIConsoleText;
    private JTextField playerGUIInput;
    private JTextField space0;
    private JTextArea animalNameTextArea;
    private JTextArea animalDetailsTextArea;
    private JButton button0;
    private JTextField space1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    Board board;
    int myInteger = 0;

    public GameBoard(Board boardObjectPointer) {
        board = boardObjectPointer;
        setContentPane(panel1);
        //mainPanel.add(enterYourQuestionHereTextArea);
        setSize(840, 560); //tiles prefer 80x80, max 110x110. animal viewer panel prefers 200 width, max 200w
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animalopoly - Teriyaki Chicken");
        //setDefaultLookAndFeelDecorated(true);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);

        initialiseGameBoard();
        { //collapse this. trust me bro.
            button0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(">space 1 clicked");
                    spaceClicked = 0;
                }
            });
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 1;
                    System.out.println(">space 2 clicked");
                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 2;
                    System.out.println(">space 3 clicked");
                }
            });
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 3;
                    System.out.println(">space 4 clicked");
                }
            });
            button4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 4;
                    System.out.println(">space 5 clicked");
                }
            });
            button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 5;
                    System.out.println(">space 6 clicked");
                }
            });
            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 6;
                    System.out.println(">space 7 clicked");
                }
            });
            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 7;
                    System.out.println(">space 8 clicked");
                }
            });
            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 8;
                    System.out.println(">space 9 clicked");
                }
            });
            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 9;
                    System.out.println(">space 10 clicked");
                }
            });
            button10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 10;
                    System.out.println(">space 11 clicked");
                }
            });
            button11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 11;
                    System.out.println(">space 12 clicked");
                }
            });
            button12.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 12;
                    System.out.println(">space 13 clicked");
                }
            });
            button13.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 13;
                    System.out.println(">space 14 clicked");
                }
            });
            button14.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 14;
                    System.out.println(">space 15 clicked");
                }
            });
            button15.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 15;
                    System.out.println(">space 16 clicked");
                }
            });
            button16.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 16;
                    System.out.println(">space 17 clicked");
                }
            });
            button17.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 17;
                    System.out.println(">space 18 clicked");
                }
            });
            button18.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 18;
                    System.out.println(">space 19 clicked");
                }
            });
            button19.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 19;
                    System.out.println(">space 20 clicked");
                }
            });
            button20.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 20;
                    System.out.println(">space 21 clicked");
                }
            });
            button21.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 21;
                    System.out.println(">space 22 clicked");
                }
            });
            button22.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 22;
                    System.out.println(">space 23 clicked");
                }
            });
            button23.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 23;
                    System.out.println(">space 24 clicked");
                }
            });
            button24.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 24;
                    System.out.println(">space 25 clicked");
                }
            });
            button25.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    spaceClicked = 25;
                    System.out.println(">space 26 clicked");
                }
            });
        } // button listeners. I advise keeping this collapsed
    }


    public void setPlayersPresent(int space, Players player, boolean remove) {
        String template = "";
        String text = "";
        if (!remove) {
            if (spacesText[space].contains(player.getPlayingPiece())) { System.out.println(">DEBUG: that player piece is already there bro");
            } else { spacesText[space] = spacesText[space] + "  " + player.getPlayingPiece(); }

        } else {
            try { spacesText[space] = spacesText[space].replace("  " + player.getPlayingPiece(), ""); } catch (Exception e) {
                throw new RuntimeException(e); }
        }
        try { spacesText[space] = spacesText[space].replace("null", "");} catch (Exception e) {
            throw new RuntimeException(e); }
        if (space == 0) {
            template = "<html>0<br />Start<br /><br />%s</html>";
            text = String.format(template, board.getAnimal(space).getName(), spacesText[space]);
        } else if (space == 13) {
            template = "<html>14<br />%s<br /><br />%s</html>";
            text = String.format(template, board.getAnimal(space).getName(), spacesText[space]);
        } else {
            template = "<html>%d<br />%s<br /><br />%s</html>";
            text = String.format(template, space+1, board.getAnimal(space).getName(), spacesText[space]);
        }
        spacesArray[space].setText(text);
    } // enabling remove, removes the players piece from a space.
    public void initialiseGameBoard() {
        spacesArray[0] = button0;
        spacesArray[1] = button1;
        spacesArray[2] = button2;
        spacesArray[3] = button3;
        spacesArray[4] = button4;
        spacesArray[5] = button5;
        spacesArray[6] = button6;
        spacesArray[7] = button7;
        spacesArray[8] = button8;
        spacesArray[9] = button9;
        spacesArray[10] = button10;
        spacesArray[11] = button11;
        spacesArray[12] = button12;
        spacesArray[13] = button13;
        spacesArray[14] = button14;
        spacesArray[15] = button15;
        spacesArray[16] = button16;
        spacesArray[17] = button17;
        spacesArray[18] = button18;
        spacesArray[19] = button19;
        spacesArray[20] = button20;
        spacesArray[21] = button21;
        spacesArray[22] = button22;
        spacesArray[23] = button23;
        spacesArray[24] = button24;
        spacesArray[25] = button25;

        for (int i =0; i<spacesArray.length; i++) {
            String template = "<html>%d<br />%s<br /><br /></html>";
            String text = String.format(template, i+1, board.getAnimal(i).getName());
            spacesArray[i].setText(text);

            spacesText[i] = "";
        }
        spacesArray[0].setText("<html>1<br />Start<br /><br /></html>");
        spacesArray[13].setText("<html>14<br />Miss a Go<br /><br /></html>");
    }
    public void setAnimalName(String newAnimalName) {
        animalNameTextArea.setText(newAnimalName);
    }
    public void setAnimalDesc(String newAnimalDesc) {
        animalDetailsTextArea.setText(newAnimalDesc);
    }
    public void setGUIConsoleText(String newGUIConsoleText) {
        GUIConsoleText.setText(newGUIConsoleText);
    }
    public void setPlayerGUIInput(String newPlayerGUIInput) {
        playerGUIInput.setText(newPlayerGUIInput);
    }

    //we need a way to get the input from this GUI. it means we need to WAIT for the input. perhaps use a listener and a button..

}

