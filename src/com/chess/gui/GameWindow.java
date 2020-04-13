package com.chess.gui;

import com.chess.Board;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow {
    private JFrame gameWindow;

    private Board board;

    public GameWindow(){
        gameWindow = new JFrame("Chess");

        try{
            Image whiteImg = ImageIO.read(getClass().getResource("src/com/chess/resources/wp.png"));
            gameWindow.setIconImage(whiteImg);
        }catch(Exception e){
            System.out.println("File not found");
        }

        gameWindow.setLocation(100,100);
        gameWindow.setLayout(new BorderLayout(20,20));

        Board board = new Board();

        gameWindow.add(board,BorderLayout.CENTER);
        gameWindow.add(buttons(), BorderLayout.SOUTH);

        gameWindow.setMinimumSize((gameWindow.getPreferredSize()));
        gameWindow.setSize(gameWindow.getPreferredSize());
        gameWindow.setResizable(false);

        gameWindow.pack();
        gameWindow.setVisible(true);

        gameWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    private JPanel buttons(){
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(1,3,10,0));
        final JButton quit = new JButton("Quit");
        quit.addActionListener(e -> {
            int n = JOptionPane.showConfirmDialog(gameWindow,"Are you sure you wanna quit?", "Quiting", JOptionPane.YES_NO_OPTION);

            if(n == JOptionPane.YES_OPTION){
                gameWindow.dispose();
            }
        });


        final JButton newGame = new JButton("New game");
        newGame.addActionListener(e -> {
            int n = JOptionPane.showConfirmDialog(gameWindow, "Are you sure you wanna start a new game?", "New Game", JOptionPane.YES_NO_OPTION);

        if(n==JOptionPane.YES_OPTION){
        SwingUtilities.invokeLater(new StartMenu());
        gameWindow.dispose();
            }
        });

        buttons.add(newGame);
        buttons.add(quit);
        buttons.setPreferredSize(buttons.getMinimumSize());

        return buttons;
    }
    public void checkmateHappened(boolean isWhiteOnMove){
        if(isWhiteOnMove) {
            int n = JOptionPane.showConfirmDialog(gameWindow, "Checkmate! New game?", "White wins!", JOptionPane.YES_NO_OPTION);

            if (n == JOptionPane.YES_OPTION) {
                SwingUtilities.invokeLater(new StartMenu());
                gameWindow.dispose();
            }
        }else{
                int n = JOptionPane.showConfirmDialog(gameWindow, "Checkmate! New game?", "Black wins", JOptionPane.YES_NO_OPTION);

                if(n== JOptionPane.YES_OPTION){
                    SwingUtilities.invokeLater(new StartMenu());
                    gameWindow.dispose();
            }
        }
    }
}