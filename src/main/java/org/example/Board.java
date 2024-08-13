package org.example;

public class Board {

    // 2d characters of array
    private char[][] board;

    // size of board
    int size;

    // constructor
    public Board(int size) {
        this.size = size;
        // grid size
        board = new char[size][size];
        intitialiseBoard();

    }

    // initialise board

    private void intitialiseBoard() {
        for (int i =0; i<size; i++) {
            for (int j=0; j< size; j++) {
                // cells are empty initially
                board[i][j] = '-';
            }
        }
    }



    // applying the move




}
