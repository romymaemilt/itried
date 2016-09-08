/**
 * Created by RomyMae on 8-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class StopHammerTime extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRoundRect(50,50,100,280,10,10);
        g.setColor(Color.red);
        g.fillOval(60,60,80,80);
        g.setColor(Color.orange);
        g.fillOval(60,150,80,80);
        g.setColor(Color.green);
        g.fillOval(60,240,80,80);
    }
}