import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
    
        // JFrame is a GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("JFrame title goes here"); // set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of the application
        frame.setResizable(false);// prevent from being resized
        frame.setSize(420,420); // x and y dimension of the frame
        frame.setVisible(true); // frame's visibility

        ImageIcon image = new ImageIcon("cat3.jpg"); // create image icon
        frame.setIconImage(image.getImage()); // change image icon of frame

        frame.getContentPane().setBackground(new Color(0x123456)); // change background color
    }
}