package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board board = new Board();

    @Test
    public void boardInitialisingTest() {


        char[][] expectedBoard = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        // get actual board from board object
        char[][] actualBoard = board.getBoard();

        // for comparison
        for (int i =0; i<3; i++) {
            for (int j=0; j<3; j++) {
                assertEquals(expectedBoard[i][j], actualBoard[i][j]);
            }
        }
    }

    @Test
    public void placeSymbolTest() {
        boolean sucess = board.placeSymbol(0,0, 'X');
        assertTrue(sucess);
        assertEquals('X', board.getBoard()[0][0]);

        sucess = board.placeSymbol(0,0, '0');
        assertFalse(sucess);
        assertEquals('X', board.getBoard()[0][0]);

    }

}