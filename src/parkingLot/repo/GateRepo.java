package Repo;

import Models.GATE_STATUS;
import Models.GATE_TYPE;
import Models.Gate;
import Models.Operator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GateRepo {


  private    Map<Integer,Gate> gates = new TreeMap<>();
    public Gate findGateById(int gateId){

        if(gates.containsKey(gateId))
            return gates.get(gateId);

        return null;
    }

    public   void saveGates(Gate g){
            int id = g.getId();
            gates.put(id,g);
    }
}
