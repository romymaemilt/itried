/**
 * Created by RomyMae on 8-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class Dammit extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        g.drawString("Valerie",100,210);
        g.drawString("40 kg",100,220);
        g.drawString("Jeroen",150,210);
        g.drawString("100 kg",150,220);
        g.drawString("Hans",200,210);
        g.drawString("80 kg",200,220);
        g.drawLine(90,200,240,200);
        g.drawLine(90,200,90,50);
        g.drawString("20 kg__",46,180);
        g.drawString("40 kg__",46,160);
        g.drawString("60 kg__",46,140);
        g.drawString("80 kg__",46,120);
        g.drawString("100 kg__",40,100);
        g.drawString("120 kg__",40,80);
        g.setColor(Color.pink);
        g.fillRect(100,160,40,40);
        g.setColor(Color.MAGENTA);
        g.fillRect(150,100,40,100);
        g.setColor(Color.blue);
        g.fillRect(200,120,40,80);
    }
}
