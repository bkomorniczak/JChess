package com.chess;


public class Board extends Exception{
    Tile[][] tiles;

    public Board(){
        this.startNewBoard();
    }
    public Tile getTile(int x, int y) throws ArrayIndexOutOfBoundsException {
        if(x<0 || x> 7 || y<0 || y>7){
            throw new ArrayIndexOutOfBoundsException();
        }
        return tiles[x][y];
    }

    public void startNewBoard(){
        tiles[0][0] = new Tile(0,0,new Rook(true));
        tiles[0][1] = new Tile(0,1, new Knight(true));
        tiles[0][2] = new Tile(0,2,new Bishop(true));
        tiles[0][3] = new Tile(0,3, new Queen(true));
        tiles[0][4] = new Tile(0,4, new Knight(true));
        tiles[0][5] = new Tile(0, 5, new Bishop(true));
        tiles[0][6] = new Tile(0,6,new Knight(true));
        tiles[0][7] = new Tile(0,7,new Rook(true));

        tiles[1][0] = new Tile(1,0, new Pawn(true));
        tiles[1][1] = new Tile(1,1, new Pawn(true));
        tiles[1][2] = new Tile(1,2, new Pawn(true));
        tiles[1][3] = new Tile(1,3, new Pawn(true));
        tiles[1][4] = new Tile(1,4, new Pawn(true));
        tiles[1][5] = new Tile(1,5, new Pawn(true));
        tiles[1][6] = new Tile(1,6, new Pawn(true));
        tiles[1][7] = new Tile(1,7, new Pawn(true));

        tiles[7][0] = new Tile(7,0,new Rook(false));
        tiles[7][1] = new Tile(7,1, new Knight(false));
        tiles[7][2] = new Tile(7,2,new Bishop(false));
        tiles[7][3] = new Tile(7,3, new Queen(false));
        tiles[7][4] = new Tile(7,4, new Knight(false));
        tiles[7][5] = new Tile(7, 5, new Bishop(false));
        tiles[7][6] = new Tile(7,6,new Knight(false));
        tiles[7][7] = new Tile(7,7,new Rook(false));

        tiles[6][0] = new Tile(6,0, new Pawn(false));
        tiles[6][1] = new Tile(6,1, new Pawn(false));
        tiles[6][2] = new Tile(6,2, new Pawn(false));
        tiles[6][3] = new Tile(6,3, new Pawn(false));
        tiles[6][4] = new Tile(6,4, new Pawn(false));
        tiles[6][5] = new Tile(6,5, new Pawn(false));
        tiles[6][6] = new Tile(6,6, new Pawn(false));
        tiles[6][7] = new Tile(6,7, new Pawn(false));


        for(int i =2; i<6;i++){
            for(int j =0; j<8; j++){
                tiles[i][j]= new Tile(i,j,null);
            }
        }
    }
}
