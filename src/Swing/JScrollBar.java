package Swing;

import javax.swing.*;

class JScrollBarDemo {
    JScrollBarDemo(){
        JFrame f = new JFrame("Scrollbar example");
        JScrollBar s  = new JScrollBar();
        s.setBounds(20, 20, 20, 100);
        f.add(s);
        f.setSize(10, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new JScrollBarDemo();
    }
}
