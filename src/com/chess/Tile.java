package com.chess;

import javax.swing.*;
import java.awt.*;

public class Tile extends JComponent {
    private Piece piece;
    private Board board;

    private final int x;
    private final int y;

    public Tile(int x, int y,  Piece piece){
        this.x = x;
        this.y = y;

        this.piece = piece;

        this.setBorder(BorderFactory.createEmptyBorder());
    }


    public Piece getPiece(){
        return this.piece;
    }
    public void setPiece(Piece piece){
        this.piece = piece;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void put(Piece p){
        this.piece =p;
        p.setPosition(this);
    }

    public Piece removePiece(){
        Piece p = this.piece;
        piece = null;
        return p;
    }
    public void capture(Piece p) {
        Piece k = getPiece();
        if (k.isWhite()) board.BlackPieces.remove(k);
        if (!k.isWhite()) board.WhitePieces.remove(k);
        this.piece = p;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (getX()+getY()%2==0) {
            g.setColor(new Color(221,192,127));
        } else {
            g.setColor(new Color(101,67,33));
        }

        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());

        if(piece != null) {
            piece.draw(g);
        }
    }


}
