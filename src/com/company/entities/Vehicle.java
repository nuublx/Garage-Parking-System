package com.company.entities;
import java.time.Instant;

public class Vehicle {
    private String modelName;
    private String plateID;
    private String modelYear;
    private Dimension vDimensions;
    private Instant arrivalTime;
    private double fees=0;

public Vehicle(){}

    public boolean matches( Vehicle rhs){
        return this.getPlateID().matches(rhs.getPlateID());
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getPlateID() {
        return plateID;
    }

    public void setPlateID(String plateID) {
        this.plateID = plateID;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public Dimension getvDimensions() {
        return vDimensions;
    }

    public void setvDimensions(Dimension vDimensions) {
        this.vDimensions = vDimensions;
    }

    public Instant getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime() {
        this.arrivalTime = Instant.now();
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees += fees;
    }
}
