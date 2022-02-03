package com.example.assignmentone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * contain calculation logic
 */
public class Calculator {
    //initialize my lists
    private final ArrayList<String> mySymbols = new ArrayList<String>(Arrays.asList("*","-","+","/","%","pow","min","max"));
    private final List<String> myList = new ArrayList<>();
    public  String result = "";

    //write the logic
    //if validate fails return false
    //returns a string 999 if fails
    public void validate(){
        int firstItem = 0;
        //check if the first item is an int
        try{
            firstItem = Integer.parseInt(myList.get(0));
        }catch (NumberFormatException ex){
            //showNumber.setText(R.string.not_an_op);
            firstItem = 999;
        }

        //loop through the reminder of the list
        //check if a sign is always followed by a number
        String currentSymbol = "";
        int currentInt = 0;
        int counter = 1;


        if (myList.size() >= 3){
            boolean isStr = true;
            while(isStr && counter < myList.size()){
                //call a function to check if sign is in symbol list
                if (isSymbol(myList.get(counter))){
                    currentSymbol = myList.get(counter);
                    //counter++;
                }
                else{
                    isStr = false;
                    firstItem = 999;
                    //showNumber.setText(R.string.not_an_op);
                }
                //check if the currentInt is an int
                try{
                    currentInt = Integer.parseInt(myList.get(counter + 1));
                    //counter++;
                }catch (NumberFormatException ex){
                    isStr = false;
                    firstItem = 999;
                    //showNumber.setText(R.string.not_an_op);
                }
                //perform calculation add on
                firstItem = calculate(firstItem, currentSymbol,currentInt);
                counter+=2;

            }
        }else{
            firstItem = 999;
            //showNumber.setText(R.string.not_an_op);
        }
        //showNumber.append(Integer.toString(firstItem));
        result = Integer.toString(firstItem);
    }

    //write the calculate method
    /**
     * create a switch that calculates result depending on the sign
     */
    private int calculate(int firstItem, String secondSymbol, int currentItem) {
        int result = 0;
        switch (secondSymbol) {
            case "*":
                result = firstItem * currentItem;
                break;
            case "-":
                result = firstItem - currentItem;
                break;
            case "/":
                result = firstItem / currentItem;
                break;
            case "%":
                result = firstItem % currentItem;
                break;
            case "pow":
                result = (int) Math.pow(firstItem, currentItem);
                break;
            case "min":
                result = Math.min(firstItem, currentItem);
                break;
            case "max":
                result = Math.max(firstItem, currentItem);
                break;
            default:
                result = firstItem + currentItem;
                break;
        }
        return result;
    }

    //check if its a symbol
    /**
     * returns true if the input is in mySymbols
     */
    private boolean isSymbol(String s) {
        boolean isTrue = false;
        for (int i = 0; i<mySymbols.size(); i++){
            if (s.equals(mySymbols.get(i))){
                isTrue = true;
            }
        }
        return isTrue;
    }

    //write the access methods
    //add to myList
    public void putStr(String s){
        myList.add(s);
    }

    //get from myList
    public String getStr(int i){
        return myList.get(i);
    }

    //get the length of myList
    public int getLength(){
        return myList.size();
    }

    //get result
    public String getResult(){
        return result;
    }

    //clear list
    public void purge(){
        myList.clear();
    }
}

/**
 * APP LOGIC
 * File has two main functions:
 * validate - validates the order of the list, returns an exception if order is incorrect
 * Calculate - performs arithmetic depending on the provided sign
 */

