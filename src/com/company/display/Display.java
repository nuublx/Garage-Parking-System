package com.company.display;

import com.company.entities.Slot;

import java.util.LinkedList;

public interface Display<T,D extends Object> {
    public D display(T x);
}
