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
            c = str.charAt(0);
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
     * @return default value or the entry
     */
    public static char readChar(char defaultValue){
        String str = readKeyBoard(1,true);//either null or a char
        return(str.length() == 0)? defaultValue : str.charAt(0);
    }

    /**
     * function: read from keyboard entry, the length is shorter than 2
     * @return integer
     */
    public static int readInt(){
        int n;
        for(;;){
            String str = readKeyBoard(10,false);
            try{
                n = Integer.parseInt(str);
                break;
            }catch(NumberFormatException e){
                System.out.print("Enter wrong number,please enter again:");
            }
        }
        return n;
    }

    /**
     * function: read from keyboard entry if press enter, it returns default or it will return the on just input
     * @param defaultValue
     * @return integer or default
     */
    public static int readInt(int defaultValue) {
        int n;
        for (; ; ) {
            String str = readKeyBoard(10, true);
            if (str.equals("")) {
                return defaultValue;
            }

            //exception
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter wrong number,please enter again:");
            }
        }
        return n;
    }

    /**
     * function:read from keyboard for limit length of chars
     * @param limit length
     * @return chars of limited length
     */
    public static String readString(int limit){
        return readKeyBoard(limit,false);
    }

    /**
     * function: read chars or default value from keyboard, if entered, return default else return chars
     * @param limit
     * @param defaultValue
     * @return
     */
    public static String readString(int limit, String defaultValue){
        String str = readKeyBoard(limit, true);
        return str.equals("")? defaultValue:str;
    }

    /**
     * function:read from keyboard, Y/N
     * encapsulate a smaller function into a function
     * @return Y/N
     */
    public static char readConfirmSelection(){
        System.out.println("please select(Y/N):");
        char c;
        for(;;){
            String str = readKeyBoard(1,false).toUpperCase();
            c = str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            }else{
                System.out.println("Entered wrong, please select(Y/N)");
            }
        }
        return c;
    }

    /**
     * function: read a string
     * @param limit: the length of the read
     * @param blankReturn true means empty is acceptable
     *                    false means not acceptable
     * if the entry is empty or longer than the limitation, prompt to re-entry
     * @return
     */
    private static String readKeyBoard(int limit, boolean blankReturn){
        String line = "";

        //scanner.hasNextLine() to indicate if there's next line
        while(scanner.hasNextLine()){
            line = scanner.nextLine();//read the line

            //if line.length() == 0, even if the user didn't enter anything, enter.
            if(line.length() == 0){
                if(blankReturn) return line;// if blankReturn == true, return empty
                else continue;//if blankReturn == false, empty is not acceptable, has to input something
            }

            //if the entry's length is larger than limit, prompt to re-entry
            //if the entry>0 and <=limit, accept it.
            if(line.length() < 1 || line.length() > limit){
                System.out.print("Enter the wrong length(Enter can not longer than" + limit + "), please enter again:");
                continue;
            }
            break;
        }
        return line;
    }


}
