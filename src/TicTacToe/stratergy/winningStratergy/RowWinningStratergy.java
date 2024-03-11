package TicTacToe.stratergy.winningStratergy;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStratergy implements WinningStratergy{
    Map<Integer, HashMap<Symbol,Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Move m, Board b) {

        // |0| - > {'x':1, 'O': 0}
        // |1| - > {'x':1, 'O': 0}
        // |2| - > {'x':1, 'O': 0}
        int row = m.getCell().getRow();
        Symbol s = m.getPlayer().getSymbol();

        if(!counts.containsKey(row)){
            counts.put(row, new HashMap<>());
        }

        HashMap<Symbol, Integer> hs = counts.get(row);
        if(!hs.containsKey(s)){
            hs.put(s, 0);
        }
        hs.put(s, hs.get(s)+1);

        return hs.get(s) == b.getSize();

    }

    @Override
    public void handleUndo(Move m, Board b) {
        int row = m.getCell().getRow();
        Symbol s = m.getPlayer().getSymbol();
        Map<Symbol, Integer> rowMap= counts.get(row);
        rowMap.put(s, rowMap.get(s)-1);

    }
}
