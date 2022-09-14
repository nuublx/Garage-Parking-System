package com.company.entities;

import org.jetbrains.annotations.NotNull;

public class Dimension {
    private double Depth;
    private double width;

    public Dimension(){}

    public boolean lessThanOrEqual(@NotNull Dimension rhs){
        return this.Depth <=rhs.Depth && this.width<=rhs.width;
    }
    public boolean greaterThanOrEqual(@NotNull Dimension rhs){
        return this.Depth >=rhs.Depth && this.width>=rhs.width;
    }
    public double getDepth() {
        return Depth;
    }

    public void setDepth(double depth) {
        this.Depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
