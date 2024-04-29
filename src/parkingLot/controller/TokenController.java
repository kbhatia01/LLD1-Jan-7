package Controller;

import DTO.IssueTokenRequestDto;
import DTO.IssueTokenResponseDto;
import DTO.ResponseStatus;
import Models.Token;
import Service.TokenService;

public class TokenController {

    TokenService tokenService;
    public TokenController(TokenService tokenService){
        this.tokenService = tokenService;
    }
    public IssueTokenResponseDto requestToken(IssueTokenRequestDto issueTokenRequestDto){
        //1. interact with client
        // 2, validate inputs
        //3. call token service to issue token
        // 4. set these token setails to responseDTo and send it back to user.
        IssueTokenResponseDto issueTokenResponseDto = new IssueTokenResponseDto();

        try {

            Token t = tokenService.issueToken(issueTokenRequestDto.getVehicalNumber(),
                    issueTokenRequestDto.getVehicleOwner(),
                    issueTokenRequestDto.getGateNo(),
                    issueTokenRequestDto.getVehicleType());


            issueTokenResponseDto.setToken(t);
            issueTokenResponseDto.setVehicalNumber(issueTokenRequestDto.getVehicalNumber());
            issueTokenResponseDto.setGateNo(issueTokenRequestDto.getGateNo());
            issueTokenResponseDto.setVehicleOwner(issueTokenRequestDto.getVehicleOwner());
            issueTokenResponseDto.setVehicleType(issueTokenRequestDto.getVehicleType());
            issueTokenResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
            issueTokenResponseDto.setMessage("Token successfullt generated");
        }
        catch (Exception e){
            issueTokenResponseDto.setResponseStatus(ResponseStatus.FAILED);
            issueTokenResponseDto.setMessage("Something went wrong. Cannot issue Token \n" + e.getMessage());
        }

        return issueTokenResponseDto;
    }
}
