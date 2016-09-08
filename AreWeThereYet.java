/**
 * Created by RomyMae on 8-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class AreWeThereYet extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
  g.drawRoundRect(50,50,300,300,50,50);
        g.setColor(Color.black);
        g.fillOval(90,90,60,60);
        g.fillOval(250,90,60,60);
        g.fillOval(90,250,60,60);
        g.fillOval(250,250,60,60);
    }
}
