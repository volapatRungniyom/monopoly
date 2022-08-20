package com.company;

public class Player {
    private String name;
    private Die[] dice;
    private Board board;
    private Piece piece;

    public void takeTurn(){
        int fvTot = 0;
        for (Die die: dice){
            die.roll();
            fvTot += die.getFaceValue();
        }


        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc,fvTot);
        piece.setLocation(newLoc);

    }
}
