package TicTacToe;

import TicTacToe.Exception.InvalidBotCount;
import TicTacToe.controller.GameController;
import TicTacToe.models.*;
import TicTacToe.stratergy.winningStratergy.ColWinningStratergy;
import TicTacToe.stratergy.winningStratergy.DiagonalWinningStratergy;
import TicTacToe.stratergy.winningStratergy.RowWinningStratergy;
import TicTacToe.stratergy.winningStratergy.WinningStratergy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidBotCount {
        GameController gc = new GameController();

        try {
            int dimension = 3;

            List<Player> p = new ArrayList<>();
            p.add(new Player(1, "Karan", PlayerType.HUMAN, new Symbol('X')));
            p.add(new Bot(1, "Karan", new Symbol('X'), BotDificulty.EASY));

            List<WinningStratergy> ws = List.of(
                    new ColWinningStratergy(),
                    new RowWinningStratergy(),
                    new DiagonalWinningStratergy()
            );

            Game g = gc.StartGame(dimension, p, ws);
            gc.displayBoard(g);


            while (g.getGameState().equals(GameState.INPROGRESS)) {
                gc.makeMove(g);
                gc.displayBoard(g);
            }



            if (g.getGameState().equals(GameState.DRAW)) {
                System.out.println("Game draw!!!");
            } else if (g.getGameState().equals(GameState.SUCCESS)) {
                System.out.println("Game Winner" + g.getWinner().getName());
            }


        } catch (Exception e) {
            throw e;
        }
    }
}
