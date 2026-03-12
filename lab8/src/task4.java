import javax.swing.*;
import java.awt.*;

public class task4 extends JPanel {

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int w=getWidth();
        int h=getHeight();

        g.drawLine(0,h/2,w,h/2);
        g.drawLine(w/2,0,w/2,h);

        int px=0,py=0;

        for(int i=0;i<w;i++){
            double x=(i-w/2)/50.0;
            double y=x*x*x+x*x+x;

            int sx=i;
            int sy=(int)(h/2-y*20);

            if(i>0) g.drawLine(px,py,sx,sy);

            px=sx;
            py=sy;
        }
    }

    public static void main(String[] args){
        JFrame f=new JFrame("y = x^3 + x^2 + x");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new task4());
        f.setVisible(true);
    }
}