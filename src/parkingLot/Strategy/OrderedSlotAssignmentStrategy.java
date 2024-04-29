package Strategy;

import Models.*;

import java.util.ArrayList;
import java.util.List;

public class OrderedSlotAssignmentStrategy implements SlotAssignmentStrategy{

    @Override
    public Parking_Slot getSlot(VEHICLE_TYPE v, Gate gate) {

        List<Parking_Slot> slots = new ArrayList<>();
        Parking_Lot pl = gate.getParkingLot();
        for(Parking_Floor pf : pl.getParkingFloors()){
            if(pf.getAllowedVehicleTypes().contains(v)){
              return  pf.getParkingSlots().stream().
                    filter(x->x.getParkingSlotStatus().equals(PARKING_SLOT_STATUS.EMPTY) &&
                    x.getVehicleType().equals(v)).findFirst().orElse(null);
            }
        }

        return null;
    }
}
