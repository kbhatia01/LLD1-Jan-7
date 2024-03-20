package parkingLot.controller;

import parkingLot.Model.Token;
import parkingLot.Model.Vehicle;
import parkingLot.Service.TokenService;
import parkingLot.dtos.IssueTokenRequestDto;
import parkingLot.dtos.IssueTokenResponseDTO;
import parkingLot.dtos.ResponseStatus;

public class TokenController {

    TokenService ts;

    public TokenController(TokenService ts){
        this.ts = ts;
    }
    public IssueTokenResponseDTO issueToken(IssueTokenRequestDto requestDto){
        IssueTokenResponseDTO response  =  new IssueTokenResponseDTO();

        try {
            Token token = ts.issueToken(requestDto.getVehicleNumber(),
                    requestDto.getOwnerName(),
                    requestDto.getGateId(),
                    requestDto.getVehicleType()
            );
            response.setToken(token);
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMsg("SOMETHING WENT WRONG!!");

        }

        return response;
    }

// 1. need to interact with client
//     2.      when request comes, validate
//    3. call the actual services for business logic
//    4. recieve the data and create response for client accordingly...

//classController{
//        DTO: authentication toke
//                classData

//     AuthencationService(dto)? 1-> AuthencationService(dto.authToken)
//    AttendClassService(Dto)? -> AttendClassService(dto.classData)

//}

}
