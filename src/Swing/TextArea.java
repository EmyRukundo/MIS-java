package Swing;

import javax.swing.*;

public class TextArea {

    TextArea(){

        JFrame f = new JFrame();
        JTextField area= new JTextField("Welcome to javapoint");
        area.setBounds(10,30,200, 200);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new TextArea();
    }
}
