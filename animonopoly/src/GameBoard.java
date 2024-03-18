import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {
    String[] spacesText = new String[26];
    JButton[] spacesArray = new JButton[26];
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
    private JTextArea infoForThePlayersTextArea;
    private JTextField inputTextField;
    private JTextField space0;
    private JTextArea animalNameTextArea;
    private JTextArea animalDetailsTextArea;
    private JTextField space2;
    private JTextField space3;
    private JTextField space4;
    private JTextField space5;
    private JTextField space6;
    private JTextField space7;
    private JButton button1;
    private JTextField space1;
    private JButton button2;

    public GameBoard() {
        setContentPane(panel1);
        //mainPanel.add(enterYourQuestionHereTextArea);
        setSize(840, 560); //tiles prefer 80x80, max 110x110. animal viewer panel prefers 200 width, max 200w
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animalopoly - Teryiaki Chicken");
        //setDefaultLookAndFeelDecorated(true);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);

        initialiseGameBoard();

        panel1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent clicked) {
                if( clicked.getSource() instanceof JPanel ) {
                    System.out.println( clicked.getComponent().getName() ); }

            }
        });

        button1.addActionListener(new ActionListener() {
            int myInteger = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("gfghgh");
                myInteger += 1;
                String template = "<html>%d<br />animal name<br />players</html>";
                String text = String.format(template, myInteger);
                button1.setText(text);
                space0.setText(String.valueOf(myInteger) + "\n animal name\nplayers");
                space1.setText(String.valueOf(myInteger) + "\n animal name\nplayers");
            }
        });
    }

    public void setPlayersPresent(int space, Players player, boolean remove) {
        if (!remove) {
            spacesText[space] = spacesText[space] + " " + player.getPlayingPiece();
        } else {
            spacesText[space] = spacesText[space].replace(player.getPlayingPiece(), "");
        }
    } // enabling remove, removes the players piece from a space.

    public void setAnimalName(String newAnimalName) {
        animalNameTextArea.setText(newAnimalName);
    }
    public void setAnimalDesc(String newAnimalDesc) {
        animalDetailsTextArea.setText(newAnimalDesc);
    }

    public void initialiseGameBoard() {
        //xyz
        for (int i =0; i<spacesArray.length; i++) {
            spacesArray[i] = button1;
            spacesArray[i].setText("");
        }


        //xyz
    }

}

