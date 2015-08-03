package com.magdemos.smish.inspireme;

import java.util.Random;

/**
 * Created by smdroidstudio.tk on 2/14/15.
 */


public class rdnQteGen {
    private String[] qtsList = {
        "You have been inspired! Test Quote 1" +
                "\n-John Doe#1",// this is an example of concatenation
        "You have been inspired! Test Quote 2\n-John Doe#2",
        "You have been inspired! Test Quote 3\n-John Doe#3",
        "You have been inspired! Test Quote 4\n-Jane Doe#1",
        "You have been inspired! Test Quote 5\n–John Doe#5",
        "You have been inspired! Test Quote 6\n-John Doe#6",
        "Android is really bad!\n–Said no one ever"
    };
    public String rtnQte() {
        Random rndmGen = new Random();
        int rndmNum = rndmGen.nextInt(qtsList.length);
        return qtsList[rndmNum];
    }
}
