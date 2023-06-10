/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import javax.swing.JFrame;

/**
 *
 * @author yuhwankim
 */
public class HardMode extends JFrame {

    private Player player;
    private int inGameFrameWidth;
    private int inGameFrameHeight;
    
    public HardMode() {
        this.inGameFrameHeight = 720;
        this.inGameFrameWidth = 720;
        this.setTitle("Hard Mode");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(inGameFrameWidth, inGameFrameHeight);
        this.setResizable(false);
        setLocationRelativeTo(null);

        player = new Player();
        this.add(player);

       
        setVisible(true);
    }
}
