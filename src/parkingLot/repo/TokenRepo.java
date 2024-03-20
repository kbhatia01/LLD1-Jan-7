package parkingLot.repo;

import parkingLot.Model.Token;

import java.util.Map;
import java.util.TreeMap;

public class TokenRepo {

    private int PreviousTokenId = 0;
    private Map<Integer, Token> tokens = new TreeMap<>();

    public Token SaveToken(Token t){
        int newId = PreviousTokenId+1;
        t.setId(newId);
        tokens.put(newId, t);
        this.PreviousTokenId+=1;
        return t;

    }
}
