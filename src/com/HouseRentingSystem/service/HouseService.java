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
    private int houseNums = 1;//counting how many houses information are there
    private int idCounter = 1;

    public HouseService(int size) {
        //new houses
        houses = new House[size];//when creating HouseService object,designate the size
        //For testing,initial a test object
        houses[0] = new House(1, "Josh", "(111)111-1111", "Calgary", 1400, "Vacant");
    }

    //function: delete a house info
    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        //delete the house info
        //cover the former house info by move the latter one to the former one
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;//houses[houseNums-1] = null;//houseNums--;
        return true;

    }

    //function: add new object, return boolean
    public boolean add(House newHouse) {
        if (houseNums == houses.length) {
            System.out.println("=====list is full======");
            return false;
        }

        houses[houseNums++] = newHouse;
        //ID increasing
        newHouse.setId(++idCounter);
        return true;
    }

    //function: search house information by ID
    public House findById(int findId){
        for(int i = 0; i<houseNums; i++){
            if(findId == houses[i].getId())
                return houses[i];
        }
        return null;
    }


    //function: return houses
    public House[] list() {
        return houses;
    }
}
