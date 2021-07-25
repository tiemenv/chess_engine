package be.chess.java.board;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Board {

    static final int BOARD_SIZE = 8;

    private Map<Point, Tile> board;

    public Board(){
        final Map<Point, Tile> board = new HashMap<>();

        for(int x = 0; x < BOARD_SIZE; x++){
            for(int y = 0; y < BOARD_SIZE; y++){
                final Point coordinate = new Point(x,y);
                board.put(coordinate, new Tile(coordinate));
            }

        }
    }

    public Tile getTile(final Point coordinate){
        return this.board.get(coordinate);
    }

}
