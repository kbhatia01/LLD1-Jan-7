package Strategy;

import Models.Gate;
import Models.Parking_Slot;
import Models.VEHICLE_TYPE;

public interface SlotAssignmentStrategy {

    public Parking_Slot getSlot(VEHICLE_TYPE v, Gate gate);

}
