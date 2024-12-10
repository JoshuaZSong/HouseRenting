package com.HouseRentingSystem;

import com.HouseRentingSystem.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //Create HouseView class and show menu,entry of the software
        new HouseView().mainMenu();
        System.out.println("===You exit the system===");
    }
}