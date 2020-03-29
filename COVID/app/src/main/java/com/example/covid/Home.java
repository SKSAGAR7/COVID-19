package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Home extends AppCompatActivity {
    AdView mAdView;

    Button one,two,three,four,five,six;
    String oneText = "COVID-19 Visual Report World Wide";
    String twoText = "COVID-19 Country Wise Report World Wide";
    String threeText = "COVID-19 India State wise Report";
    String fourText = "COVID-19 India City Wise Report";
    String fiveText = "Question & Anser About CoronaVirus";
    String sixText ="Basic protective measures against the new coronavirus";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        one = findViewById(R.id.btnOne);
        one.setText(oneText);
        two = findViewById(R.id.btnTwo);
        two.setText(twoText);
        three = findViewById(R.id.btnThree);
        three.setText(threeText);
        four = findViewById(R.id.btnFour);
        four.setText(fourText);
        five = findViewById(R.id.btnFive);
        five.setText(fiveText);
        six = findViewById(R.id.btnSix);
        six.setText(sixText);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,MainActivity.class);
                startActivity(intent);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,WorlWide.class);
                startActivity(intent);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,India.class);
                startActivity(intent);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,City.class);
                startActivity(intent);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,MyExpandableListView.class);
                startActivity(intent);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Public.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.devoloper:
                Intent intent = new Intent(Home.this,Devoloper.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.credits:
                Intent intent = new Intent(Home.this,Credits.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.feedback:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.setPackage("com.google.android.gm");
                String[] strTo= { "sagarsk205@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,strTo);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback");
                intent.putExtra(Intent.EXTRA_TEXT,"Write your feedback");
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Give CoronaVirus a Solid Headshot by Staying Home and Win the Battle Against the Virus!!! \nTo Track COVID-19 instantly Download & Share the App from Link: https://drive.google.com/open?id=1Y8OJhihTubucD8jPLNqI4SvOFlEqoTWD\n #StayHomeStaySafe :)\n#Sk Sagar");
                sendIntent.setType("text/plain");
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
