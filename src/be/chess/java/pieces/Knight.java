package be.chess.java.pieces;

import be.chess.java.PlayerColor;
import be.chess.java.board.Board;
import be.chess.java.board.Move;
import be.chess.java.board.Tile;

import java.util.HashSet;
import java.util.Set;

public class Knight extends Piece{
    private final static int[] MOVE_CANDIDATES = {-17,-15,-10,-6,6,10,15,17};

    Knight(final int piecePosition, final PlayerColor pieceColor) {
        super(piecePosition, pieceColor);
    }

    @Override
    public Set<Move> calculateLegalMoves(Board board) {

        int destinationCoordinate;
        final Set<Move> legalMoves = new HashSet<Move>();

        for(final int currentCandidate : MOVE_CANDIDATES){
            destinationCoordinate = this.piecePosition + currentCandidate;

            if(true /*valid tile coordinate*/){
                final Tile destinationTile = board.getTile(destinationCoordinate);

                if(!destinationTile.isOccupied()){
                    //legal
                    legalMoves.add(new Move());
                }
            }
        }

        return null;
    }
}
