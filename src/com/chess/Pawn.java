package com.chess;

public class Pawn extends Piece {


    public Pawn(boolean isWhite){
        super(isWhite);
    }
    @Override
    public boolean canItMove(Board board, Tile startTile, Tile endTile) {
        return false;
    }
}
