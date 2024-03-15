package parkingLot.dtos;

import parkingLot.Model.VehicleType;

public class IssueTokenRequestDto {

    private String vehicleNumber;

    String OwnerName;

    long GateId;

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

    public long getGateId() {
        return GateId;
    }

    public void setGateId(long gateId) {
        GateId = gateId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
