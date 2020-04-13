package com.chess;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Objects;

public abstract class  Piece {
    private boolean isDead = false;
    private boolean isWhite = false;
    private String resourcePath;
    private Tile currentTile;
    private BufferedImage img;


    public Piece(boolean white,  String resourcePath){
        this.setWhite(white);
        this.resourcePath = resourcePath;
    }
    public boolean isWhite(){
        return isWhite;
    }

    public void setWhite(boolean isWhite){
        this.isWhite = isWhite;
    }

    public boolean isDead(){
        return this.isDead;
    }

    public  void setDead(boolean isDead){
        this.isDead = isDead;
    }

    public abstract boolean canItMove(Board board, Tile startTile, Tile endTile);

    public void setPosition(Tile tile){
        this.currentTile = tile;
    }
    public Image getImage(){
        return img;
    }
    public void draw(Graphics g) {
        int x = currentTile.getX();
        int y = currentTile.getY();

        g.drawImage(img, x,y,null);

    }
}
