package TicTacToe.stratergy.winningStratergy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public class RowWinningStratergy implements WinningStratergy{
    @Override
    public boolean checkWinner(Move m, Board b) {
        return false;
    }
}
