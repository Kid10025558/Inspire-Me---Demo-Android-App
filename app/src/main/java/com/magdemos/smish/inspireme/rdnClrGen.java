package com.magdemos.smish.inspireme;

import android.graphics.Color;
import java.util.Random;
//Importing the classes necessary for this class

public class rdnClrGen {
    public String mColors[] = { //This is the list of colors
            "#3498db",
            "#2980b9",
            "#9b59b6",
            "#9b59b6",
            "#e67e22",
            "#8e44ad",
            "#16a085",
            "#1abc9c",
            "#2ecc71",
            "#f1c40f",
            "#7f8c8d",
            "#d2527f",
            "#bdc3c7"
    };

    public int rtnClr() {
        Random rndm = new Random();//Initialize
        int rndmNum = rndm.nextInt(mColors.length);//Pick a number value from the array
        int col = Color.parseColor(mColors[rndmNum]);//Look for value in array, and parse it into a color
        return col;//Returns the random color when this method is called
    }
}
