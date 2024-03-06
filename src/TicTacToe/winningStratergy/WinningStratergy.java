package TicTacToe.winningStratergy;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public interface WinningStratergy {
    public boolean checkWinner(Player p, Board b);
}
