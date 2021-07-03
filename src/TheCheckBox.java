
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
public class TheCheckBox {
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
        setTitle("The Checkbox program");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        label = new JLabel(" Texting Texting Texting ");
                label.setFont(new Font("Serif", Font.PLAIN, FONTSIZE));
        add(label, BorderLayout.CENTER);

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

        JPanel buttonPanel = new JPanel();
        bold = new JCheckBox("Bold");
        bold.addActionListener(listener);
        buttonPanel.add(bold);
        italic = new JCheckBox("Italic");
        italic.addActionListener(listener);
        buttonPanel.add(italic);
        add(buttonPanel, BorderLayout.SOUTH);
    }


    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 300;
    private JLabel label;
    private JCheckBox bold;
    private JCheckBox italic;
    private static final int FONTSIZE = 30;
}