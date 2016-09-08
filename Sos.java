import java.applet.Applet;
import java.awt.*;

/**
 * Created by RomyMae on 8-9-2016.
 */

public class Sos extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        g.drawRect(200,200,200,100);
        g.drawLine(200,200,300,100);
        g.drawLine(400,200,300,100);
        g.drawRect(325,225,50,75);
        g.drawRect(250,225,25,25);
    }

}

