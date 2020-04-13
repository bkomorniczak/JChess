package com.chess;




import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import java.util.List;


public class Board extends JPanel implements MouseListener, MouseMotionListener {
    private Tile[][] tiles = new Tile[8][8];



    public final LinkedList<Piece> BlackPieces;
    public final LinkedList<Piece> WhitePieces;
    public List<Tile> movable;

    private boolean whiteTurn;

    private static final String WBISHOP_PNG = "resources/wbishop.png";
    private static final String BBISHOP_PNG = "resources/bbishop.png";
    private static final String WKNIGHT_PNG = "resources/wknight.png";
    private static final String BKNIGHT_PNG = "resources/bknight.png";
    private static final String WROOK_PNG = "resources/wrook.png";
    private static final String BROOK_PNG = "resources/brook.png";
    private static final String WKING_PNG = "resources/wking.png";
    private static final String BKING_PNG = "resources/bking.png";
    private static final String WQUEEN_PNG = "resources/wqueen.png";
    private static final String BQUEEN_PNG = "resources/bqueen.png";
    private static final String WPAWN_PNG = "resources/wpawn.png";
    private static final String BPAWN_PNG = "resources/bpawn.png";



    public Board(){


        BlackPieces = new LinkedList<>();
        WhitePieces = new LinkedList<>();

        setLayout(new GridLayout(8,8,0,0));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.startNewBoard();
        this.setPreferredSize(new Dimension(400, 400));
        this.setMaximumSize(new Dimension(400, 400));
        this.setMinimumSize(this.getPreferredSize());
        this.setSize(new Dimension(400, 400));
    }

    public Tile getTile(int x, int y) throws IllegalArgumentException {
        if(x<0 || x> 7 || y<0 || y>7){
            throw new IllegalArgumentException("Wrong tiles");
        }
        return tiles[x][y];
    }

    public void startNewBoard(){
        initializeWhitePawns();
        initializeWhitePieces();
        initializeBlackPawns();
        initializeBlackPieces();
        
        for(int i =2; i<6;i++){
            for(int j = 0; j<7; j++){
                tiles[i][j]= new Tile(i,j,null);
            }
        }
    }

    private void initializeWhitePieces() {
        tiles[0][0] = new Tile(0, 0, new Rook(true, WROOK_PNG ));
        tiles[0][1] = new Tile(0, 1, new Knight(true, WKNIGHT_PNG));
        tiles[0][2] = new Tile(0, 2, new Bishop(true, WBISHOP_PNG));
        tiles[0][3] = new Tile(0, 3, new Queen(true,WQUEEN_PNG));
        tiles[0][4] = new Tile(0, 4, new King(true, WKING_PNG));
        tiles[0][5] = new Tile(0, 5, new Bishop(true, WBISHOP_PNG));
        tiles[0][6] = new Tile(0, 6, new Knight(true, WKNIGHT_PNG));
        tiles[0][7] = new Tile(0, 7, new Rook(true, WROOK_PNG));
    }
    private void initializeBlackPieces() {
        tiles[7][0] = new Tile(7, 0, new Rook(false, BROOK_PNG ));
        tiles[7][1] = new Tile(7, 1, new Knight(false, BKNIGHT_PNG));
        tiles[7][2] = new Tile(7, 2, new Bishop(false, BBISHOP_PNG));
        tiles[7][3] = new Tile(7, 3, new Queen(false,BQUEEN_PNG));
        tiles[7][4] = new Tile(7, 4, new King(false, BKING_PNG));
        tiles[7][5] = new Tile(7, 5, new Bishop(false, BBISHOP_PNG));
        tiles[7][6] = new Tile(7, 6, new Knight(false, BKNIGHT_PNG));
        tiles[7][7] = new Tile(7, 7, new Rook(false, BROOK_PNG));
    }

    private void initializeWhitePawns() {
        for(int i = 0;i<7;i++) {
            tiles[1][i] = new Tile(1, i, new Pawn(true, WPAWN_PNG));
        }
    }
    private void initializeBlackPawns() {
        for(int i = 0;i<7;i++) {
            tiles[6][i] = new Tile(1, i, new Pawn(false, BPAWN_PNG));
        }
    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
