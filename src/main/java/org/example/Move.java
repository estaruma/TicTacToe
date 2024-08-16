package org.example;

// move on the board and user input, row, column, symbol

public class Move {
    private int row;
    private int column;
    private char playerSymbol;



    // constructor

    public Move(int row, int column, char playerSymbol) {
        this.row = row;
        this.column = column;
        this.playerSymbol = playerSymbol;
    }

    // getters

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public char getPlayerSymbol() {
        return playerSymbol;
    }
}
