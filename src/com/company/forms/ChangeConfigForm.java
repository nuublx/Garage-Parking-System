package com.company.forms;

import com.company.entities.Configuration;
import com.company.entities.Garage;

import java.util.Scanner;

public class ChangeConfigForm implements Forms{
    int choice;
    @Override
    public void takeInfo() {
        Scanner input=new Scanner(System.in);

        System.out.println("Choose the slot selector you wish: ");
        do {
            System.out.println("1-BestFit.");
            System.out.println("2-First Come First Serve");
            choice = input.nextInt();
        }while(choice<1||choice>2);

    }
    public void setConfig(Garage garage){
        if(choice==1){
            garage.setConfig(Configuration.BF);
        }
        else
            garage.setConfig(Configuration.FCFS);
    }

}
