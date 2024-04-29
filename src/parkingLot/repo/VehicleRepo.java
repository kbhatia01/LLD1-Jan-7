package Repo;

import Models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepo {
    int vehicleId =0;
    Map<String,Vehicle> vehicles = new TreeMap<>();
    public  Optional<Vehicle> findVehicleByNumber(String vehicleNumber){

        if(vehicles.containsKey(vehicleNumber))
            return Optional.of(vehicles.get(vehicleNumber));
        return Optional.empty();
    }

    public  Vehicle saveVehicle(Vehicle V){
        V.setId(vehicleId);
        vehicles.put(V.getVehicleRegNum(),V);
        vehicleId++;
        return V;
    }


}
