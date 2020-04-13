package com.chess;

public class Knight extends Piece{

    public Knight(boolean isWhite, String resourcePath){
        super(isWhite, resourcePath);
    }
    @Override
    public boolean canItMove(Board board, Tile startTile, Tile endTile) {
        return false;
    }
}
