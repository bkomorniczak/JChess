package com.chess.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenu implements Runnable{
    @Override
    public void run() {
        final JFrame startWindow = new JFrame("Chess");

        startWindow.setLocation(300,100);
        startWindow.setResizable(false);
        startWindow.setSize(300,280);

        Box components = Box.createVerticalBox();
        startWindow.add(components);

        final JPanel titlePanel = new JPanel();
        components.add(titlePanel);
        final JLabel titleLabel = new JLabel("Chess");
        titlePanel.add(titleLabel);

        final JPanel blackPanel = new JPanel();
        components.add(blackPanel, BorderLayout.EAST);
        final JLabel blackPiece = new JLabel();
        try {
            Image blackImg = ImageIO.read(getClass().getResource("resources/bp.png"));
            blackPiece.setIcon(new ImageIcon(blackImg));
            blackPanel.add(blackPiece);
        } catch (Exception e) {
            System.out.println("Required game file bp.png missing");
        }
        final JTextField blackInput = new JTextField("Black", 10);
        blackPanel.add(blackInput);

        final JPanel whitePanel = new JPanel();
        components.add(whitePanel);
        final JLabel whitePiece = new JLabel();
        try {
            Image whiteImg = ImageIO.read(getClass().getResource("resources/wp.png"));
            whitePiece.setIcon(new ImageIcon(whiteImg));
            whitePanel.add(whitePiece);
            startWindow.setIconImage(whiteImg);
        }  catch (Exception e) {
            System.out.println("Required game file wp.png missing");
        }
        final JTextField whiteInput = new JTextField("White", 10);
        whitePanel.add(whiteInput);

        Box buttons = Box.createHorizontalBox();
        final JButton quit = new JButton("Quit");

        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startWindow.dispose();
            }
        });

        final JButton start = new JButton("Start");

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new GameWindow();
                startWindow.dispose();
            }
        });

        buttons.add(start);
        buttons.add(Box.createHorizontalStrut(10));

        buttons.add(Box.createHorizontalStrut(10));
        buttons.add(quit);
        components.add(buttons);

        Component space = Box.createGlue();
        components.add(space);

        startWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startWindow.setVisible(true);

    }
}
