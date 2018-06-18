package com.infomuslims;


import android.content.Intent;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class PrayerRequestActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img_prayer_back;
    Button btn_all,btn_request;
    Fragment fragment = null;
    private AdView request_adView;
    InterstitialAd mInterstitialAd;
    AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer_request);

        // initializingID
        initializeID();

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
        adRequest = new AdRequest.Builder().build();

        request_adView.loadAd(adRequest);

        request_adView.setAdListener(new AdListener() {
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

        
        if(fragment==null) {
            btn_request.setBackgroundColor(getResources().getColor(R.color.button_color));
            btn_all.setBackgroundColor(getResources().getColor(R.color.title_color));

            fragment = new PrayerRequestFragment();
               FragmentManager fm = this.getSupportFragmentManager();
               FragmentTransaction ft = fm.beginTransaction();
               ft.replace(R.id.frame, fragment);
               ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
               ft.commit();
           }
        // on click listener
        clickListener();

    }

    private void initializeID() {

        img_prayer_back = (ImageView)findViewById(R.id.img_prayer_back);
        btn_all = (Button) findViewById(R.id.btn_all);
        btn_request = (Button) findViewById(R.id.btn_request);
        request_adView = (AdView) findViewById(R.id.request_adView);

    }

    private void clickListener() {
        img_prayer_back.setOnClickListener(this);
        btn_all.setOnClickListener(this);
        btn_request.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.img_prayer_back:
                Intent intent = new Intent(PrayerRequestActivity.this, HomeScreen.class);
                startActivity(intent);

                break;

            case R.id.btn_all:
                btn_all.setBackgroundColor(getResources().getColor(R.color.button_color));
                btn_request.setBackgroundColor(getResources().getColor(R.color.title_color));
                fragment = new AllRequestFragment();

                break;

            case R.id.btn_request:
                btn_request.setBackgroundColor(getResources().getColor(R.color.button_color));
                btn_all.setBackgroundColor(getResources().getColor(R.color.title_color));
                fragment = new PrayerRequestFragment();

        }
        FragmentManager fm = this.getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }

    @Override
    public void onPause() {
        if (request_adView != null) {
            request_adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (request_adView != null) {
            request_adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (request_adView != null) {
            request_adView.destroy();
        }
        super.onDestroy();

    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }


}
