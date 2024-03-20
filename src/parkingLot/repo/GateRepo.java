package parkingLot.repo;

import parkingLot.Model.Gate;

import java.util.Map;
import java.util.TreeMap;

public class GateRepo {
    private Map<Integer, Gate> gates = new TreeMap<>();
    public Gate findGateById(int gateId){


        if(gates.containsKey(gateId)){
            return gates.get(gateId);
        }

        return null;
    }
}
