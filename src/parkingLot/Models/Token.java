package Models;

import java.util.Date;

public class Token extends  Base_Model{
    private String number;
    private   Vehicle vehicle;
    private Gate generatedGate;
    private   Date entryTime;
    private Operator generatedBy;

    private   Parking_Slot parkingSlot;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getGeneratedGate() {
        return generatedGate;
    }

    public void setGeneratedGate(Gate generatedGate) {
        this.generatedGate = generatedGate;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public Parking_Slot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(Parking_Slot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }


}
