package parkingLot.repo;

import parkingLot.Model.Gate;
import parkingLot.Model.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepo {

    private Map<String, Vehicle> vehicles = new TreeMap<>();

    private int PreviousID = 0;
    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber){

        if(vehicles.containsKey(vehicleNumber)){
            return Optional.of(vehicles.get(vehicleNumber));
        }
        return Optional.empty();
    }

    public Vehicle saveVehicle(Vehicle v){
        int newId = this.PreviousID+1;
        v.setId(newId);
        vehicles.put(v.getVehicleName(),v);
        this.PreviousID +=1;
        return v;
    }
}
