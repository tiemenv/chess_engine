package be.chess.java.pieces;

import be.chess.java.PlayerColor;
import be.chess.java.board.Board;
import be.chess.java.board.Move;

import java.util.Set;

public abstract class Piece {

    protected int piecePosition;
    protected PlayerColor pieceColor;

    Piece(final int piecePosition, final PlayerColor pieceColor){
        this.piecePosition = piecePosition;
        this.pieceColor = pieceColor;
    }

    public abstract Set<Move> calculateLegalMoves(final Board board);
}
