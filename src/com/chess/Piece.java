package com.chess;

public abstract class  Piece {
    private boolean isDead = false;
    private boolean isWhite = false;

    public Piece(boolean white){
        this.setWhite(white);
    }
    public boolean isWhite(){
        return isWhite ==true;
    }

    public void setWhite(boolean isWhite){
        this.isWhite = isWhite;
    }

    public boolean isDead(){
        return this.isDead == true;
    }

    public  void setDead(boolean isDead){
        this.isDead = isDead;
    }

    public abstract boolean canItMove(Board board, Tile startTile, Tile endTile);
}
