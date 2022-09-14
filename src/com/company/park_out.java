package com.company;

import com.company.entities.Garage;
import com.company.entities.Slot;
import com.company.entities.Vehicle;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.time.Instant;


public class park_out {
    public double user(String plates, @NotNull Garage garage){
        Instant depratureTime=Instant.now();
        Slot Taken=garage.searchSlot(plates);
        if(Taken!=null) {
            Taken.setAvailable();
            Vehicle v = garage.searchVehicle(plates);
            return calculateFees(depratureTime, v);
        }
        else
            return 0;
    }
    public double calculateFees(@NotNull Instant Departure, @NotNull Vehicle departingVehicle){
        Duration res=Duration.between(departingVehicle.getArrivalTime(),Departure);
        long mins=res.abs().toMinutes();
        long hours = mins/60;
        long fees=hours*5;
        if(hours<=1){
            fees=5;
        }
        departingVehicle.setFees(fees);
        return fees;

    }
}
