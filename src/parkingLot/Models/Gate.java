package Models;

public class Gate extends Base_Model{
   private int gateNumber;
    private GATE_TYPE gateType;

    private Operator operator;
    private GATE_STATUS gateStatus;

    private Parking_Lot parkingLot;

    public Parking_Lot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(Parking_Lot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GATE_TYPE getGateType() {
        return gateType;
    }

    public void setGateType(GATE_TYPE gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GATE_STATUS getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GATE_STATUS gateStatus) {
        this.gateStatus = gateStatus;
    }
}
