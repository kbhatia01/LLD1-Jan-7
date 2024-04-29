package Models;

import java.util.List;

public class Parking_Floor extends Base_Model{
    int floorNumber;
    List<Parking_Slot> parkingSlots;
    PARKING_FLOOR_STATUS parkingFloorStatus;
    List<VEHICLE_TYPE> allowedVehicleTypes;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Parking_Slot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<Parking_Slot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public PARKING_FLOOR_STATUS getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(PARKING_FLOOR_STATUS parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<VEHICLE_TYPE> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<VEHICLE_TYPE> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }
}
