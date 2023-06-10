/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import static Assignment.GameFrame.height;
import static Assignment.GameFrame.weight;
import javax.swing.JFrame;

/**
 *
 * @author yuhwankim
 */
public class EasyMode extends JFrame
{
    private Player player;
    private int inGameFrameWidth;
    private int inGameFrameHeight;

    public EasyMode() {
        
        this.inGameFrameWidth = 720;
        this.inGameFrameHeight = 720;
        this.setTitle("Easy Mode");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(inGameFrameWidth, inGameFrameHeight);
        this.setResizable(false);
        setLocationRelativeTo(null);

        player = new Player();
        this.add(player);

       
        setVisible(true);
    }

}
