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

    //function: addHouse() accept input, new House object, use add function
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
        House newhouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newhouse)) {
            System.out.println("==========Successfully Add New House!==========");
        } else {
            System.out.println("==========Failed to Add New House!==========");
        }
    }

    //function: delHouse, receive house ID, call del function in HouseService
    public void delHouse() {
        System.out.println("==========Delete Houses==========");
        System.out.println("Please enter the house ID(enter -1 to exit):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("==========Failed to Delete Houses!==========");
            return;
        }
        System.out.println("Enter Y to delete, N to exit");
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if(houseService.del(delId)){
                System.out.println("==========Successfully Delete Houses!==========");
            }else{
                System.out.println("==========Failed to Delete Houses!==========");
            }
        } else {
            System.out.println("==========Failed to Delete Houses!==========");
        }
    }

    //function: exit
    public void exit(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            System.out.println("\t\t\tExit");
            loop = false;
        }
    }

    //function: search house info
    public void findHouse() {
        System.out.println("==========Search House Information==========");
        System.out.println("Please Enter the ID of the House: ");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("No such House");
        }
        System.out.println("==========End==========");
    }

    //function; updateHouse
    public void updateHouse(){
        System.out.println("==========Update House Information==========");
        System.out.println("Please Enter the ID of the House(enter -1 to exit): ");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("==========Failed to Update Houses Information!==========");
            return;
        }
        House house = houseService.findById(updateId);
        if(house == null){
            System.out.println("Your ID is not exit");
            return;
        }

        System.out.print("name(" + house.getName() + "):");
        String name = Utility.readString(15,"");
        if(!"".equals(name)){
            house.setName(name);
        }
        System.out.print("phone(" + house.getPhone() + "):");
        String phone = Utility.readString(15,"");
        if(!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.print("address(" + house.getAddress() + "):");
        String address = Utility.readString(30,"");
        if(!"".equals(address)){
            house.setAddress(address);
        }
        System.out.print("rent(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if(rent != -1){
            house.setRent(rent);
        }
        System.out.print("state(" + house.getState() + "):");
        String state = Utility.readString(9,"");
        if(!"".equals(state)){
            house.setState(state);
        }
        System.out.println("==========Successfully Updated Houses!==========");

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
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }

        } while (loop);
    }
}
