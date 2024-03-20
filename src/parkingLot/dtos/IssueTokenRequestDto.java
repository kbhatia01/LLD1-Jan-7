package parkingLot.dtos;

import parkingLot.Model.VehicleType;

public class IssueTokenRequestDto {

    private String vehicleNumber;

    String OwnerName;

    int GateId;

    VehicleType vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public int getGateId() {
        return GateId;
    }

    public void setGateId(int gateId) {
        GateId = gateId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
