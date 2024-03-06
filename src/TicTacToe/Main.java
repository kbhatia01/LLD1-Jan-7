package TicTacToe;

import TicTacToe.Exception.InvalidBotCount;
import TicTacToe.controller.GameController;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InvalidBotCount {
        GameController gc = new GameController();

        Game g = gc.StartGame(3, new ArrayList<>(), new ArrayList<>());
        gc.displayBoard(g);


        while (g.getGameState().equals(GameState.INPROGRESS)){
            gc.makeMove(g);
            gc.displayBoard(g);
        }

        if(g.getGameState().equals(GameState.DRAW)){
            System.out.println("Game draw!!!");
        } else if (g.getGameState().equals(GameState.SUCCESS)) {
            System.out.println("Game Winner" + g.getWinner().getName());
        }



    }
}
