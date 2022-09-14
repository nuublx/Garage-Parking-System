package com.company.forms;
import com.company.entities.Dimension;
import com.company.entities.Vehicle;

import java.util.Scanner;

public class VehicleForm implements Forms {
    private String modelName;
    private String plateID;
    private String modelYear;
    DimensionForm df=new DimensionForm();

    public void takeInfo() {
        System.out.println("We would like you to fill some information about your Vehicle please:");

        System.out.print("Enter model name: ");

        Scanner input = new Scanner(System.in);

        this.modelName=input.next();

        System.out.print("Enter model year: ");

        this.modelYear=input.next();

        df.takeInfo();

        System.out.println("Vehicle info is set successfully.");
    }

    public void setInfo(Vehicle v, Dimension dd){
        v.setModelName(this.modelName);
        v.setModelYear(this.modelYear);
        v.setPlateID(this.plateID);
        df.setInfo(dd);
        v.setvDimensions(dd);
    }

}