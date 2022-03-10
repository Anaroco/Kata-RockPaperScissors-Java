package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import com.factoriaf5.rps.application.Game;

import org.junit.Test;

public class GameTest {

    @Test
    public void rock_win_scissor(){
        Game game = new Game();
        Rock player1 = new Rock();
        Scissors player2 = new Scissors();

        String result = game.play(player1.getName(),player2.getName() );

        assertEquals("Rock win", result);
    }

    @Test
    public void rock_win_scissor_reverse(){
        Game game = new Game();
         Scissors player1 = new Scissors();
         Rock player2 = new Rock();

        String result = game.play(player1.getName(),player2.getName() );

        assertEquals("Rock win", result);
    }
    
}
