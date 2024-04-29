import Controller.TokenController;
import DTO.IssueTokenRequestDto;
import DTO.IssueTokenResponseDto;
import Models.*;
import Repo.*;
import Service.TokenService;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GateRepo gateRepo = new GateRepo();
        SlotRepo slotRepo = new SlotRepo();


        ParkingLotRepo parkingLotRepo = new ParkingLotRepo();

        TokenRepo tokenRepo = new TokenRepo();
        VehicleRepo vehicleRepo = new VehicleRepo();




        // Creating operators
        Operator operator1 = new Operator();
        operator1.setId(1);
        operator1.setEmp_id("EMP1");
        operator1.setName("Operator 1");

        Operator operator2 = new Operator();
        operator2.setId(2);
        operator2.setEmp_id("EMP2");
        operator2.setName("Operator 2");

        // Creating Gates

       List<Gate> gates = new ArrayList<>();

        Gate gate1 = new Gate();
        gate1.setId(1);
        gate1.setGateNumber(1);
        gate1.setGateStatus(GATE_STATUS.OPEN);
        gate1.setGateType(GATE_TYPE.ENTRY);
        gate1.setOperator(operator1);
            gates.add(gate1);
        gateRepo.saveGates(gate1);

        Gate gate2 = new Gate();
        gate2.setId(2);
        gate2.setGateNumber(2);
        gate2.setGateStatus(GATE_STATUS.OPEN);
        gate2.setGateType(GATE_TYPE.EXIT);
        gate2.setOperator(operator2);
            gates.add(gate2);
        gateRepo.saveGates(gate2);
        // creating parking slots

        List<Parking_Slot> parkingSlots = new ArrayList<>();
        for(int i=1;i<=2;i++){
            // creating slots
            Parking_Slot slot = new Parking_Slot();
            slot.setId(i);
            slot.setSlotNumber(i);
            slot.setParkingSlotStatus(PARKING_SLOT_STATUS.EMPTY);
            if(i%2==0){
                slot.setVehicleType(VEHICLE_TYPE.CAR);
            }
            else  {
                slot.setVehicleType(VEHICLE_TYPE.TRUCK);
            }
            slot.setFloorNumber(1);
            parkingSlots.add(slot);
            slotRepo.saveSlots(slot);
        }

        // Creating Parking floor

        List<Parking_Floor> parkingFloors = new ArrayList<>();
        Parking_Floor parkingFloor = new Parking_Floor();
        parkingFloor.setId(1);
        parkingFloor.setFloorNumber(1);
        parkingFloor.setParkingFloorStatus(PARKING_FLOOR_STATUS.AVAILABLE);
        parkingFloor.setParkingSlots(parkingSlots);
        parkingFloor.setAllowedVehicleTypes(List.of(VEHICLE_TYPE.CAR,VEHICLE_TYPE.TRUCK));
        parkingFloors.add(parkingFloor);



        // Creating Parking Lot

        Parking_Lot parkingLot = new Parking_Lot();
        parkingLot.setId(1);
        parkingLot.setGates(gates);
        parkingLot.setParkingFloors(parkingFloors);
        parkingLot.setCapacity(2);
        parkingLot.setParkingLotStatus(PARKING_LOT_STATUS.AVAILABLE);
        parkingLot.setAllowedVehicleTypes(List.of(VEHICLE_TYPE.CAR,VEHICLE_TYPE.TRUCK));
        parkingLot.setSlotAllocationStrategy(SlotAllocationStrategy.ORDERED);
       // parkingLot.setSlotAllocationStrategy(SlotAllocationStrategy.RANDOM);

        gate1.setParkingLot(parkingLot);
        gate2.setParkingLot(parkingLot);
        parkingLotRepo.saveParkingLot(parkingLot);
        TokenService tokenService = new TokenService(gateRepo,vehicleRepo,parkingLotRepo,slotRepo,tokenRepo);
        TokenController tokenController = new TokenController(tokenService);

        // requesting first slot
        IssueTokenRequestDto requestDto = new IssueTokenRequestDto();
        requestDto.setGateNo(1);
        requestDto.setVehicalNumber("AP9999");
        requestDto.setVehicleType(VEHICLE_TYPE.CAR);
        requestDto.setVehicleOwner("Sowmya");
        IssueTokenResponseDto responseDto =  tokenController.requestToken(requestDto);

//        // Requesting second slot booking
//        IssueTokenRequestDto requestDto2 = new IssueTokenRequestDto();
//        requestDto2.setGateNo(1);
//        requestDto2.setVehicalNumber("AP0000");
//        requestDto2.setVehicleType(VEHICLE_TYPE.TRUCK);
//        requestDto2.setVehicleOwner("Sowmya");
//        IssueTokenResponseDto responseDto2 =  tokenController.requestToken(requestDto2);

// // requesting 3 rd slot when parking lot is full
//        IssueTokenRequestDto requestDto3 = new IssueTokenRequestDto();
//        requestDto3.setGateNo(1);
//        requestDto3.setVehicalNumber("AP0001");
//        requestDto3.setVehicleType(VEHICLE_TYPE.TRUCK);
//        requestDto3.setVehicleOwner("Sowmya");
//        IssueTokenResponseDto responseDto3 =  tokenController.requestToken(requestDto3);

        //
       System.out.println(responseDto.getToken().getNumber());
//        System.out.println(responseDto2.getToken().getNumber());
       System.out.println(responseDto.getToken().getParkingSlot().getSlotNumber());
//        System.out.println(responseDto2.getToken().getParkingSlot().getSlotNumber());
//        System.out.println(responseDto3.getToken());
//        System.out.println(responseDto3.getMessage());

        // printing all slots with status

         for(Parking_Slot ps: parkingLot.getParkingFloors().get(0).getParkingSlots()){
             System.out.println(ps.getParkingSlotStatus());
         }

    }
}