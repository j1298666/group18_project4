package edu.oregonstate.cs361.battleship;

/**
 * Created by michaelhilton on 1/8/17.
 */
public class Coordinate {
    private int Across;
    private int Down;

    public Coordinate(int letter, int number) {
        Across = letter;
        Down = number;
    }

    public int getDown() {
        return Down;
    }
    public int getAcross() {
        return Across;
    }


}
