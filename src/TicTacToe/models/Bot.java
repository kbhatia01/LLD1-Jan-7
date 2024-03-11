package TicTacToe.models;

import TicTacToe.stratergy.botStratergy.BotStatergy;
import TicTacToe.stratergy.botStratergy.BotStratergyFactory;

public class Bot extends Player{

    BotDificulty botDificulty;

    BotStatergy startergy;

    public BotDificulty getBotDificulty() {
        return botDificulty;
    }

    public Bot(int id, String name, Symbol s, BotDificulty botDificulty){
        super(id, name, PlayerType.BOT, s);
        this.botDificulty = botDificulty;
        this.startergy = BotStratergyFactory.getStratergyBasedOnLevel(botDificulty);
    }

    public void setBotDificulty(BotDificulty botDificulty) {
        this.botDificulty = botDificulty;
    }

    public Move makeMove(Board b){
        Move m = startergy.makeMove(b);
        m.setPlayer(this);
        return m;
    }
}
