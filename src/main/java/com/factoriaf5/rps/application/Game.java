package com.factoriaf5.rps.application;

public class Game {

    public String play(String player1, String player2) {

        String winner = this.checkWinner(player1, player2);
        return winner;

    }

    public String checkWinner(String player1, String player2) {

        if (player1 == "Rock" && player2 == "Scissors") {
            return "Rock win";
        }

        if (player1 == "Scissors" && player2 == "Rock") {
            return "Rock win";
        }

        if (player1 == "Rock" && player2 == "Paper") {
            return "Paper win";
        }
        
        if (player1 == "Paper" && player2 == "Rock") {
            return "Paper win";
        }
       
        if (player1 == "Scissors" && player2 == "Paper") {
            return "Scissors win";
        }
        
        if (player1 == "Paper" && player2 == "Scissors") {
            return "Scissors win";
        }

        return  "draw";
    }
    
}
