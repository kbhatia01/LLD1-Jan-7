package TicTacToe.stratergy.winningStratergy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStratergy implements WinningStratergy{

    HashMap<Symbol,Integer> counts1 = new HashMap<>();
    HashMap<Symbol,Integer> counts2 = new HashMap<>();

    @Override
    public boolean checkWinner(Move m, Board b) {

        // left diagonal i==j
        // right diagonal = i+j == n-1

        int col = m.getCell().getCol();
        int row = m.getCell().getRow();
        Symbol s = m.getPlayer().getSymbol();

        if(row==col){
            if(!counts1.containsKey(s)){
                counts1.put(s, 0);
            }

            counts1.put(s, counts1.get(s)+1);

            if( counts1.get(s) == b.getSize()){
                return true;
            }
        } else if(row+col == b.getSize()-1){
            if(!counts2.containsKey(s)){
                counts2.put(s, 0);
            }

            counts2.put(s, counts2.get(s)+1);

            if( counts2.get(s) == b.getSize()){
                return true;
            }
        }
        return false;

    }

    public void handleUndo(Move m, Board b) {
        int row = m.getCell().getRow();
        int col = m.getCell().getCol();
        Symbol s = m.getPlayer().getSymbol();

        if(row == col){
            counts1.put(s, counts1.get(s)-1);
        } else if (row+col == b.getSize()-1) {
            counts2.put(s, counts2.get(s)-1);
        }

    }
}
