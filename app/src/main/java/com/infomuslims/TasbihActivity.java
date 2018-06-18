package com.infomuslims;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class TasbihActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv_count , tv_total, tv_reset;
    Button btn_press;
    ImageView img_tasbih_back;
    int count=0, total=0;
    InterstitialAd mInterstitialAd;
    AdRequest adRequest;

    private AdView tasbih_adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);

        // initializing id's
        initializeId();

        // ******************** INTERSTITIAl AD **********************

        mInterstitialAd = new InterstitialAd(this);
        // set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));

        adRequest = new AdRequest.Builder()
                .build();

        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });




        // ******************** BANNER AD **********************

        //AdRequest adRequest = new AdRequest.Builder().build();
        AdRequest adRequest = new AdRequest.Builder().build();

        tasbih_adView.loadAd(adRequest);

        tasbih_adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                Log.i("Ads", "onAdLoaded");
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
                Log.i("Ads", "onAdFailedToLoad");
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                Log.i("Ads", "onAdOpened");
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
                Log.i("Ads", "onAdLeftApplication");
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when when the user is about to return
                // to the app after tapping on an ad.
                Log.i("Ads", "onAdClosed");
            }
        });

        // on click listener
        clickListener();

    }


    private void initializeId() {
        tv_count = (TextView)findViewById(R.id.tv_count);
        tv_total = (TextView)findViewById(R.id.tv_total);
        tv_reset = (TextView)findViewById(R.id.tv_reset);
        img_tasbih_back = (ImageView)findViewById(R.id.img_tasbih_back);
        btn_press = (Button)findViewById(R.id.btn_press);
        tasbih_adView = (AdView) findViewById(R.id.tasbih_adView);

    }

    private void clickListener() {
        tv_count.setOnClickListener(this);
        tv_total.setOnClickListener(this);
        tv_reset.setOnClickListener(this);
        img_tasbih_back.setOnClickListener(this);
        btn_press.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn_press:

                count++;
                total++;
                if(count<=33) {
                    String val = Integer.toString(count);
                    tv_count.setText(val + "/33\n\nCount");

                }
                else
                {
                    count=0;
                    String val = Integer.toString(count);
                    tv_count.setText(val + "/33\n\nCount");
                }
                String total_value = Integer.toString(total);
                tv_total.setText(total_value + "\n\nTotal");
                break;

            case R.id.tv_reset:
                String value = (Integer.toString(0));
                tv_count.setText(value+ "/33\n\nCount");
                tv_total.setText(value+ "\n\nTotal");
                count=0;
                total=0;


                break;

            case R.id.img_tasbih_back:
                Intent intent=new Intent(TasbihActivity.this, HomeScreen.class);
                startActivity(intent);
                break;

        }
    }

    @Override
    public void onPause() {
        if (tasbih_adView != null) {
            tasbih_adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (tasbih_adView != null) {
            tasbih_adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (tasbih_adView != null) {
            tasbih_adView.destroy();
        }
        super.onDestroy();
    }


    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

}
