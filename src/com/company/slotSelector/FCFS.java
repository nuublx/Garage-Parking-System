package com.company.slotSelector;

import com.company.entities.Dimension;
import com.company.entities.Garage;
import com.company.entities.Slot;
import com.company.entities.Vehicle;

public class FCFS implements SlotSelector{
    Garage x;
    @Override
    public void setGarage(Garage y) {
        x=y;
    }
    public FCFS(Garage garage){
        setGarage(garage);
    }
    @Override
    public String Selection(Vehicle vhc) {
        Dimension VDimensions = vhc.getvDimensions();

        boolean parked = false;

        for (Slot park : x.getSlots()) {

            Dimension SDimensions = park.getsDimensions();

            if (SDimensions.greaterThanOrEqual(VDimensions) && park.isAvailable()) {

                park.setTaken(vhc.getPlateID());

                return park.getSlotName();
            }
        }
        return "No";
    }
}
