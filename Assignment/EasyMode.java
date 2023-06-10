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

    public EasyMode() {
        this.setTitle("Easy Mode");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(720, 720);
        this.setResizable(false);
        setLocationRelativeTo(null);

        player = new Player();
        this.add(player);

       
        setVisible(true);
    }

}
