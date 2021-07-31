package be.chess.java.board;

import be.chess.java.pieces.Piece;

public class Move {
    //TODO: Piece, Tile, MoveType (attack or non-attack, later on: promote pawn)
    private final Board board;
    private final Piece piece;
    private final Tile destinationTile;
    private final MoveType moveType;

    public Move(Board board, Piece piece, Tile destinationTile, MoveType moveType) {
        this.board = board;
        this.piece = piece;
        this.destinationTile = destinationTile;
        this.moveType = moveType;
    }
}
