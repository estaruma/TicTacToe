package org.example;

// tic-tac-toe board
// manages the state of the game board
// displays the board
// and updates the board with player

public class Board {

    // 2d characters of array
    private char[][] board;

    // size of board
    private static final int SIZE = 3;

    // constructor to initilialise board and cells set to empty
    public Board() {
        board = new char[SIZE][SIZE];
        for (int i=0; i<SIZE; i++) {
            for (int j = 0; j<SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // method to place symbol on specific row and column
    public boolean placeSymbol(int row, int col, char mark) {
        // check if within bounds and empty
        if (row < 0 || row >= SIZE || col <0 || col >= SIZE || board[row][col] != ' ') {
            return false;
        }
        // place symbol if criteria above matches
        board[row][col] = symbol;
        return true;
    }


    // check if board is full
    // iterates over cells and finds any ' '
    // false - not full
    public boolean isFull() {
        for (int i = 0; i< SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }





    // display current board
    public void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                System.out.println(board[i][j]);
                // print lines - colomns and rows
            }





    }

    }






}
