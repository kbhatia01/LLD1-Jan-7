package parkingLot.Model;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<parkingFloor> parkingFloors;

    private List<Gate> gates;

    List<VehicleType> allowedVehicles;

    int capacity;

    private ParkingLotStatus status;

    public SlotAssignmentStratergyEnum getParkingLotStratergy() {
        return parkingLotStratergy;
    }

    public void setParkingLotStratergy(SlotAssignmentStratergyEnum parkingLotStratergy) {
        this.parkingLotStratergy = parkingLotStratergy;
    }

    private SlotAssignmentStratergyEnum parkingLotStratergy;

    public List<parkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<parkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }
}
