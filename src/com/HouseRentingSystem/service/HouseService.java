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
    }

    //
    public House[] list(){
        return houses;
    }
}
