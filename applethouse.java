import java.applet.*;
import java.awt.*;

public class applethouse extends Applet implements Runnable {
    Thread t;
    boolean flag = true;
    public void start(){
        t = new Thread(this);
        t.start();
    }
    public void run(){
        while(true){
            try{
                if(flag){
                    flag = false;
                }else{
                    flag = true;
                }
                t.sleep(1000);
                repaint();
            }catch(Exception e){}
        }
    }

    public void paint(Graphics g){
        int x[] = {300, 400, 500};
        int y[] = {300, 200, 300};
        g.drawPolygon(x, y, 3);
        g.setColor(Color.RED);
        g.fillPolygon(x, y, 3);

        g.drawRect(300, 300, 200, 100);
        g.setColor(Color.YELLOW);
        g.fillRect(300, 300, 200, 100);

        if(flag){
            g.drawRect(375, 350, 50, 50);
            g.setColor(Color.RED);
            g.fillRect(375, 350, 50, 50);
            g.setColor(Color.BLACK);
            g.drawLine(400, 350, 400, 400);
        }else{
            g.drawRect(375, 350, 50, 50);
            g.setColor(Color.BLACK);
            g.fillRect(375, 350, 50, 50);

            int x1[] = {375, 390, 390, 375, 375};
            int y1[] = {350, 360, 390, 400, 350};
            g.setColor(Color.RED);
            g.fillPolygon(x1, y1, 5);

            int x2[] = {425, 410, 410, 425, 425};
            int y2[] = {350, 360, 390, 400, 350};
            g.setColor(Color.RED);
            g.fillPolygon(x2, y2, 5);

        }
    }

}

// <applet code = applethouse.class width = 700 height = 700></applet>