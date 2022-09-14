package com.company;

import com.company.entities.Configuration;
import com.company.entities.Garage;
import com.company.entities.Vehicle;
import com.company.forms.VehicleForm;
import com.company.slotSelector.SlotSelector;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class park_in {
    static SlotSelector  Select;

    public static void setSelect(SlotSelector s){
        Select= s;
    }

    public void user(@NotNull String plates, @NotNull Garage garage){
        Vehicle newVehicle= garage.searchVehicle(plates);
        if(newVehicle==null) {
            VehicleForm v = new VehicleForm();
            v.takeInfo();
            newVehicle = Utilities.crtVehicle(v);
            newVehicle.setPlateID(plates);
            garage.addVehicle(newVehicle);
        }
        String ParkingSpot;
        ParkingSpot=Select.Selection(newVehicle);

        if(!ParkingSpot.equals("No")) {

            System.out.println("Your parking spot is: " + ParkingSpot);

            newVehicle.setArrivalTime();
        }
        else
            System.out.println("Sorry no place to park right now come again later!");

    }
}
