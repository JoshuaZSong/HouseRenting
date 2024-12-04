package com.HouseRentingSystem;

import com.HouseRentingSystem.view.HouseView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HouseRentApp {
    public static void main(String[] args) {
        //Create HouseView class and show menu,entry of the software
        new HouseView().mainMenu();
        System.out.println("===You exit the system===");
    }
}