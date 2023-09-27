package edu.guilford;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class CTIS210Exam1Graphics extends Canvas {

    public static BufferedImage background;
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("CTIS 210 Exam 1 Graphics Question");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CTIS210Exam1Graphics graphicsDisplay = new CTIS210Exam1Graphics();

        background = ImageIO.read(new File("horizon.jpg"));
        int width = background.getWidth();
        int height = background.getHeight();

        graphicsDisplay.setSize(width, height);
        frame.add(graphicsDisplay);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.drawImage(background, 0, 0, null);
        g2.setColor(new Color(5, 200, 151));
        g2.fill(new Ellipse2D.Double(475, 75, 150, 150));
        g2.setColor(Color.blue);
        g2.fill(new Ellipse2D.Double(500, 125, 25, 25));
        g2.fill(new Ellipse2D.Double(575, 125, 25, 25));
        g2.setColor(Color.red);
        g2.draw(new Line2D.Double(525, 187, 575, 187));
        g2.setColor(Color.yellow);
        g2.fill(new Rectangle2D.Double(50, 10, 80, 50));
        Font font = new Font("Arial", Font.BOLD, 24);
        g2.setFont(font);
        g2.setColor(Color.black);
        g2.drawString("Hello!", 55, 45);
    }

}