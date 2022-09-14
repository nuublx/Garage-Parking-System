package com.company.slotSelector;

import com.company.entities.Dimension;
import com.company.entities.Garage;
import com.company.entities.Slot;
import com.company.entities.Vehicle;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.LinkedList;

public class BF implements SlotSelector{
    Garage x;
    @Override
    public void setGarage(Garage y) {
        x=y;
    }


public BF(Garage garage){
        setGarage(garage);
}


    @Override
    public String Selection(@NotNull Vehicle vhc) {
        LinkedList<Slot> AvaliableSlots = new LinkedList<>();
        Dimension VDimensions = vhc.getvDimensions();
        for (Slot park : x.getSlots()) {
            Dimension SDimensions = park.getsDimensions();
            if (SDimensions.greaterThanOrEqual(VDimensions) && park.isAvailable()) {
                AvaliableSlots.add(park);
            }
        }
        if(AvaliableSlots.isEmpty()){
            return "NO";
        }
        Iterator<Slot> it = AvaliableSlots.iterator();
        Slot min = null;
        while (it.hasNext()) {
            if (min == null) {
                min = it.next();
            }
            else if ((it.next().getsDimensions().lessThanOrEqual(min.getsDimensions()))) {
                min = it.next();
            }
        }
        assert min != null;
        min.setTaken(vhc.getPlateID());
        return min.getSlotName();
    }
}
