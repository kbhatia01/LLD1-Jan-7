package parkingLot.Model;

import java.util.List;

public class parkingFloor extends BaseModel{

    private List<ParkingSlots> parkingSlotsList;
    int floorNumber;

    ParkingFloorStatus floorStatus;

    public List<ParkingSlots> getParkingSlotsList() {
        return parkingSlotsList;
    }

    public void setParkingSlotsList(List<ParkingSlots> parkingSlotsList) {
        this.parkingSlotsList = parkingSlotsList;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ParkingFloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(ParkingFloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    List<VehicleType> allowedVehicles;
}
