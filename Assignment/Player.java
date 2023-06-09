/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author yuhwankim
 */
public class Player extends JPanel {

    private int x = 100; // x-coordinate of the rectangle
    private int y = 100; // y-coordinate of the rectangle
    private int width = 200; // width of the rectangle
    private int height = 100; // height of the rectangle

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }
}
