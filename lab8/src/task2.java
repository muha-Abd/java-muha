import javax.swing.*;
import java.awt.*;

public class task2 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();

        g.drawLine(0,h/2,w,h/2);
        g.drawLine(w/2,0,w/2,h);

        int prevX=0, prevY=0;

        for(int i=0;i<w;i++){
            double x=(i-w/2)/50.0;
            double y=3*x*x;

            int px=i;
            int py=(int)(h/2-y*20);

            if(i>0) g.drawLine(prevX,prevY,px,py);

            prevX=px;
            prevY=py;
        }
    }

    public static void main(String[] args) {
        JFrame f=new JFrame("y = 3x^2");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new task2());
        f.setVisible(true);
    }
}