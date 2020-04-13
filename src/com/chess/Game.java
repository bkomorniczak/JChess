package com.chess;

import com.chess.gui.StartMenu;

import javax.swing.*;

public class Game implements Runnable{
    public void run() {
        SwingUtilities.invokeLater(new StartMenu());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game());
    }
}
