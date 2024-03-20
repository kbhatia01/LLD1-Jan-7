package parkingLot.dtos;

import parkingLot.Model.*;

import java.util.Date;

public class IssueTokenResponseDTO {

    Token token;

    private ResponseStatus responseStatus;

    private String failureMsg;

    public String getFailureMsg() {
        return failureMsg;
    }

    public void setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    String number;

    Date entryTime;

    Vehicle vehicle;

    ParkingSlots parkingSlots;

    Gate genratedGate;

    Operator genratedBy;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlots getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(ParkingSlots parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Gate getGenratedGate() {
        return genratedGate;
    }

    public void setGenratedGate(Gate genratedGate) {
        this.genratedGate = genratedGate;
    }

    public Operator getGenratedBy() {
        return genratedBy;
    }

    public void setGenratedBy(Operator genratedBy) {
        this.genratedBy = genratedBy;
    }
}
