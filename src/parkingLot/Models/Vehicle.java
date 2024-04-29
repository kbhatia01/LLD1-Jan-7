package Models;

public class Vehicle extends Base_Model
{

  private String ownerName;

  private String vehicleRegNum;

  private VEHICLE_TYPE vehicleType;

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getVehicleRegNum() {
    return vehicleRegNum;
  }

  public void setVehicleRegNum(String vehicleRegNum) {
    this.vehicleRegNum = vehicleRegNum;
  }

  public VEHICLE_TYPE getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VEHICLE_TYPE vehicleType) {
    this.vehicleType = vehicleType;
  }
}
