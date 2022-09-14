package com.company.display;

import com.company.entities.Garage;
import com.company.entities.Slot;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.LinkedList;

public class AvailableSlots implements Display<Garage,LinkedList<Slot>>{
    @Override
    public LinkedList<Slot> display(@NotNull Garage garage) {
        Iterator<Slot> it=garage.getSlots().iterator();

        LinkedList<Slot> EmptyParkings=new LinkedList<>();

        while(it.hasNext()){
            Slot x=it.next();
            if(x.isAvailable())
                EmptyParkings.add(x);
        }
        if(EmptyParkings.isEmpty())
            return null;
        else
            return EmptyParkings;
    }
}
