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
public class GameStarting {

    private GameFrame gameFrame = new GameFrame();
    private JButton easyModeButton;
    private JButton noramlModeButton;
    private JButton hardMode;
    private JPanel player;
    private JMenuBar menuBar;
    private JMenu homeMenu;
    private JMenuItem newMenuItem;

    public GameStarting() {
        
        easyModeButton = new JButton("Easy Mode");
        easyModeButton.setBounds(150, 100, 100, 50);
        gameFrame.add(easyModeButton);

        noramlModeButton = new JButton("Normal Mode");
        noramlModeButton.setBounds(150, 150, 100, 50);
        gameFrame.add(noramlModeButton);

        hardMode = new JButton("Hard Mode");
        hardMode.setBounds(150, 200, 100, 50);
        gameFrame.add(hardMode);

        player = new JPanel();

        menuBar = new JMenuBar();
        homeMenu = new JMenu("Home");
        menuBar.add(homeMenu);
        gameFrame.setJMenuBar(menuBar);
        
        easyModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EasyMode easyModeFrame = new EasyMode();
                easyModeFrame.setVisible(true); // Set the visibility to true
            }
        });

        noramlModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NormalMode normalModeFrame = new NormalMode();
                normalModeFrame.setVisible(true); // Set the visibility to true
            }
        });

        hardMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HardMode hardModeFrame = new HardMode();
                hardModeFrame.setVisible(true); // Set the visibility to true
            }
        });

    }

    public void GameStarting() {

    }
}
