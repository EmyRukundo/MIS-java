package Menu;

import javax.swing.*;
import java.awt.*;


public class JSliderDemo extends JFrame {
    public JSliderDemo(){
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);

        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

    public static void main(String args[]){
        JSliderDemo frame = new JSliderDemo();
        frame.pack();
        frame.setVisible(true);
    }
}
