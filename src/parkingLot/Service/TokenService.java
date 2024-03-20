package parkingLot.Service;

import parkingLot.Model.*;
import parkingLot.Stratergy.getSlotStartergyFactory;
import parkingLot.repo.*;

import java.util.Date;
import java.util.Optional;

public class TokenService {
    private GateRepo gateRepo;
    private VehicleRepo vehicleRepo;
    private ParkingLotRepo parkingLotRepo;
    private ParkingSlotRepo parkingSlotRepo;
    private TokenRepo tokenRepo;

    TokenService(GateRepo gateRepo, VehicleRepo vehicleRepo,
                 ParkingLotRepo parkingLotRepo,
                 ParkingSlotRepo parkingSlotRepo,
    TokenRepo tokenRepo){
        this.gateRepo = gateRepo;
        this.vehicleRepo = vehicleRepo;
        this.parkingLotRepo = parkingLotRepo;
        this.parkingSlotRepo = parkingSlotRepo;
        this.tokenRepo = tokenRepo;
    }
    public Token issueToken(String VehicleNumber,
                            String vehicleOwnerName,
                            int gateId,
                            VehicleType vehicleType){
        // 1. create a token object
        Token t = new Token();
        t.setEntryTime(new Date());
        Gate g = gateRepo.findGateById(gateId);
        t.setGenratedGate(g);
        t.setGenratedBy(g.getOperator());
        Vehicle v;
        Optional<Vehicle> vOptional= vehicleRepo.findByVehicleNumber(VehicleNumber);
        if(vOptional.isEmpty()){
            Vehicle newVehicle = new Vehicle();
            newVehicle.setVehicleName(VehicleNumber);
            newVehicle.setVehicleType(vehicleType);
            newVehicle.setOwnerName(vehicleOwnerName);
            v = vehicleRepo.saveVehicle(newVehicle);
        } else {
            v= vOptional.get();
        }

        t.setVehicle(v);



        // 2. assign a slot and change slot status..

        SlotAssignmentStratergyEnum  startergyVal= parkingLotRepo.getByGateId(g).getParkingLotStratergy();

        ParkingSlots parkingSlots = getSlotStartergyFactory.getSlotStratergyBasedOnType(startergyVal).getSlot(vehicleType, g);

        t.setParkingSlots(parkingSlots);
        parkingSlotRepo.UpdateSlotById(parkingSlots, ParkingSLotStatus.FILLED);


        Token finalToken = tokenRepo.SaveToken(t);


        // 3. return token

        return finalToken;
    }
}
