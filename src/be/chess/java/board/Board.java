package be.chess.java.board;

import java.util.HashMap;
import java.util.Map;

public class Board {

    static final int DEFAULT_BOARD_LENGTH = 8;

    private int boardSize;
    private Map<Integer, Tile> board;

    public Board(int boardSize){
        final Map<Integer, Tile> board = new HashMap<>();

        for(int i = 0; i < (int) Math.pow(boardSize, 2); i++){
            board.put(i, new Tile(i));
        }
    }

    public Board(){
        this(DEFAULT_BOARD_LENGTH);
    }
}
