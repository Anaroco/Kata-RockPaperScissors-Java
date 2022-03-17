package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {
    
    @Test
    public void isaRock() {

        Rock obj = new Rock();
        String result =obj.getName();
        assertEquals("Rock", result);
    }
}
