package com.magdemos.smish.inspireme;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
//The above lines just import classes that we will need in the following code

public class InspireMeActivity extends ActionBarActivity {
    private rdnQteGen qtList = new rdnQteGen();//We call the method that returns a random quote
    private rdnClrGen clrList = new rdnClrGen();//We call the methond that returns a random background color

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//Default code for showing up application
        setContentView(R.layout.inspireme_activity);//Setting how our application would look once opened
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);//Our Layout type
        final TextView factLabel = (TextView) findViewById(R.id.theqte);//Setting the TextView for quotes
        final Button showQuoteButton = (Button) findViewById(R.id.inspireMe);//Setting the Button

        View.OnClickListener listener = new View.OnClickListener() { //Where random quote action takes place
            @Override
            public void onClick(View v) {
                factLabel.setText(qtList.rtnQte());//Selects a random quote
                int color = clrList.rtnClr();//Selects a random color
                relativeLayout.setBackgroundColor(color);//Sets that random quote
                showQuoteButton.setTextColor(color);//Sets that random quote
            }
        };
        showQuoteButton.setOnClickListener(listener);//Display our button whenever it's clicked
    }
}
