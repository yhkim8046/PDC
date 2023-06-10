/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author yuhwankim
 */
public class NormalMode extends JFrame
{
    private int inGameFrameWidth;
    private int inGameFrameHeight;
    private Player player;
    ArrayList<Ball> balls;
    private MovingBalls movingBalls;
    
    public NormalMode() {
        this.setTitle("Normal Mode");
        this.inGameFrameHeight = 720;
        this.inGameFrameWidth = 720;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        this.setSize(inGameFrameWidth, inGameFrameHeight);
        this.setResizable(false);
        setLocationRelativeTo(null);

        player = new Player();
        this.add(player);

        player.setVisible(true);
        
       
    }
}