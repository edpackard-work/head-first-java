import javax.swing.*;
import java.awt.*;

public class PoolPuzzle {
    int x = 1;
    int y = 1;
    public static void main (String[] args) {
        PoolPuzzle gui = new PoolPuzzle();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);
        for (int i = 0; i < 124; i++, x++, y++) {
            x++;
            drawP.repaint();
            if ( i == 123 ) {
                i = 0;
                x = 1;
                y = 1;
            }
            try {
                Thread.sleep(20);
            } catch (Exception ex) {
            }
        }
    }

    class MyDrawP extends JPanel {
        public void paintComponent (Graphics g) {
//            g.setColor(Color.white);
//            g.fillRect(0, 0, 500, 250);
            g.setColor(Color.blue);
            g.fillRect(x,y, 500-x*2, 250-y*2);
        }
    }
}
