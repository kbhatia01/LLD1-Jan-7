package parkingLot.controller;

import parkingLot.Model.Vehicle;
import parkingLot.dtos.IssueTokenRequestDto;
import parkingLot.dtos.IssueTokenResponseDTO;

public class TokenController {

    public IssueTokenResponseDTO issueToken(IssueTokenRequestDto requestDto){
        IssueTokenResponseDTO response  =  new IssueTokenResponseDTO();


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
