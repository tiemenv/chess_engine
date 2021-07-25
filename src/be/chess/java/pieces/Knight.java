package be.chess.java.pieces;

import be.chess.java.PlayerColor;
import be.chess.java.board.Board;
import be.chess.java.board.BoardUtils;
import be.chess.java.board.Move;
import be.chess.java.board.Tile;

import java.awt.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Knight extends Piece{
    private final static Point[] MOVE_CANDIDATES = {
            new Point(2, 1),
            new Point(2, -1),
            new Point(-2,1),
            new Point(-2,-1),
            new Point(1,2),
            new Point(1, -2),
            new Point(-1,2),
            new Point(-1, -2)
    };

    Knight(final Point piecePosition, final PlayerColor pieceColor) {
        super(piecePosition, pieceColor);
    }

    @Override
    public Set<Move> calculateLegalMoves(Board board) {

        Point destinationCoordinate;
        final Set<Move> legalMoves = new HashSet<Move>();

        for(final Point currentCandidate : MOVE_CANDIDATES){
            destinationCoordinate = new Point((int) this.piecePosition.getX() + (int) currentCandidate.getX(), (int) this.piecePosition.getY() + (int) currentCandidate.getY());

            if(BoardUtils.isValidCoordinate(destinationCoordinate,board)){
                //possible legal tile, further checking required
                final Tile destinationTile = board.getTile(destinationCoordinate);

                if(!destinationTile.isOccupied()){
                    //legal, since unoccupied
                    //non-attacking move
                    legalMoves.add(new Move());
                } else {
                    //occupied, so get piece and check color
                    final Piece pieceAtDestination = destinationTile.getPiece();
                    final PlayerColor pieceColorAtDestination = pieceAtDestination.getPieceColor();

                    if(this.getPieceColor() != pieceColorAtDestination){
                        //determined this is an enemy piece, so legal move
                        //attacking move
                        legalMoves.add(new Move());
                    }
                    //else friendly piece, so no legal move
                }
            }
        }

        return Collections.unmodifiableSet(legalMoves);
    }
}
