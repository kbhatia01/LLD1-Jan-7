package parkingLot.repo;

import parkingLot.Model.Gate;
import parkingLot.Model.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepo {

    private Map<Integer, ParkingLot> parkingLots = new TreeMap<>();
//    private Map<Integer, ParkingLot> GateIdToParkingLot = new TreeMap<>();

    public ParkingLot getByGateId(Gate g){
        for (ParkingLot parkingLot: parkingLots.values()){
            if(parkingLot.getGates().contains(g)){
                return parkingLot;
            }
        }

        return null;

    }
}
