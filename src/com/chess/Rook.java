package com.chess;

public class Rook extends Piece {

    public Rook(boolean isWhite,String resourcePath){
        super(isWhite, resourcePath);
    }

    @Override
    public boolean canItMove(Board board, Tile startTile, Tile endTile) {
        return false;
    }
}
