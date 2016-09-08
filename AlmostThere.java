/**
 * Created by RomyMae on 8-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class AlmostThere extends Applet {
    public void init() {
setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
g.fillArc(50,50,100,100,90,90);
        g.fillArc(50,50,100,100,180,90);
        g.fillArc(50,50,100,100,270,90);
        g.fillArc(50,50,100,100,360,90);
}
}