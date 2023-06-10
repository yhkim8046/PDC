/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author yuhwankim
 */
public class Ball implements Runnable {

    private int inGameFrameWidth = 720;
    private int inGameFrameHeight = 720;
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Color color;
    private int ballSize;
    private Player player;
    private GameFrame frame;

    public Ball() {
        Random random = new Random();
        this.ballSize = 10;
        this.x = random.nextInt(720 - 10);
        this.y = random.nextInt(720 - 10);
        this.dx = random.nextInt(5) + 1;
        this.dy = random.nextInt(5) + 1;
        this.color = Color.YELLOW;
        this.frame = frame;
        this.player = player;
   
    }

     public void update() {
        x += dx;
        y += dy;

        if (x <= 0 || x >= inGameFrameWidth - ballSize) {
            dx = -dx;
        }
        if (y <= 0 || y >= inGameFrameHeight - ballSize) {
            dy = -dy;
        }
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, ballSize, ballSize);
    }

    @Override
      public void run() {
        while (true) {
            update();
            frame.repaint();
            try {
                Thread.sleep(10); // Adjust the sleep time according to desired speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
