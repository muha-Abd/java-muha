import javax.swing.*;
import java.awt.*;

public class task1 extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();

        g.drawLine(0, h/2, w, h/2);
        g.drawLine(w/2, 0, w/2, h);

        for(double k = 0.1; k <= 1.0; k += 0.1) {
            int prevX = 0;
            int prevY = h/2;

            for(int i = 0; i < w; i++) {
                double x = (i - w/2)/50.0;
                double y = k * x;

                int px = i;
                int py = (int)(h/2 - y*50);

                g.drawLine(prevX, prevY, px, py);

                prevX = px;
                prevY = py;
            }
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("y = kx");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new task1());
        f.setVisible(true);
    }
}