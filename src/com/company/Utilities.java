package com.company;

import com.company.entities.Dimension;
import com.company.entities.Garage;
import com.company.entities.Slot;
import com.company.entities.Vehicle;
import com.company.forms.AddSlotForm;
import com.company.forms.ChangeConfigForm;
import com.company.forms.VehicleForm;
import com.company.forms.deleteSlotForm;
import com.company.slotSelector.BF;
import com.company.slotSelector.FCFS;
import org.jetbrains.annotations.NotNull;

public class Utilities {
    public static @NotNull Vehicle crtVehicle(@NotNull VehicleForm vForm){
        Vehicle newVehicle = new Vehicle();
        Dimension vDimension=new Dimension();
        vForm.setInfo(newVehicle,vDimension);
        return  newVehicle;
    }

    public void addslot(@NotNull AddSlotForm as, @NotNull Garage garage) {
        Slot newSlot=new Slot();
        Dimension newD=new Dimension();
        as.setInfo(newSlot,newD);
        garage.addSlot(newSlot);
    }

    public void dltSlot(@NotNull deleteSlotForm df, @NotNull Garage garage) {
        garage.deleteSlot(df.getSlotName());
    }

    public void ChangeConfig(@NotNull ChangeConfigForm ch, Garage garage) {
        ch.setConfig(garage);
        if(garage.getConfig()=="BestFit")
            park_in.setSelect(new BF(garage));
        else
            park_in.setSelect(new FCFS(garage));
    }
}
