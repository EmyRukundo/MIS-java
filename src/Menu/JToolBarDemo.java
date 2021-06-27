package Menu;

import javax.swing.*;
import java.awt.*;

public class JToolBarDemo {
    public static void main(final String args []){
        JFrame myframe = new JFrame("JToolBar Demo");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToolBar toolBar = new JToolBar();
        toolBar.setRollover(true);
        JButton button = new JButton("File");
        toolBar.add(button);
        toolBar.addSeparator();
        toolBar.add(new JButton("Edit"));
        toolBar.add(new JComboBox(new String[]{
                "Opt-1", "Opt-2", "Opt-3", "Opt-4"
        }));
        Container contentPane = myframe.getContentPane();
        contentPane.add(toolBar, BorderLayout.NORTH);
        JTextArea textArea = new JTextArea();
        JScrollPane mypane = new JScrollPane(textArea);
        contentPane.add(mypane, BorderLayout.EAST);
        myframe.setSize(450, 250);
        myframe.setVisible(true);
    }
}
