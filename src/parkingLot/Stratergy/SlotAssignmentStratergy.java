package parkingLot.Stratergy;

import parkingLot.Model.Gate;
import parkingLot.Model.ParkingSlots;
import parkingLot.Model.VehicleType;

public interface SlotAssignmentStratergy {

    public ParkingSlots getSlot(VehicleType vehicleType, Gate gate);

}

//gate -> parkingLot
// parkingLot -> floor
// floor -> slot...