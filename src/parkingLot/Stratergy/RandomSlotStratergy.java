package parkingLot.Stratergy;

import parkingLot.Model.Gate;
import parkingLot.Model.ParkingSlots;
import parkingLot.Model.VehicleType;

public class RandomSlotStratergy implements SlotAssignmentStratergy{

    @Override
    public ParkingSlots getSlot(VehicleType vehicleType, Gate gate) {
        // using gate get parking lot
//        from parking lot get floor with same vehicle type
//        from floor get slot with same vehicleType and status = empty..

        return null;
    }
}
