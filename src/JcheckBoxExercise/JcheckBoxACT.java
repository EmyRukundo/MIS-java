package JcheckBoxExercise;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Font;


/*
<applet code="ChangeCheckboxFontExample" width=200 height=200>
</applet>
*/
public class JcheckBoxACT extends Applet{

    public void init(){

        //create checkboxes
        Checkbox checkbox1 = new Checkbox("Checkbox 1");
        Checkbox checkbox2 = new Checkbox("Checkbox 2");

        /*
         * To change font of a checkbox use
         * setFont(Font f) method.
         */

        Font myFont = new Font("Courier", Font.ITALIC,12);
        checkbox1.setFont(myFont);

        //add checkboxes
        add(checkbox1);
        add(checkbox2);
    }
}