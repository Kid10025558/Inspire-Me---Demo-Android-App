package com.magdemos.smish.inspireme;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by smdroidstudio.tk on 2/14/15.
 */

/*
ran out of time and didn't finish this part of the code in class...

but it works like the rdnQuotesGen except for colors, shouldn't be too hard to understand...
got any questions ask nxt class
 */
public class rdnClrGen {
    public String mColors[] = {
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
        Random rndm = new Random();
        int rndmNum = rndm.nextInt(mColors.length);
        int col = Color.parseColor(mColors[rndmNum]);
        return col;
    }
}
