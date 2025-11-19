import java.awt.*;
import java.applet.*;

public class appletsmile extends Applet{
    public void paint(Graphics g){
        g.drawOval(50, 50, 300, 330); //head

        g.drawOval(100, 120, 30, 40); //left eye
        g.drawOval(270, 120, 30, 40); //right eye

        g.drawOval(110, 140, 10, 10); //left pupil
        g.drawOval(280, 140, 10, 10); //right pupil

        g.drawOval(185, 230, 30, 30); //nose

        g.fillArc(130, 250, 140, 75, 180, 180); //smile

        g.drawOval(30, 180,20, 40); //left ear
        g.drawOval(350, 180,20, 40); //right ear
    }
}

// <applet code = appletsmile.class width = 700 height = 700></applet>