package com.company.entities;
public enum Configuration {
    BF,FCFS;
    public String tostring(){
        return switch (this) {
            case BF -> "BestFit";
            case FCFS -> "FirstComeFirstServe";
        };
    }
}

