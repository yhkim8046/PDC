/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author yuhwankim
 */
public class Player extends JComponent implements KeyListener{

    private int x = 360; // x-coordinate of the rectangle 
    private int y = 670; // y-coordinate of the rectangle
    private final int width = 10; // width of the rectangle
    private final int height = 10; // height of the rectangle
    private int inGameFrameWidth = 720;
    private int inGameFrameHeight = 720;
    private boolean isGameOver;
    

    public Player() {
        setPreferredSize(new Dimension(width, height));
        setFocusable(true);
        requestFocus();
        addKeyListener(this);
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, width, height);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

         switch (keyCode) {
            case KeyEvent.VK_UP:
                if (y - 10 >= 0) {
                    y -= 10;
                }
                break;
            case KeyEvent.VK_DOWN:
                if (y + 10 <= inGameFrameHeight - height) {
                    y += 10;
                }
                break;
            case KeyEvent.VK_LEFT:
                if (x - 10 >= 0) {
                    x -= 10;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (x + 10 <= inGameFrameWidth - width) {
                    x += 10;
                }
                break;
        }

        setLocation(x,y);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
    public void setIsGameOver(boolean x)
    {
        this.isGameOver = x;
    }
    public boolean getIsGameOver()
    {
        return this.isGameOver;
    }
} 
 