package com.company.entities;

public class Slot {
    private String slotName;
    private Boolean available;
    private Dimension sDimensions;
    private String vPlateNumber="";
    public Slot(){}
    public void setTaken(String vPlateNumber){
        this.setvPlateNumber(vPlateNumber);
        this.available=false;
    }
    public void setAvailable(){
        this.available=true;
    }

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public boolean isAvailable() {
        return available;
    }

    public Dimension getsDimensions() {
        return sDimensions;
    }

    public void setsDimensions(Dimension sDimensions) {
        this.sDimensions = sDimensions;
    }

    public String getvPlateNumber() {
        return vPlateNumber;
    }

    public void setvPlateNumber(String vPlateNumber) {
        this.vPlateNumber = vPlateNumber;
    }

    public String getsDimensionsString() {
        return "("+sDimensions.getDepth()+","+sDimensions.getWidth()+")";
    }
}
