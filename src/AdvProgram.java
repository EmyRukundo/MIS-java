package jchechbox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    public class Jchechbox {
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    CheckBoxFrame frame = new CheckBoxFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
        }

    }
    class CheckBoxFrame extends JFrame
    {
        public CheckBoxFrame()
        {
            setTitle("Checkbox exercice (home work)");
            setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
            // add the sample text label
            label = new JLabel(" MIS Java exercice for changing the font of the txt by
                    using chechbox");
                    label.setFont(new Font("Serif", Font.PLAIN, FONTSIZE));
            add(label, BorderLayout.CENTER);
            // this listener sets the font attribute of
            // the label to the check box state
            ActionListener listener = new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    int mode = 0;
                    if (bold.isSelected()) mode += Font.BOLD;
                    if (italic.isSelected()) mode += Font.ITALIC;
                    label.setFont(new Font("Serif", mode, FONTSIZE));
                }
            };
            // add the check boxes. For that we created an object buttonPanel of class
            JPanel
            JPanel buttonPanel = new JPanel();
            bold = new JCheckBox("Bold");
            bold.addActionListener(listener);
            buttonPanel.add(bold);
            italic = new JCheckBox("Italic");
            italic.addActionListener(listener);
            buttonPanel.add(italic);
            add(buttonPanel, BorderLayout.SOUTH);
        }

        //Those attributs are final because thier value cannot change during the
        execution of the whole program
        public static final int DEFAULT_WIDTH = 300;
        public static final int DEFAULT_HEIGHT = 200;
        private JLabel label;
        private JCheckBox bold;
        private JCheckBox italic;
        private static final int FONTSIZE = 20;
    }

