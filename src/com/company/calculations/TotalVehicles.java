package com.company.calculations;

import com.company.entities.Garage;
import com.company.entities.Slot;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class TotalVehicles implements calculations {
    @Override
    public double calculate(@NotNull Garage garage) {
        Iterator<Slot> it=garage.getSlots().iterator();
        double CurrentVehicles=0;
        while(it.hasNext()){
            if(!it.next().isAvailable()){
                CurrentVehicles++;
            }
        }
        return CurrentVehicles;
    }
}
