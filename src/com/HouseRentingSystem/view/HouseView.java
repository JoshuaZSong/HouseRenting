package com.HouseRentingSystem.view;

/**
 * 1.Menu display
 * 2.Receive user's input
 * 3.Call other class for CRUD
 */
public class HouseView {

    private boolean loop = true; //display loop
    private char key = ' '; //user option
    //Menu display
    public void mainMenu(){

        do{
            System.out.println("==========House Renting System==========");
            System.out.println("\t\t\t1 New House");
            System.out.println("\t\t\t2 Search House");
            System.out.println("\t\t\t3 Delete House");
            System.out.println("\t\t\t4 Change House Info");
            System.out.println("\t\t\t5 House List");
            System.out.println("\t\t\t6 Exit");
        }while(loop);
    }
}
