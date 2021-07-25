package be.chess.java.board;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Board {

    private final int rowSize;

    private final Map<Point, Tile> board;

    //supports custom chess board row sizes!
    public Board(final int rowSize){
        final Map<Point, Tile> board = new HashMap<>();
        this.rowSize = rowSize;

        for(int x = 0; x < rowSize; x++){
            for(int y = 0; y < rowSize; y++){
                final Point coordinate = new Point(x,y);
                    board.put(coordinate, new Tile(coordinate));
            }

        }
        this.board = board;
    }

    //use constructor chaining to allow a default row size of 8
    public Board(){
        this(8);
    }

    public Tile getTile(final Point coordinate){
        return this.board.get(coordinate);
    }

    public int getRowSize() {
        return rowSize;
    }

    public Map<Point, Tile> getBoard() {
        return board;
    }
}
