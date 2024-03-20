package parkingLot;

import parkingLot.Service.TokenService;
import parkingLot.controller.TokenController;
import parkingLot.dtos.IssueTokenRequestDto;
import parkingLot.repo.*;

public class Main {
    public static void main(String[] args) {

        GateRepo gateRepo = new GateRepo();
        ParkingSlotRepo parkingSlotRepo = new ParkingSlotRepo();
        ParkingLotRepo parkingLotRepo = new ParkingLotRepo();
        VehicleRepo vehicleRepo = new VehicleRepo();
        TokenRepo tokenRepo = new TokenRepo();
        TokenService tokenService = new TokenService(gateRepo, vehicleRepo,
                parkingLotRepo, parkingSlotRepo, tokenRepo);
        TokenController tokenController = new TokenController(tokenService);

        // requestDto
        IssueTokenRequestDto requestDto = new IssueTokenRequestDto();
        tokenController.issueToken(requestDto);

    }
}
