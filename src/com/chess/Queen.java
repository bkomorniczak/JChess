package com.chess;

public class Queen extends Piece {

    public Queen(boolean isWhite){
        super(isWhite);
    }

    @Override
    public boolean canItMove(Board board, Tile startTile, Tile endTile) {
        return false;
    }
}
