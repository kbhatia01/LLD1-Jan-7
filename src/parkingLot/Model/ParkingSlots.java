package parkingLot.Model;

public class ParkingSlots extends BaseModel{

    private int slotNumber;
    VehicleType vehicleType;

    ParkingSLotStatus parkingSLotStatus;

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSLotStatus getParkingSLotStatus() {
        return parkingSLotStatus;
    }

    public void setParkingSLotStatus(ParkingSLotStatus parkingSLotStatus) {
        this.parkingSLotStatus = parkingSLotStatus;
    }

    public parkingLot.Model.parkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(parkingLot.Model.parkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    parkingFloor parkingFloor;
}
