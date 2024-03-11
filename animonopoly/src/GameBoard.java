import javax.swing.*;

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
    }




}