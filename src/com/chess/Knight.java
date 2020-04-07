package com.chess;

public class Knight extends Piece{

    public Knight(boolean isWhite){
        super(isWhite);
    }
    @Override
    public boolean canItMove(Board board, Tile startTile, Tile endTile) {
        return false;
    }
}
