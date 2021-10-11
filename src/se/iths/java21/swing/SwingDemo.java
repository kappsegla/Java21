package se.iths.java21.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SwingDemo {

    public static void createGUI(){
        JFrame jFrame = new JFrame("Hello World Swing Example");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 360);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World Swing");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(150, 100));

        label.setText("Hello World Swing");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        jFrame.add(label);

        JButton jButton = new JButton("Click Me!");

        jFrame.add(jButton);
        jButton.addActionListener(e -> label.setText("Clicked the button"));

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        createGUI();
    }
}
