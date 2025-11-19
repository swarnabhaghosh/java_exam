import java.awt.*;
import java.applet.Applet;

//<applet code=house.class width=700 height=700></applet>

public class house extends Applet implements Runnable{
    boolean flag = true;
    Thread t;
    public void start(){
        t = new Thread(this);
        t.start();
    } //end of start
    public void run(){
        while(true){ //to run infinitely
            try{
                if(flag){
                    flag = false;
                }else{
                    flag = true;
                }
                t.sleep(1000); //sleep for 1 sec.
                repaint(); // tells applet to redraw
            }catch(Exception e){}
        } //end of while
    } //end of run
    public void paint(Graphics g){
        int x[] = {300,400,500};
        int y[] = {300,200,300};
        g.drawPolygon(x, y, 3); // triangle -> (300, 300), (400, 200), (500, 300)
        g.setColor(Color.RED);
        g.fillPolygon(x, y, 3);
        g.drawRect(300, 300, 200, 100);
        g.setColor(Color.YELLOW);
        g.fillRect(300, 300, 200, 100);

        if(flag){ //for open door
            g.drawRect(375,350,50,50);//draw rectangle for door structure
            g.setColor(Color.RED);//color of door
            g.fillRect(375,350,50,50);//fill rectangle

            g.setColor(Color.black);//fill with black color
            g.drawLine(400,350,400,400);//draw line within rectangle
        }else{ //for closed door
            g.drawRect(375,350,50,50);//draw rectangle for door structure
            g.setColor(Color.black);//for inside the door
            g.fillRect(375,350,50,50);//for empty space between open doors

            int x1[] = {375,390,390,375,375};
            int y1[] = {350,360,390,400,350};
            g.setColor(Color.RED);
            g.fillPolygon(x1,y1,5);//for left door

            int x2[] = {425,410,410,425,425};
            int y2[] = {350,360,390,400,350};
            g.setColor(Color.RED);//for right door
            g.fillPolygon(x2,y2,5);
        }
    }
}