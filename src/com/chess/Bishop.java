package com.chess;

public class Bishop extends Piece {

    public Bishop(boolean isWhite, String resourcePath){
        super(isWhite, resourcePath);
    }
    @Override
    public boolean canItMove(Board board, Tile startTile, Tile endTile) {
        return false;
    }
}
