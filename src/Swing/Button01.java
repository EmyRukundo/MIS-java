package Swing;

import javax.swing.*;

public class Button01 {
    public static void main(String[] args){
        JFrame f = new JFrame("Button Example");

        JButton b = new JButton("Click  Here");
        b.setBounds(100, 100, 100, 100);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}