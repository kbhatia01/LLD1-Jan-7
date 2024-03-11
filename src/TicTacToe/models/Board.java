package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;

    List<List<Cell>> board;


    public Board(int d){
        this.size = d;
        board = new ArrayList<>();
        for(int i=0;i<d;i++){
            board.add(new ArrayList<>());
            for (int j = 0; j < d; j++) {
                board.get(i).add(new Cell(i,j));
            }
        }
    }
    public List<List<Cell>> getBoard() {
        return board;
    }



    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printBoard(){
       for(List<Cell> row: board){
           for(Cell cell: row){
               cell.display();
           }
           System.out.println();
       }
    }
}
