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
import android.util.Log;


public class InspireMeActivity extends ActionBarActivity {
    public static final String logoutput = InspireMeActivity.class.getSimpleName();
    private rdnQteGen qtList = new rdnQteGen();
    private rdnClrGen clrList = new rdnClrGen();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inspireme_activity);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        final TextView factLabel = (TextView) findViewById(R.id.theqte);
        final Button showQuoteButton = (Button) findViewById(R.id.inspireMe);

        // just ignore this... this is just for users to find my play store acc
        /**ImageView Button = (ImageView)findViewById(R.id.linktostore);

        Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://play.google.com/store/apps/dev?id=7622152208771596067"));
                startActivity(intent);
            }
        });*/
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factLabel.setText(qtList.rtnQte());
                int color = clrList.rtnClr();
                relativeLayout.setBackgroundColor(color);
                showQuoteButton.setTextColor(color);
            }
        };
        showQuoteButton.setOnClickListener(listener);
        Log.d(logoutput, "it came");
    }
}
