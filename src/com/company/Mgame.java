package com.company;

public class Mgame {
    private int roundCnt;
    private Die[] dice;
    private Player[] players;
    private Board board;
    private static final int n = 20;

    public Mgame() {

    }

    public void playerGame(){
        for (roundCnt = 0;roundCnt < n;roundCnt++){
            playRound();
        }
    }
    private void playRound(){
        for (Player player : players){
            player.takeTurn();
        }
    }
}
