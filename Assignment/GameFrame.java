/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
/**
 *
 * @author yuhwankim
 */
public class GameFrame extends JFrame
{ 
    public static final int height = 1000;
    public static final int weight = 1000;
    
    public GameFrame()
    {
        this.setTitle("Path Finder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(weight,height);
        this.setResizable(false);
        setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);
    }
    
}
