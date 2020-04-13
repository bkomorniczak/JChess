package com.chess;

public class Pawn extends Piece {


    public Pawn(boolean isWhite, String resourcePath){
        super(isWhite, resourcePath);
    }
    @Override
    public boolean canItMove(Board board, Tile startTile, Tile endTile) {
        return false;
    }
}
