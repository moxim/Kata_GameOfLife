package com.pdg.software.kata.gameoflife;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameOfLifeTest {

    @Test
    public void testGenerate() {
        GameOfLife sut = new GameOfLife(null);
        int[][] nextGeneration = sut.generate();
        assertNotNull(nextGeneration);
    }
}
