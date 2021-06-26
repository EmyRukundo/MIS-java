package Swing;

import javax.swing.*;

public class ComboBoxDemo {
    JFrame f;
    ComboBoxDemo(){
        f = new JFrame("ComboBox example");
        String
                country[] = {"Rwanda", "DRC", "Gabon", "Chad", "Cameroun"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50,50,90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new ComboBoxDemo();
    }
}
