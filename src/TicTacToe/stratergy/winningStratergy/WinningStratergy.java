package TicTacToe.stratergy.winningStratergy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface WinningStratergy {
    public boolean checkWinner(Move m, Board b);
    public void  handleUndo(Move m, Board b);
}
