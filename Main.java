import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {

        // create image icon
        ImageIcon imageIcon1 = new ImageIcon("cat3.jpg"); 
        ImageIcon imageIcon2 = new ImageIcon("R.png");
        
        // JFrame is a GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("JFrame title goes here"); // set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application
        frame.setResizable(false);// prevent from being resized
        frame.setSize(900,950); // x and y dimension of the frame
        frame.setVisible(true); // frame's visibility

        frame.setIconImage(imageIcon1.getImage()); // change image icon of frame
        frame.getContentPane().setBackground(new Color(0x123456)); // change background color

        JLabel label = new JLabel(); // creates a label
        label.setText("Hello, World"); // set text of label
        label.setIcon(imageIcon2);
        label.setHorizontalTextPosition(JLabel.CENTER);

        frame.add(label);
    }
}