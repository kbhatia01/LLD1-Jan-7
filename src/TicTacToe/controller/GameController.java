package TicTacToe.controller;

import TicTacToe.Exception.InvalidBotCount;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.stratergy.winningStratergy.WinningStratergy;

import java.util.List;

public class GameController {
    public Game StartGame(int dimension, List<Player> p,
                          List<WinningStratergy> winningStratergies)
            throws InvalidBotCount {

        Game game =  Game.getInstanceBuilder()
                .setDimension(dimension)
                .setPlayers(p)
                .setWinningStratergies(winningStratergies)
                .build();
        return game;
        // Game.getInstanceBuilder().addPlayer(p1).addPlayer(p2)....
//        .addWinningStrater(w1).addWinningStrater(w2)


    }
    public void displayBoard(Game game){
        game.getBoard().printBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState checkState(Game g){
        return g.getGameState();
    }

    public Player getWinner(Game g){
        return g.getWinner();
    }

    public void uno(Game g){
        // TODO: UNDO
    }




}


// client -> gameController
//1. start the game... -> create Game object..
//    1.1 create board and size of board;
//    1.2 add players;
//    1.3 select Symbol;
//

//2. While game state in progress:
//    2.1 Display the board
//    2.2. Make move..
//    2.3 next player..

// Based on game state we will display result:
//    3.1 DRAW: show board..
//      3.2 WIN: Show player

//4.  UNDO:


