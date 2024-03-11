package TicTacToe.models;

import TicTacToe.Exception.InvalidBotCount;
import TicTacToe.stratergy.winningStratergy.WinningStratergy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private int nextPlayerTurn;

    private GameState gameState;

    private List<WinningStratergy> winningStratergies;


    private Game(int dimension, List<Player> players, List<WinningStratergy> ws){
        this.board = new Board(dimension);
        this.players = players;
        this.nextPlayerTurn = 0;
        this.winningStratergies = ws;
        this.gameState = GameState.INPROGRESS;
        this.winner = null;
        this.moves = new ArrayList<>();
    }
    public List<WinningStratergy> getWinningStratergies() {
        return winningStratergies;
    }

    public void setWinningStratergies(List<WinningStratergy> winningStratergies) {
        this.winningStratergies = winningStratergies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerTurn() {
        return nextPlayerTurn;
    }

    public void setNextPlayerTurn(int nextPlayerTurn) {
        this.nextPlayerTurn = nextPlayerTurn;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public boolean validate(Move m){
        int row = m.getCell().getRow();
        int col = m.getCell().getCol();

        if (row>board.getSize()){
            return false;
        }
        if (col>board.getSize()){
            return false;
        }
        return board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }
    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerTurn);
        System.out.println("Current turn is " + currentPlayer.getName());
        Move m = currentPlayer.makeMove(board);

        if(!validate(m)){
            System.out.println("invalid move!!");
            return;
        }
        int row = m.getCell().getRow();
        int col = m.getCell().getCol();
        Cell cellToUpdate = board.getBoard().get(row).get(col);
        cellToUpdate.setCellState(CellState.FILLED);
        cellToUpdate.setPlayer(currentPlayer);

        Move finalMove = new Move(cellToUpdate, currentPlayer);

        moves.add(finalMove);

        nextPlayerTurn +=1;
        nextPlayerTurn %= players.size();

        if(checkWinner(board, finalMove)){
            gameState = GameState.SUCCESS;
            winner = currentPlayer;
        } else if(moves.size() == board.getSize()*board.getSize()){
            gameState = GameState.DRAW;
        }

        System.out.println("Player" + currentPlayer.getName() + " moved at "+ row + " , "+ col);

    }

    public boolean checkWinner(Board b, Move m){
        for (WinningStratergy w:winningStratergies){
            if(w.checkWinner(m, b)){
                return true;
            }
        }
        return false;
    }

    public void undo(){
        if(moves.isEmpty()){
            System.out.println("No moves left...");
            return;
        }
        Move m = moves.get(moves.size()-1);
        moves.removeLast();
        Cell c = board.getBoard().get(m.getCell().getRow()).get(m.getCell().getCol());
        c.setPlayer(null);
        c.setCellState(CellState.EMPTY);
        nextPlayerTurn -=1;
        nextPlayerTurn = (nextPlayerTurn+players.size()) %players.size();
        for(WinningStratergy ws : winningStratergies){
            ws.handleUndo(m, board);
        }
    }

    public static Builder getInstanceBuilder(){
        return new Builder();
    }

    public static class Builder{
        private List<Player> players;

        private int dimension;

        private List<WinningStratergy> winningStratergies;

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }


        public int getDimension() {
            return dimension;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public List<WinningStratergy> getWinningStratergies() {
            return winningStratergies;
        }

        public Builder setWinningStratergies(List<WinningStratergy> winningStratergies) {
            this.winningStratergies = winningStratergies;
            return this;
        }


        public void validate() throws InvalidBotCount{
            int botCount = 0;
            for(Player p: players){
                if(p.getPlayerType().equals(PlayerType.BOT)){
                    botCount+=1;
                }
            }
            if(botCount>1){
                throw new InvalidBotCount();
            }

            if(players.size() != dimension-1){
                throw new IllegalArgumentException();
            }
            //TODO:  SYMBOL VALIDATION
        }
        public Game build() throws InvalidBotCount{
            validate();
            return new Game(this.dimension, this.players, this.winningStratergies);
        }
    }
}
