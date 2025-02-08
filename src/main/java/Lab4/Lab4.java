package Lab4;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;


public class Lab4 extends JPanel {
    public static void lab_demonstration() {
        JFrame frame = new JFrame();
        frame.setTitle("Lab 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        Lab4 panel = new Lab4();
        frame.add(panel);

        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);

        // pentagon
        int[] xPentagon = {100, 125, 100, 250, 150};
        int[] yPentagon = {100, 125, 200, 250, 100};
        g2d.setColor(Color.RED);
        g2d.drawPolygon(xPentagon, yPentagon, 5);
        g2d.fillPolygon(xPentagon, yPentagon, 5);

        String pentagon = "Pentagon";
        g2d.setColor(Color.DARK_GRAY);
        g2d.setFont(new Font("Arial", Font.ITALIC, 14));
        g2d.drawString(pentagon, 150, 270);


        // triangle
        int[] xTriangle = {300, 350, 400};
        int[] yTriangle = {200, 100, 200};
        g2d.setColor(Color.BLUE);
        g2d.drawPolygon(xTriangle, yTriangle, 3);
        g2d.fillPolygon(xTriangle, yTriangle, 3);

        String triangle = "Triangle";
        g2d.setColor(Color.DARK_GRAY);
        g2d.setFont(new Font("Arial", Font.ITALIC, 14));
        g2d.drawString(triangle, 325, 220);


        // ellipse
        g2d.setColor(Color.GREEN);
        g2d.drawOval(450, 200, 100, 80);
        g2d.fillOval(450, 200, 100, 80);

        String ellipse = "Ellipse";
        g2d.setColor(Color.DARK_GRAY);
        g2d.setFont(new Font("Arial", Font.ITALIC, 14));
        g2d.drawString(ellipse, 475, 300);
    }
}
