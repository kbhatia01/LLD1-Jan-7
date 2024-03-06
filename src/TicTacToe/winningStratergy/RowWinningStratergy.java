package TicTacToe.winningStratergy;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public class RowWinningStratergy implements WinningStratergy{
    @Override
    public boolean checkWinner(Player p, Board b) {
        return false;
    }
}
