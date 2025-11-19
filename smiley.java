import java.awt.*;
import java.applet.*;
//<applet code = smiley.class width = 700 height = 700></applet>
public class smiley extends Applet{
    public void paint(Graphics g){
        g.drawOval(50, 50, 300, 330); //head -> random starting point, first draw a circle and at last make it oval

        g.drawOval(100, 120, 30, 40); //left eye -> memorize it
        g.drawOval(270, 120, 30, 40); //right eye -> memorize it

        g.drawOval(110, 140, 10, 15); //left pupil -> memorize it
        g.drawOval(280, 140, 10, 15); //right pupil -> memorize it

        g.drawOval(185, 230, 30, 30); //nose -> make it at the center of the circle first and then adjust

        g.fillArc(130, 250, 140, 80, 180, 180); //smile -> just below the nose
        // for smile start for <left eye right> to <right eye left> => (100 + 30) = 130 -> (270) => x = 130, width = (270 - 130) = 140

        g.drawOval(30, 180, 20, 40); //left ear (x + width) = should be the starting point (30 + 20) = 50
        g.drawOval(350, 180, 20, 40); //right ear (x) = (starting point + width of head) => (50 + 300) = 350

    }
}