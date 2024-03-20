package parkingLot.repo;

import parkingLot.Model.Vehicle;

import java.util.Optional;

public class VehicleRepo {
    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber){
        return Optional.empty();
    }

    public Vehicle saveVehicle(Vehicle v){
        return v;
    }
}
