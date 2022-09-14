package com.company.forms;
import com.company.entities.Dimension;
import com.company.entities.Slot;

import java.util.Scanner;

public class AddSlotForm implements Forms{
    private String slotName;
    DimensionForm df;
    @Override
    public void takeInfo() {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Name of the slot: ");

        slotName=input.nextLine();
        df=new DimensionForm();
        df.takeInfo();
        System.out.println("Slot info is set successfully.");
    }
    public void setInfo(Slot s, Dimension dd){
        s.setAvailable();
        s.setSlotName(this.slotName);
        df.setInfo(dd);
        s.setsDimensions(dd);
    }

}
    
