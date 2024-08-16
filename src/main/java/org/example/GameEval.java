package org.example;


import java.util.Scanner;

// status of the current game and evaluates winner & loser
public class GameEval {

    private Board board;
    private Player player1;
    private Player player2;

    private Player currentPlayer;


    // constructor

    public GameEval(Player player1, Player player2) {
        this.board = new Board();
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;

    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    // for testing purpose
    public Board getBoard() {
        return board;
    }

    // switch player after each turn

    protected void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    // checks rows for a win
    private boolean checkRows(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board.placeSymbol(i, 0, symbol) &&
                    board.placeSymbol(i, 1, symbol) &&
                    board.placeSymbol(i, 2, symbol)) {
                return true;
            }
        }
        return false;
    }

    // check column for win

    private boolean checkColumns(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board.placeSymbol(0, i, symbol) &&
                    board.placeSymbol(1, i, symbol) &&
                    board.placeSymbol(2, i, symbol)) {
                return true;
            }
        }
        return false;
    }

    // diagonal check
    private boolean checkDiagonals(char symbol) {
        return (board.placeSymbol(0, 0, symbol) &&
                board.placeSymbol(1, 1, symbol) &&
                board.placeSymbol(2, 2, symbol)) ||
                (board.placeSymbol(0, 2, symbol) &&
                        board.placeSymbol(1, 1, symbol) &&
                        board.placeSymbol(2, 0, symbol));
    }

    protected boolean hasWon() {
        char symbol = currentPlayer.getSymbol().charAt(0);
        return checkRows(symbol) || checkColumns(symbol) || checkDiagonals(symbol);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.displayBoard();
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + "), enter your move: ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            // move object
            Move move = new Move(row, col, currentPlayer.getSymbol().charAt(0));

            if (board.placeSymbol(move.getRow(), move.getColumn(), move.getPlayerSymbol())) {
                // win/ draw
                if (hasWon()) {
                    board.displayBoard();
                    System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + ") wins!");
                    break;
                } else if (board.isFull()) {
                    board.displayBoard();
                    System.out.println("Draw!");
                    break;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("This move is not valid. Try again.");
            }
        }

        scanner.close();
    }

}
