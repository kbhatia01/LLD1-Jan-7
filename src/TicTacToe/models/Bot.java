package TicTacToe.models;

public class Bot extends Player{

    BotDificulty botDificulty;

    public BotDificulty getBotDificulty() {
        return botDificulty;
    }

    public void setBotDificulty(BotDificulty botDificulty) {
        this.botDificulty = botDificulty;
    }
}
