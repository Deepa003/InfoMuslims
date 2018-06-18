package com.infomuslims;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;
import java.util.List;

public class MuslimHolidayActivity extends AppCompatActivity {


    private List<MuslimHolidayModel> muslimHolidayModelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MuslimHolidayAdapter mAdapter;
    InterstitialAd mInterstitialAd;

    ImageView img_muslim_holiday;
    private AdView holiday_adView;
    AdRequest adRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muslim_holiday);


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
        holiday_adView = (AdView) findViewById(R.id.holiday_adView);
        adRequest = new AdRequest.Builder().build();

        holiday_adView.loadAd(adRequest);

        holiday_adView.setAdListener(new AdListener() {
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

        recyclerView = (RecyclerView) findViewById(R.id.rv_muslim_holiday);

        mAdapter = new MuslimHolidayAdapter(muslimHolidayModelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        // holiday listing
        prepareHolidayData();

        // back button
        img_muslim_holiday=(ImageView)findViewById(R.id.img_muslim_holiday);
        img_muslim_holiday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MuslimHolidayActivity.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onPause() {
        if (holiday_adView != null) {
            holiday_adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (holiday_adView != null) {
            holiday_adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (holiday_adView != null) {
            holiday_adView.destroy();
        }
        super.onDestroy();
    }

    private void prepareHolidayData() {

        MuslimHolidayModel muslimHolidayModel = new MuslimHolidayModel("First Day of Hajj", "Aug 30, 2017");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Hajj 2017", "Aug 30 - Sep 04, 2017");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Day of Arafah", "Aug 31, 2017");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Day of the sacrifice", "Sep 01, 2017");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Days of the Joy", "Sep 02 - 04, 2017");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Eid al-Adha", "Sep 02 - 05, 2017");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Day of Ashura", "Oct 01, 2017");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("The Prophet's B'day \n" + "(Mawlid an-Nabi)", "Dec 01, 2017");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Leilat al-Meiraj", "Apr 13, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Laylat al Barat", "Apr 30, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Ramadan 2018", "May 16 - Jun 15, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Laylat al-Qadr", "Jun 11, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Eid al-Fitr", "Jun 15 - 17, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("First Day of Hajj", "Aug 19, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Hajj 2018", "Aug 19 - 24, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Day of Arafah", "Aug 20, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Day of sacrifice", "Aug 21, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Days of the Joy", "Aug 22 - 24, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Eid al-Adha", "Aug 22 - 25, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Day of Ashura", "Sep 20, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("The Prophet's B'day\n" + "(Mawlid an-Nabi)", "Nov 21, 2018");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Leilat al-Meiraj", "Apr 03, 2019");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Laylat al Barat", "Apr 20, 2019");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Ramadan 2019", "May 06 - Jun 05, 2019");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Laylat al-Qadr", "Jun 01, 2019");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Eid al-Fitr", "Jun 05 - 07, 2019");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Day of Ashura", "Sep 10, 2019");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("The Prophet's B'day\n" + "(Mawlid an-Nabi)", "Nov 10, 2019");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Leilat al-Meiraj", "Mar 22, 2020");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Laylat al Barat", "Apr 08, 2020");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("Laylat al-Qadr", "May 20, 2020");
        muslimHolidayModelList.add(muslimHolidayModel);

        muslimHolidayModel = new MuslimHolidayModel("The Prophet's B'day\n" + "(Mawlid an-Nabi)", "Oct 29, 2020");
        muslimHolidayModelList.add(muslimHolidayModel);


        mAdapter.notifyDataSetChanged();
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

}
