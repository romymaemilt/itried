import java.applet.Applet;
import java.awt.*;

/**
 * Created by RomyMae on 8-9-2016.
 */

public class ItsGettingBetter extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(100,100,25,700);
        g.setColor(Color.red);
        g.fillRect(125,100,500,100);
        g.setColor(Color.black);
        g.drawRect(124,200,500,100);
        g.setColor(Color.blue);
        g.fillRect(125,300,500,100);


    }

}


