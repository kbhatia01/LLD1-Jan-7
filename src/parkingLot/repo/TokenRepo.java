package Repo;

import Models.Token;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class TokenRepo {
    int tokenId = 0;
   Map<Integer,Token> tokens = new TreeMap<>();
    public Token sveToken(Token t){
            t.setId(tokenId+1);
            tokens.put(t.getId(),t);
            tokenId++;
        return t;
    }
}
