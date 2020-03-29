package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Devoloper extends AppCompatActivity {
    AdView mAdView;

    TextView intro,collect;
    String introtext="Hi I am Sagar \n The goal of this project is to provide a simple, interactive way to visualize the impact of COVID-19." +
            " I want people able to see this as something that brings us all together. It's not one country, or another country; " +
            "it's one planet – and this is what our planet looks like today."
            ;
    String info="The data is from Worldometer's real-time updates, utilizing reliable sources from around the world. The TODAY cases/deaths are based on GMT (+0). " +
            "The website pulls new data every 2 minutes, refresh to see any changes.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devoloper);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        intro = findViewById(R.id.txtIntro);
        intro.setText(introtext);

        collect = findViewById(R.id.txtCollect);
        collect.setText("Note: "+info);
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
                Toast.makeText(getApplicationContext(),"Alredy in Devoloper Page",Toast.LENGTH_SHORT).show();
        }
        switch (item.getItemId()){
            case R.id.credits:
                Intent intent = new Intent(Devoloper.this,Credits.class);
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
