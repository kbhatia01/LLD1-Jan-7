package Service;

import Models.*;
import Repo.*;
import Strategy.SlotAssignmentStrategy;
import Strategy.slotStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TokenService {
    private GateRepo gateRepo;
    private VehicleRepo vehicleRepo;
    private ParkingLotRepo parkingLotRepo;
    private SlotRepo slotRepo;
    private TokenRepo tokenRepo;

    public TokenService(GateRepo gateRepo,VehicleRepo vehicleRepo,ParkingLotRepo parkingLotRepo,
                            SlotRepo slotRepo,TokenRepo tokenRepo){
        this.gateRepo = gateRepo;
        this.vehicleRepo= vehicleRepo;
        this.parkingLotRepo=parkingLotRepo;
        this.slotRepo = slotRepo;
        this.tokenRepo = tokenRepo;
    }
    public Token issueToken(String vehicleNumber,
                            String vehicleOwnerName,
                            int gateId,
                            VEHICLE_TYPE vehicleType) throws Exception{

        //1 create token

        Token t = new Token();
        t.setEntryTime(new Date());
        Gate g = gateRepo.findGateById(gateId);
        if(g.getParkingLot().getCapacity()<0){
            throw new Exception("Parking Lot Filled");
        }
        t.setGeneratedBy(g.getOperator());
        t.setGeneratedGate(g);
        Optional<Vehicle> vehicleOptional = vehicleRepo.findVehicleByNumber(vehicleNumber);
        Vehicle v;
        if(vehicleOptional.isEmpty()){
            Vehicle newVehicle = new Vehicle();
            newVehicle.setVehicleType(vehicleType);
            newVehicle.setVehicleRegNum(vehicleNumber);
            newVehicle.setOwnerName(vehicleOwnerName);
            v = vehicleRepo.saveVehicle(newVehicle);
        }
        else {
            v = vehicleOptional.get();
        }
        t.setVehicle(v);
        //2 assign slot and change status
        Parking_Lot p = parkingLotRepo.findParkinglotByGateid(g);
        SlotAllocationStrategy s = p.getSlotAllocationStrategy();
        SlotAssignmentStrategy sa = slotStrategyFactory.getSlotStrategy(s);
        Parking_Slot pl = sa.getSlot(vehicleType,g);
        t.setParkingSlot(pl);
        // updating slot status
                slotRepo.updateSlotStatusBYId(pl,PARKING_SLOT_STATUS.FILLED);
         // updating parking lot capacity
                parkingLotRepo.updateCapacity(p);
            t = tokenRepo.sveToken(t);
            t.setNumber("Token -- "+t.getId());

            //3 return token

                return t;
    }
}
