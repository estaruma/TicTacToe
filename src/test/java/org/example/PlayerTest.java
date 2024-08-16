package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    public void playerInitiliasationTest() {
        Player player = new Player("Player 1", "X");
        assertEquals("Player 1", player.getName());
        assertEquals("X", player.getSymbol());
    }

}