package com.magdemos.smish.inspireme;

import java.util.Random;
//Imports the classes that we will need in this class

public class rdnQteGen {
    private String[] qtsList = { //List of quotes
        "You have been inspired! Test Quote 1" +
                "\n-John Doe#1",//This is an example of concatenation
        "You have been inspired! Test Quote 2\n-John Doe#2",
        "You have been inspired! Test Quote 3\n-John Doe#3",
        "You have been inspired! Test Quote 4\n-Jane Doe#1",
        "You have been inspired! Test Quote 5\n–John Doe#5",
        "You have been inspired! Test Quote 6\n-John Doe#6",
        "Android is really bad!\n–Said no one ever"//"\n" just means next line
    };
    public String rtnQte() {
        Random rndmGen = new Random();//Initialize
        int rndmNum = rndmGen.nextInt(qtsList.length);//Select random value from array
        return qtsList[rndmNum];//Return that value (String) from the array
    }
}
