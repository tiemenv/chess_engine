package be.chess.java.board;

import be.chess.java.pieces.Piece;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Board {

    static final int BOARD_SIZE = 64;

    private final Map<Integer, Tile> ALL_EMPTY_TILES = createAllEmptyTiles();

    private Map<Integer, Tile> board;

    private static Map<Integer, Tile> createAllEmptyTiles(){
        //should be immutable
        final Map<Integer, Tile> board = new HashMap<>();

        for(int i = 0; i < BOARD_SIZE; i++){
            board.put(i, new Tile(i));
        }

        return Collections.unmodifiableMap(board);
    }

    public Board(){
        this.board = createAllEmptyTiles();
    }

    public Tile getTile(final int coordinate){
        return this.board.get(coordinate);
    }

}
