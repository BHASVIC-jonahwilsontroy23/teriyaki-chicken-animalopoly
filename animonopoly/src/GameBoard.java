import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameBoard extends JFrame {
    public GameBoard() {
        setTitle("Monopoly Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(7, 8));

        // Creating Monopoly board spaces
        for (int i = 0; i < 26; i++) {
            JTextField space = new JTextField();
            space.setEditable(false);
            space.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            space.setHorizontalAlignment(JTextField.CENTER);
            space.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Implement mouse click action here
                }
            });
            boardPanel.add(space);
        }

        // Creating central rectangle with text field
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        JTextField centerTextField = new JTextField("Center Rectangle");
        centerTextField.setEditable(false);
        centerTextField.setHorizontalAlignment(JTextField.CENTER);
        centerPanel.add(centerTextField, BorderLayout.CENTER);

        mainPanel.add(boardPanel, BorderLayout.CENTER);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Creating right panel with title, image, text field, and button
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Title Space");
        rightPanel.add(titleLabel, BorderLayout.NORTH);

        JLabel imageLabel = new JLabel(new ImageIcon("monopoly_image.jpg")); // Replace "monopoly_image.jpg" with your image path
        rightPanel.add(imageLabel, BorderLayout.CENTER);

        JTextField textFieldBelowImage = new JTextField("Text Field Below Image");
        textFieldBelowImage.setEditable(false);
        rightPanel.add(textFieldBelowImage, BorderLayout.SOUTH);

        JButton button = new JButton("Button");
        rightPanel.add(button, BorderLayout.WEST);

        JTextField smallTextField = new JTextField("Small Text Field");
        smallTextField.setEditable(false);
        rightPanel.add(smallTextField, BorderLayout.EAST);

        mainPanel.add(rightPanel, BorderLayout.EAST);

        add(mainPanel);
        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
    }
    
}
