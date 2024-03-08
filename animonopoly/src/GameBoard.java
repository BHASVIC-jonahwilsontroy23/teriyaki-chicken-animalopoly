import javax.swing.*;

public class GameBoard extends JFrame {
    private JPanel mainPanel;
    private JTextField animalTitle;

    public GameBoard() {
        setContentPane(mainPanel);
        //mainPanel.add(enterYourQuestionHereTextArea);
        setSize(1150, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animalopoly - Teryiaki Chicken");
        //setDefaultLookAndFeelDecorated(true);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }




}