package TicTacToe.models;

import java.util.Scanner;

public class Player {
    private int id;
    private String Name;
    private PlayerType playerType;
    private Symbol symbol;

    Scanner scanner;
    public Player(int id, String name, PlayerType p, Symbol s){
        this.playerType = p;
        this.id = id;
        this.Name = name;
        this.symbol = s;
        this.scanner = new Scanner(System.in);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Move makeMove(Board b){
        System.out.println("Please mention row");
        int row = scanner.nextInt();
        System.out.println("Please mention Col");
        int col = scanner.nextInt();

        return new Move(new Cell(row, col), this);
    }
}
