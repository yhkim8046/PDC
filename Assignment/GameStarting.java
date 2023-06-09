/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author yuhwankim
 */
public class GameStarting 
{
    private GameFrame gameFrame = new GameFrame();
    private JButton gameStartingButton;
    private JButton playerSetting;
    private JButton history;
    private JPanel player;
    private JMenuBar menuBar;
    private JMenu homeMenu;
    private JMenuItem newMenuItem;

    
    public GameStarting() {
       
        gameStartingButton = new JButton("Game Start");
        gameStartingButton.setBounds(350, 250, 300, 100); 
        gameFrame.add(gameStartingButton);        
        
        playerSetting = new JButton("Player Setting");
        playerSetting.setBounds(700,500,100,50);
        gameFrame.add(playerSetting);
        
        history = new JButton("Game History");
        history.setBounds(700,550,100,50);
        gameFrame.add(history);
        
        player = new JPanel();
        
        menuBar = new JMenuBar();
        homeMenu = new JMenu("Home");
        menuBar.add(homeMenu);
        gameFrame.setJMenuBar(menuBar);
        homeMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameFrame.revalidate();
                gameFrame.repaint();
                gameFrame.add(gameStartingButton);
                gameFrame.add(playerSetting);
                gameFrame.add(history);
            }
        });
        
        this.removeContents();
    }
    
    public void removeContents() //when the buttons got clicked 
    {
        gameStartingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameFrame.remove(history);
                gameFrame.remove(playerSetting);
                gameFrame.remove(gameStartingButton);
                gameFrame.revalidate();
                gameFrame.repaint();
            } 
        });
          playerSetting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameFrame.remove(history);
                gameFrame.remove(playerSetting);
                gameFrame.remove(gameStartingButton);
                gameFrame.revalidate();
                gameFrame.repaint();
            } 
        });
            history.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameFrame.remove(history);
                gameFrame.remove(playerSetting);
                gameFrame.remove(gameStartingButton);
                gameFrame.revalidate();
                gameFrame.repaint();
            } 
        }); 
    }
    
    public void GameStarting()
    {
        
    }
}
