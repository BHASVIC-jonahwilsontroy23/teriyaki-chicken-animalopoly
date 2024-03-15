import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameBoard extends JFrame {
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

        panel1.addMouseListener(new MouseAdapter() {

            int myInteger = 0;
            @Override
            public void mouseClicked(MouseEvent clicked) {
                if( clicked.getSource() instanceof JPanel ) {
                    if (myInteger <10) {
                        myInteger += 1;
                        clicked.getComponent().setName(String.valueOf(myInteger));
                    }
                    System.out.println( clicked.getComponent().getName() ); }
                if( clicked.getSource() instanceof JTextArea ) {
                    System.out.println( clicked.getComponent().getName() ); }

            }
        });
    }



}

