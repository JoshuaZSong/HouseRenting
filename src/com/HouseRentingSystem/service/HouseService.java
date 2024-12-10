package com.HouseRentingSystem.service;

import com.HouseRentingSystem.domin.House;

/**
 * 1. Call from HouseView
 * 2.CRUD
 */
public class HouseService {

    private House[] houses;// house object

    public HouseService(int size){
        //new houses
        houses = new House[size];//
        //For testing,initial a test object
        houses[0] = new House(1,"Josh","(111)111-1111","Calgary",1400,"Vacant");
    }

    //
    public House[] list(){
        return houses;
    }
}
