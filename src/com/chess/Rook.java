package com.chess;

public class Rook extends Piece {

    public Rook(boolean isWhite){
        super(isWhite);
    }

    @Override
    public boolean canItMove(Board board, Tile startTile, Tile endTile) {
        return false;
    }
}
