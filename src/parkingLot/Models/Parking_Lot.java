package Models;

import java.util.List;

public class Parking_Lot extends Base_Model{
    private List<Parking_Floor> parkingFloors;
  private    int capacity;
  private List<Gate> gates;
  private   List<VEHICLE_TYPE> allowedVehicleTypes;

  private   PARKING_LOT_STATUS parkingLotStatus;

  private SlotAllocationStrategy slotAllocationStrategy;

  public List<Parking_Floor> getParkingFloors() {
    return parkingFloors;
  }

  public void setParkingFloors(List<Parking_Floor> parkingFloors) {
    this.parkingFloors = parkingFloors;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public List<Gate> getGates() {
    return gates;
  }

  public void setGates(List<Gate> gates) {
    this.gates = gates;
  }

  public List<VEHICLE_TYPE> getAllowedVehicleTypes() {
    return allowedVehicleTypes;
  }

  public void setAllowedVehicleTypes(List<VEHICLE_TYPE> allowedVehicleTypes) {
    this.allowedVehicleTypes = allowedVehicleTypes;
  }

  public PARKING_LOT_STATUS getParkingLotStatus() {
    return parkingLotStatus;
  }

  public void setParkingLotStatus(PARKING_LOT_STATUS parkingLotStatus) {
    this.parkingLotStatus = parkingLotStatus;
  }

  public SlotAllocationStrategy getSlotAllocationStrategy() {
    return slotAllocationStrategy;
  }

  public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
    this.slotAllocationStrategy = slotAllocationStrategy;
  }
}
