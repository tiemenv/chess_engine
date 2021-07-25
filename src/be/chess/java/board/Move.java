package be.chess.java.board;

import be.chess.java.pieces.Piece;

public class Move {
    //TODO: Piece, Tile, MoveType (attack or non-attack, later on: promote pawn)
    private final Piece piece;
    private final Tile tile;
    private final MoveType moveType;

    public Move(Piece piece, Tile tile, MoveType moveType) {
        this.piece = piece;
        this.tile = tile;
        this.moveType = moveType;
    }

    public Piece getPiece() {
        return piece;
    }

    public Tile getTile() {
        return tile;
    }

    public MoveType getMoveType() {
        return moveType;
    }
}
