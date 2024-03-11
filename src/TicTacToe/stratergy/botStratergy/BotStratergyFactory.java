package TicTacToe.stratergy.botStratergy;

import TicTacToe.models.BotDificulty;

public class BotStratergyFactory {

    public static BotStatergy getStratergyBasedOnLevel(BotDificulty b){
        if(b.equals(BotDificulty.EASY)){
            return new EasyBotStratergy();
        }
        return null;
    }
}
