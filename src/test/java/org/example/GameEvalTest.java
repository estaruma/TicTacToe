package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameEvalTest {

    Player player1 = new Player("Player 1", "X");

    Player player2 = new Player("Player 2", "O");

    GameEval gameEval = new GameEval(player1, player2);


    @Test
    public void swtichPlayerTest() {

        assertEquals(player1, gameEval.getCurrentPlayer());

        // after calling switchPlayer, the current pplayer should be player2
        gameEval.switchPlayer();
        assertEquals(player2, gameEval.getCurrentPlayer());

        // calling switchPlayer() again to switch back
        gameEval.switchPlayer();
        assertEquals(player1, gameEval.getCurrentPlayer());
    }

    @Test
    public void WinTest() {
        gameEval.getBoard().placeSymbol(0,0, 'X');
        gameEval.getBoard().placeSymbol(0,0, 'X');
        gameEval.getBoard().placeSymbol(0,0, 'X');

        assertTrue(gameEval.hasWon());

    }

    @Test
    public void testDraw() {
        gameEval.getBoard().placeSymbol(0,0,'X');
        gameEval.getBoard().placeSymbol(0,1,'O');
        gameEval.getBoard().placeSymbol(0,2,'X');
        gameEval.getBoard().placeSymbol(1,0,'X');
        gameEval.getBoard().placeSymbol(1,1,'O');
        gameEval.getBoard().placeSymbol(1,2,'X');
        gameEval.getBoard().placeSymbol(2,0,'0');
        gameEval.getBoard().placeSymbol(2,1,'X');
        gameEval.getBoard().placeSymbol(2,2,'0');
    }



}