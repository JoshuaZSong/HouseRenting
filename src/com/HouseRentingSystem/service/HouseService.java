package com.HouseRentingSystem.service;

import com.HouseRentingSystem.domin.House;

/**
 * HouseService.java<=>House class
 * define House[]
 * save House object
 * 1.Call from HouseView
 * 2.CRUD
 */
public class HouseService {

    private House[] houses;// house object

    public HouseService(int size){
        //new houses
        houses = new House[size];//when creating HouseService object,designate the size
        //For testing,initial a test object
        houses[0] = new House(1,"Josh","(111)111-1111","Calgary",1400,"Vacant");
    }

    //function: return houses
    public House[] list(){
        return houses;
    }
}
