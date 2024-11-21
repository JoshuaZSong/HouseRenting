package com.HouseRentingSystem.utils;
import java.sql.SQLOutput;
import java.util.*;

/*
    Usage of this class: handle users' input and get console output
 */
public class Utility {
    //Static property
    private static Scanner scanner = new Scanner(System.in);

    /**
     * function: read keyboard selection from 1-5
     * print wrong if input wrong
     * @return 1-5
     */
    public static char readMenuSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1,false);
            c = str.CharAt(0);
            if (c != '1' && c != '2' &&
            c != '3' && c !='4' && c != '5'){
                System.out.println("Selection wrong, please enter 1-5");
            }else break;
        }
    }
    return c;

}
