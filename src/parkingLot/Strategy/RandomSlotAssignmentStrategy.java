package Strategy;

import Models.*;

import java.util.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy{




    @Override
    public Parking_Slot getSlot(VEHICLE_TYPE vehicleType, Gate gate) {
        List<Parking_Slot> slots = new ArrayList<>();
        Parking_Lot pl = gate.getParkingLot();
        for(Parking_Floor pf : pl.getParkingFloors()){
            if(pf.getAllowedVehicleTypes().contains(vehicleType)){
                for(Parking_Slot sl : pf.getParkingSlots()){
                    if(sl.getVehicleType().equals(vehicleType) && sl.getParkingSlotStatus().equals(PARKING_SLOT_STATUS.EMPTY)){
                        slots.add(sl);
                    }
                }
            }
        }

        int size = slots.size();
        int randomNum = (int) (Math.random() * size);
      Parking_Slot ps = slots.get(randomNum);

        return ps;
    }




}
