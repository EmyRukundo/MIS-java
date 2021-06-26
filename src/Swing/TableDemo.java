package Swing;

import javax.swing.*;

public class TableDemo {
    JFrame f;

    TableDemo() {
        f = new JFrame();
        String data[][] = {{
                "01", "James", "10000"},
                {"02", "Charles", "97800"},
                {"03", "Janvier", "85000"}
        };
        String column[] = {"ID", "NAME", "SALARY"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new TableDemo();
    }
}
