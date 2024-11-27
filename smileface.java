// package awt_swing_2023;
import java.awt.*;
import java.awt.event.*;

public class smileface extends Frame{
    smileface(){
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
            System.exit(0);} 
        });
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(40, 100, 300, 200);
        g.setColor(Color.pink);

        g.fillOval(150, 120, 70, 70);
        g.setColor(Color.BLACK);
        // g.fillOval(170, 135, 6, 6);
        g.fillOval(196, 135, 6, 6);
        g.drawLine(185, 140, 185, 160);
        g.setColor(Color.BLACK);
        g.drawArc(170, 155, 30, 22, 0, -180);
    }
    public static void main(String[] args) {
        smileface sf=new smileface();
        sf.setSize(500,500);
        sf.setTitle("smileface");
        sf.setVisible(true);
    }
}