package be.chess.java.board;

import java.awt.*;

public class BoardUtils {

    //shouldn't be instantiatable
    private BoardUtils(){
        throw new RuntimeException("Can't instantiate utility class");
    }

    public static boolean isValidCoordinate(final Point coordinate, final Board board){
        //check if out of bounds
        return coordinate.getX() >= 0 && coordinate.getX() < board.getRowSize() && coordinate.getY() >= 0 && coordinate.getY() < board.getRowSize();
    }
}
