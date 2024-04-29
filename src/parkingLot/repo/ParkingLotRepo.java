package Repo;

import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepo {

     Map<Integer,Parking_Lot> parkingLots = new TreeMap<>();
    Map<Integer, Parking_Lot> gateToParkingLotMap = new TreeMap<>();

    public Parking_Lot findParkinglotByGateid(Gate gate){

        int gateid = gate.getId();
        if(gateToParkingLotMap.containsKey(gateid))
            return gateToParkingLotMap.get(gateid);

        return null;
    }

    public void updateCapacity(Parking_Lot p){
        int capacity = p.getCapacity();
        if(capacity>0){
            capacity--;
            p.setCapacity(capacity);
        }
        if(capacity ==0)
            p.setParkingLotStatus(PARKING_LOT_STATUS.FILLED);

    }

     public void saveParkingLot(Parking_Lot parkingLot){
        int id = parkingLot.getId();
        parkingLots.put(id,parkingLot);
        List<Gate> gates = parkingLot.getGates();
        for(Gate g : gates){
            int gateid = g.getId();
            gateToParkingLotMap.put(gateid,parkingLot);
        }
     }
}
