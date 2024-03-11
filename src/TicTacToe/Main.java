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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidBotCount {

        Scanner sc = new Scanner(System.in);
        GameController gc = new GameController();

        try {
            int dimension = 3;

            List<Player> p = new ArrayList<>();
            p.add(new Player(1, "Karan", PlayerType.HUMAN, new Symbol('X')));
            p.add(new Bot(1, "Bot", new Symbol('O'), BotDificulty.EASY));

            List<WinningStratergy> ws = List.of(
                    new ColWinningStratergy(),
                    new RowWinningStratergy(),
                    new DiagonalWinningStratergy()
            );

            Game g = gc.StartGame(dimension, p, ws);
            gc.displayBoard(g);


            while (g.getGameState().equals(GameState.INPROGRESS)) {
                gc.makeMove(g);
                System.out.println("Want to undo press 1");
                int undoAnswer  = sc.nextInt();
                if(undoAnswer == 1){
                    System.out.println("undoing..");
                    gc.undo(g);
                }

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
