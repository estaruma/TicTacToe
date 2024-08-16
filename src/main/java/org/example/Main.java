package org.example;

public class Main {
    public static void main(String[] args) {
        // Player 1 - "X" and Player 2 - "O"
        Player player1 = new Player("Player 1", "X");
        Player player2 = new Player("Player 2", "O");

        // Start the game
        GameEval game = new GameEval(player1, player2);
        game.play();
    }
}