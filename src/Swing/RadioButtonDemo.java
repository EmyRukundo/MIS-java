package Swing;

import javax.swing.*;

public class RadioButtonDemo {
    JFrame f;
    RadioButtonDemo(){
        f = new JFrame();
        JRadioButton r1 = new JRadioButton(" a) male");
        JRadioButton r2 = new JRadioButton(" b) female");
        r1.setBounds(75,50,100,30);
        r2.setBounds(75,50,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);
        f.add(r1); f.add(r2);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new RadioButtonDemo();
    }
}
