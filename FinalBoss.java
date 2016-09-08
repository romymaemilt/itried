/**
 * Created by RomyMae on 8-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class FinalBoss extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
//de lijn
        g.drawLine(10,10,300,10);
        g.drawString("lijn",150,30);
        //rechthoek
        g.drawRect(10,60,300,100);
        g.drawString("rechthoek",130,180);
        //ronde rechthoek
        g.drawRoundRect(10,210,300,100,30,30);
        g.drawString("afgeronde rechthoek",90,330);
        //gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(350,60,300,100);
        g.setColor(Color.black);
        g.drawOval(350,60,300,100);
        g.drawString("gevulde rechthoek met ovaal",420,180
        );
        //ovaal
        g.setColor(Color.magenta);
        g.fillOval(350,210,300,100);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal",450,330);
        //taartpunt in ovaal
        g.setColor(Color.magenta);
        g.fillArc(700,60,300,100,0,45);
        g.setColor(Color.black);
        g.drawOval(700,60,300,100);
        g.drawString("taartpunt met ovaal eromheen",760,180);
        //cirkel
        g.drawOval(800,210,100,100);
        g.drawString("cirkel",830,330);


    }
}
