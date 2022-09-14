package com.company;
import com.company.calculations.Income;
import com.company.calculations.TotalVehicles;
import com.company.display.AvailableSlots;
import com.company.entities.Garage;
import com.company.entities.Slot;
import com.company.forms.AddSlotForm;
import com.company.forms.ChangeConfigForm;
import com.company.forms.deleteSlotForm;
import java.util.LinkedList;
import java.util.Scanner;

public class UserInterface {

    private int choice;

    public void menu(Utilities UT, Garage garage)
    {
        do {
            System.out.println("1-Park In");
            System.out.println("2-Park Out");
            System.out.println("3-Set Up Garage");
            System.out.println("4-View Available Slots");
            System.out.println("5-View Total Income");
            System.out.println("6-View Number Of Vehicles");
            System.out.println("7-Exit System.");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            if(choice<1||choice>7){
                System.out.println("Wrong choice try again!");
            }
            else {
                switch (choice) {
                    case 1: {
                        park_in park = new park_in();
                        System.out.print("Enter Plates: ");
                        Scanner input = new Scanner(System.in);
                        String plates = input.nextLine();
                        park.user(plates, garage);
                        break;
                    }
                    case 2: {
                        park_out park = new park_out();
                        System.out.print("Enter Plates: ");
                        Scanner input = new Scanner(System.in);
                        String plates = input.nextLine();
                        System.out.println("Your Parking Fees is: " + park.user(plates, garage) + "EGP.");
                        break;
                    } 
                    case 3: {
                        setupGarage(UT,garage);
                        break;
                    }
                    case 4:{
                        AvailableSlots av=new AvailableSlots();
                        printSlotList(av.display(garage));
                        break;
                    }
                    case 5:{
                        Income in=new Income();
                        double income=in.calculate(garage);
                        if(income>0) {
                            System.out.println("Total Income at the moment is: " + income + "Egp.");
                        }
                        else
                            System.out.println("No income ");
                        break;
                    }
                    case 6:{
                        TotalVehicles tv=new TotalVehicles();
                        double vehicles=tv.calculate(garage);
                        if(vehicles>0)
                            System.out.println("Total vehicles parked at the moment: "+vehicles+"Vehicle.");
                        else
                            System.out.println("No vehicles parked at the moment ");
                    }
                }
                System.out.println();
            }
        }while (choice!=7);
    }

    public void printSlotList( LinkedList<Slot> lst){
        if(lst==null){
            System.out.print("No available slots right now.");
        }
        else {
            for (Slot slot : lst) {
                System.out.print(slot.getSlotName() + " " + slot.getsDimensionsString() + " || ");
            }
        }
        System.out.println();
    }


    public void setupGarage(Utilities UT,Garage garage) {
        int choice;
        do {
            System.out.println("1-Add Slot in Garage. ");
            System.out.println("2-Delete Slot in Garage. ");
            System.out.println("3-Change Slot Selection Algorithm. ");
            System.out.println("4-Exit Setup Garage. ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Wrong choice try again!");
            }
            else
            {
                switch (choice) {
                    case 1 -> {
                        AddSlotForm AS = new AddSlotForm();
                        AS.takeInfo();
                        UT.addslot(AS, garage);
                    }
                    case 2 -> {
                        deleteSlotForm df = new deleteSlotForm();
                        df.takeInfo();
                        UT.dltSlot(df, garage);
                    }
                    case 3 -> {
                        ChangeConfigForm ch=new ChangeConfigForm();
                        ch.takeInfo();
                        UT.ChangeConfig(ch,garage);
                    }
                }
            }
        }while(choice!=4);
    }

}
