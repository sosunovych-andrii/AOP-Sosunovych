package Lab6;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;

public class Lab6 {
    public static void lab_demonstration() {
        JFrame frame = new JFrame("Lab6");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        // додавання панельки, де будем малювати
        DrawingPanel drawingPanel = new DrawingPanel();
        drawingPanel.setBounds(0, 0, 640, 380);
        drawingPanel.setBackground(Color.GRAY);
        frame.add(drawingPanel);

        //додавання кнопок і їх реалізація
        JButton circle = new JButton("Намалювати круг");
        circle.setBounds(20, 400, 170, 20);
        circle.addActionListener( e -> {
                drawingPanel.setShape("circle");
                drawingPanel.repaint();
            }
        );
        frame.add(circle);

        JButton square = new JButton("Намалювати квадрат");
        square.setBounds(200, 400, 200, 20);
        square.addActionListener(e -> {
                drawingPanel.setShape("square");
                drawingPanel.repaint();
            }
        );
        frame.add(square);

        JButton parallelogram = new JButton("Намалювати паралелограм");
        parallelogram.setBounds(410, 400, 200, 20);
        parallelogram.addActionListener( e -> {
                drawingPanel.setShape("parallelogram");
                drawingPanel.repaint();
            }
        );
        frame.add(parallelogram);

        frame.setVisible(true);
    }

    static class DrawingPanel extends JPanel {
        private String shape;

        public void setShape(String shape) {
            this.shape = shape;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (shape == null) {
                return;
            }

            switch (shape) {
                case "circle":
                    g.drawOval(320, 190, 150, 150);
                    break;
                case "square":
                    int[] xSquare = {150, 300, 300, 150};
                    int[] ySquare = {300, 300, 150, 150};
                    g.drawPolygon(xSquare, ySquare, 4);
                    break;
                case "parallelogram":
                    int[] xParallelogram = {150, 300, 250, 100};
                    int[] yParallelogram = {250, 250, 350, 350};
                    g.drawPolygon(xParallelogram, yParallelogram, 4);
                    break;
            }
        }
    }
}
