package Models;

public class Parking_Slot extends Base_Model{

   private int floorNumber;
  private   int slotNumber;
   private VEHICLE_TYPE vehicleType;
    private PARKING_SLOT_STATUS parkingSlotStatus;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VEHICLE_TYPE getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VEHICLE_TYPE vehicleType) {
        this.vehicleType = vehicleType;
    }

    public PARKING_SLOT_STATUS getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(PARKING_SLOT_STATUS parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }
}
