package Swing;

import javax.swing.*;

public class JPasswordField {
    public static void main(String args[])
    {
        JFrame f = new JFrame("Password Fields Example");
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Password");
        l1.setBounds(20,100,80,30);
//        value.setBounds(100,10,100,30);
//        f.add(value); f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
