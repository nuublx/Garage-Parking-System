package com.company.entities;

import java.util.Iterator;
import java.util.LinkedList;

public class Garage {
    protected LinkedList<Slot> slots = new LinkedList<>();
    protected LinkedList<Vehicle> allVs = new LinkedList<>();
    protected Configuration config;
    ///////////////////////////////////////////////////////////////////////////

    public String getConfig() {
        return config.tostring();
    }

    public void setConfig(Configuration config) {
        this.config = config;
    }

    public LinkedList<Slot> getSlots() {
        return slots;
    }

    public LinkedList<Vehicle> getAllVs() {
        return allVs;
    }

    public void addSlot(Slot s){
        slots.add(s);
    }

    public void addVehicle(Vehicle v){
        allVs.add(v);
    }

    public Slot searchSlot(String plates) {
        Iterator<Slot> it=slots.iterator();
        Slot x;
        while(it.hasNext()){
            x=it.next();
            if(x.getvPlateNumber().matches(plates)) {

                return x;
            }
        }

        System.out.println("There is no vehicle parked with this plate id: "+plates);
        return null;
    }
    public void deleteSlot(String slotName) {
        Iterator<Slot> it=slots.iterator();
        while(it.hasNext()){
            Slot x=it.next();
            if(x.getSlotName().matches(slotName)) {
                slots.remove(x);
            }
        }

        System.out.println("There is no Slot with this name: "+slotName+".");
    }
    public Vehicle searchVehicle(String plateID) {
        Iterator<Vehicle> it=allVs.iterator();

        while(it.hasNext()){
            Vehicle x=it.next();
            if(x.getPlateID().matches(plateID)) {

                return x;
            }
        }
        return null;
    }
}

