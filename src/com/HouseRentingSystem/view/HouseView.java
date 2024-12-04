package com.HouseRentingSystem.view;

import com.HouseRentingSystem.utils.Utility;

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
            System.out.println("Please select from 1-6:");
            key = Utility.readChar();
            switch(key){
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
                    System.out.println("\t\t\tList");
                    break;
                case '6':
                    System.out.println("\t\t\tExit");
                    loop = false;
                    break;
            }

        }while(loop);
    }
}
