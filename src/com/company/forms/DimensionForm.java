package com.company.forms;
import com.company.entities.Dimension;

import java.util.Scanner;

public class DimensionForm implements Forms{
private double depth;
private double width;
    @Override
    public void takeInfo() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter depth and width: ");
            depth =input.nextDouble();
            width=input.nextDouble();
        } while (depth < 0 && width < 0);
    }
    public void setInfo(Dimension in){
        in.setDepth(this.depth);
        in.setWidth(this.width);
    }
}
