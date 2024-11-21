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
        return c;
    }

    /**
     * function: read a char from keyboard input
     * @return a char
     */
    public static char readChar(){
        String str = readKeyBoard(1,false);
        return str.charAt(0);
    }

    /**
     * function: read a char from keyboard input if press enter, it returns default or it will return the on just input
     * @param defaultValue
     * @return
     */
    public static char readChar(char defaultValue){
        String str = readKayBoard(1,true);//either null or a char
        return(str.length() == 0)? defaultValue : str.charAt();
    }

    public static int readInt(){
        int n;
        for(;;){
            String str = readKayboard(10,false);
        }
    }
}
