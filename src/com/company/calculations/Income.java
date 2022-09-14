package com.company.calculations;

import com.company.entities.Garage;
import com.company.entities.Vehicle;

import java.util.Iterator;

public class Income implements calculations{
    @Override
    public double calculate(Garage garage) {
        Iterator<Vehicle> it=garage.getAllVs().iterator();
        double TotalIncome=0;
        while(it.hasNext()){
            TotalIncome+=it.next().getFees();
        }
        return TotalIncome;
    }
}
