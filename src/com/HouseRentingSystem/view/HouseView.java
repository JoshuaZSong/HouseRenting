package com.HouseRentingSystem.view;

import com.HouseRentingSystem.domin.House;
import com.HouseRentingSystem.service.HouseService;
import com.HouseRentingSystem.utils.Utility;

/**
 * 1.Menu display
 * 2.Receive user's input
 * 3.Call other class for CRUD
 */
public class HouseView {

    private boolean loop = true; //display loop
    private char key = ' '; //user option
    private HouseService houseService = new HouseService(10);

    //addHouse() accept input, new House object, use add function
    public void addHouse() {
        System.out.println("==========Add New House==========");
        System.out.println("Name: ");
        String name = Utility.readString(15);
        System.out.println("Phone: ");
        String phone = Utility.readString(15);
        System.out.println("Address: ");
        String address = Utility.readString(30);
        System.out.println("Rent: ");
        int rent = Utility.readInt();
        System.out.println("State(Available/Occupied): ");
        String state = Utility.readString(9);
        //new House, the ID is set by the system
        House house = new House(0, name, phone, address, rent, state);


    }

    //listHouses() list of houses
    public void listHouses() {
        System.out.println("==========House List==========");
        //Number Landlord PhoneNo Address Rent State(Available/Occupied)
        System.out.println("Number\tLandlord\tPhoneNo\t\t\tAddress\t\tRent\t\tState(Available/Occupied)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==========End==========");
    }

    //Menu display
    public void mainMenu() {

        do {
            System.out.println("==========House Renting System==========");
            System.out.println("\t\t\t1 New House");
            System.out.println("\t\t\t2 Search House");
            System.out.println("\t\t\t3 Delete House");
            System.out.println("\t\t\t4 Change House Info");
            System.out.println("\t\t\t5 House List");
            System.out.println("\t\t\t6 Exit");
            System.out.println("Please select from 1-6:");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    System.out.println("\t\t\tNew");
                    break;
                case '2':
                    System.out.println("\t\t\tSearch");
                    break;
                case '3':
                    System.out.println("\t\t\tDelete");
                    break;
                case '4':
                    System.out.println("\t\t\tChange");
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    System.out.println("\t\t\tExit");
                    loop = false;
                    break;
            }

        } while (loop);
    }
}
