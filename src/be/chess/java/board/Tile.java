package be.chess.java.board;

import be.chess.java.pieces.Piece;

public class Tile {
    private final int coordinate;
    private boolean occupied;
    private Piece piece;

    Tile(int coordinate){
        this.coordinate = coordinate;
        this.occupied = false;
        this.piece = null;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getCoordinate() {
        return coordinate;
    }
}
