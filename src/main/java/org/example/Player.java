package org.example;

public class Player {
    private String name;
    private Board board;

    private Piece piece;

    private Die[] dice;

    public void TakeTurn(){
        int fvTotal = 0;
        for (Die die : dice){
            die.roll();
            fvTotal += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquares(oldLoc,fvTotal);
        piece.setLocation(newLoc);
    }
}
