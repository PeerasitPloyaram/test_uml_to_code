package org.example;

public class MGame {
    private int N = 20;
    private int roundCnt;
    private Board board;
    private Player[] players;
    private Die[] dice;

    public void PlayGame(){
        for (roundCnt = 0 ; roundCnt < N; roundCnt++){
            PlayRound();
        }
    }

    private void PlayRound(){
        for (Player player : players){
            player.TakeTurn();
        }

    }
}
