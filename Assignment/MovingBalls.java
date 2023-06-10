/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author yuhwankim
 */
public class MovingBalls extends JFrame {

    private int inGameFrameWidth = 720;
    private int inGameFrameHeight = 720;
    private int speed = 5;
    private int ballSize = 10;
    private ArrayList<Ball> balls;

    public MovingBalls() {
        balls = new ArrayList<Ball>();
        for (int i = 0; i < 20; i++) {
            balls.add(new Ball());
        }
        for (Ball ball : balls) {
            Thread ballThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        ball.update();
                        repaint();
                        try {
                            Thread.sleep(10); // Adjust the sleep time according to desired speed
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            ballThread.start();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Ball ball : balls) {
            ball.draw(g);
        }
    }
}
