package com.company.forms;

import java.util.Scanner;

public class deleteSlotForm implements Forms{
    String slotName;
    @Override
    public void takeInfo() {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Name of the slot you wish to delete: ");

        this.slotName=input.nextLine();
    }

    public String getSlotName() {
        return slotName;
    }
}
