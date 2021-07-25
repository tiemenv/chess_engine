package be.chess.java.pieces;

import be.chess.java.PlayerColor;
import be.chess.java.board.Board;
import be.chess.java.board.Move;

import java.awt.*;
import java.util.Set;

public abstract class Piece {

    protected Point piecePosition;
    protected PlayerColor pieceColor;

    Piece(final Point piecePosition, final PlayerColor pieceColor){
        this.piecePosition = piecePosition;
        this.pieceColor = pieceColor;
    }

    public PlayerColor getPieceColor() {
        return pieceColor;
    }

    public abstract Set<Move> calculateLegalMoves(final Board board);
}
