package com.company;

import com.company.entities.Garage;

public class Main {

    public static void main(String[] args) {
	UserInterface UI=new UserInterface();

    Utilities UT=new Utilities();

    Garage garage= new Garage();

    UI.menu(UT,garage);

    }
}
