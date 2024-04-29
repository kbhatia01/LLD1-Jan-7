package Repo;

import Models.PARKING_SLOT_STATUS;
import Models.Parking_Slot;
import Models.VEHICLE_TYPE;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SlotRepo
{
      Map<Integer,Parking_Slot> slots = new TreeMap<>();


    public Parking_Slot updateSlotStatusBYId(Parking_Slot p, PARKING_SLOT_STATUS ps){

        p.setParkingSlotStatus(PARKING_SLOT_STATUS.FILLED);
        return p;
    }
    public void saveSlots(Parking_Slot s){

        int id = s.getId();
        slots.put(id,s);

    }
}
