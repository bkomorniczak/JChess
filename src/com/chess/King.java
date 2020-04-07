package com.chess;

public class King extends Piece {

    private boolean castled = false;

    public King(boolean isWhite){
        super(isWhite);
    }

    public boolean isCastled(){
        return this.castled == true;
    }

    public void setCastled(boolean castled){
        this.castled = castled;
    }


    @Override
    public boolean canItMove(Board board, Tile startTile, Tile endTile) {
        if(endTile.getPiece().isWhite() == this.isWhite()){
            return false;
        }
        int x = Math.abs(startTile.getX() - endTile.getX());
        int y = Math.abs(startTile.getY() - endTile.getY());

        if(x+y ==1){

            // and end tile is not under attack
            return true;
        }
        return this.canItCastle(board, startTile, endTile);
    }

    private boolean canItCastle(Board board, Tile startTile, Tile endTile){
        if(this.isCastled()){
            return false;
        }
        //is any tile in between under attack?
        //is it check?
        //has rook moved?
        //is start tile of king and rook correct
        return true;
    }

}
