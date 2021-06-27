package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogueDemo {
    private static JDialog d;
    JDialogueDemo(){
        JFrame f = new JFrame();
        d = new JDialog(f, "Dialog Demo", true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                JDialogueDemo.d.setVisible(false);
            }
        }));
        d.add(new JLabel("Clickbutton to continue"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }
    public static void main(String args[]){
        new JDialogueDemo();
    }
}
