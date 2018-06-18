package com.infomuslims;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

public class DailyDuaActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> duaList;
    ImageView img_daily_dua;
    AdRequest adRequest;
    private AdView daily_adView;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_dua);

        // initialize id
        listView = (ListView)findViewById(R.id.listView);
        img_daily_dua = (ImageView)findViewById(R.id.img_daily_dua);
        daily_adView = (AdView) findViewById(R.id.daily_adView);

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

        daily_adView.loadAd(adRequest);

        daily_adView.setAdListener(new AdListener() {
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

        
        // onclick listener
        img_daily_dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DailyDuaActivity.this, HomeScreen.class);
                startActivity(i);
            }
        });
        duaList = new ArrayList<String>();

        getDuaList();

        final ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,R.layout.daily_dua_list,R.id.tv_listItem, duaList);


        listView.setAdapter(arrayAdapter);

        // list item color
        listColor();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // argument position gives the index of item which is clicked
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
                /*if ((position % 2) == 0) {
                    v.setBackgroundColor(Color.parseColor("#F9F9F9"));

                } else if ((position % 2) != 0) {

                    v.setBackgroundColor(Color.parseColor("#FFFFFF"));
                }*/

                String message = arrayAdapter.getItem(position).toString();
                Intent intent = new Intent(DailyDuaActivity.this, DailyDuaSubListActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("message",message);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }


    private void listColor() {
        for(int i=0; i< duaList.size(); i++){
            if((i%2)==0)
            {

                listView.setBackgroundColor(Color.parseColor("#F9F9F9"));

            }
            else if((i%2)!=0)
            {

                listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        }
    }

    void getDuaList() {
        duaList.add("Dua while using Khaak-e-Shifa");
        duaList.add("While Eating Khaak-e-Shifa");
        duaList.add("While Building New House");
        duaList.add("While Leaving House For Special Work/Object/Purpose");
        duaList.add("While salvation of worldly and spiritual tasks at the time of leaving house");
        duaList.add("At the time of wearing Jewels");
        duaList.add("Whenever one sits in gathering");
        duaList.add("While on hill or on great height");
        duaList.add("For avoiding bad omens for traveller");
        duaList.add("Before starting journey");
        duaList.add("For talisman to be keep by traveller");
        duaList.add("For a traveller's family");
        duaList.add("When anyone loses way");
        duaList.add("At the time of visiting a dangerous place");
        duaList.add("At the time of arrival in new place");
        duaList.add("For safety from robbers");
        duaList.add("Dua after every prayer");
        duaList.add("For safety from drowning");
        duaList.add("Dua after every prayer");
        duaList.add("An excellent invocation Dua after Morning Prayer");
        duaList.add("Dua after Zohar Prayers");
        duaList.add("Dua after Asr Prayer");
        duaList.add("Dua after Maghrib Prayer");
        duaList.add("Dua after Maghrib Prayer");
        duaList.add("For preservation of faith");
        duaList.add("For true belief for one�s family");
        duaList.add("For offering thanks for the bounties bestowed by Allah");
        duaList.add("For limitless heavenly reward");
        duaList.add("Dua for reward of paradise");
        duaList.add("For Here After");
        duaList.add("Dua for all Night Ibadat");
        duaList.add("For Sawab of whole Night Ibadat");
        duaList.add("For seeking forgiveness of sins");
        duaList.add("For great sawab and protection from major sins");
        duaList.add("For Sawab, Forgiveness, Protection from Great Sins and Sawab for reciting 12 Qurans");
        duaList.add("For protection from Hell");
        duaList.add("For safety from enemy");
        duaList.add("For protection of self and wealth");
        duaList.add("For recovery of misplaced or lost thing");
        duaList.add("For release from Prison");
        duaList.add("For avoiding bad thoughts and temptation");
        duaList.add("Dua for avoiding temptation & greed");
        duaList.add("Dua for avoiding bad dreams");
        duaList.add("Dua for not getting afraid in sleep");
        duaList.add("For love (Wife & Husband)");
        duaList.add("For Obedience");
        duaList.add("For getting a child");
        duaList.add("For easy and safe delivery of child");
        duaList.add("Dua for Aqiqa of child");
        duaList.add("At the time of Circumcision");
        duaList.add("For increase of breast milk");
        duaList.add("For wealth & prosperity");
        duaList.add("For increase of Sustenance");
        duaList.add("For Disbursement of Debts");
        duaList.add("For removal of Poverty and Worries");
        duaList.add("For removing Worries");
        duaList.add("For Warding off Calamities");
        duaList.add("Dua for safeguard from Drowning / Burning");
        duaList.add("Do after every prayer");
        duaList.add("Dua and prayers for getting a child");
        duaList.add("Dua for getting a child");
        duaList.add("Dua for Safety of Pregnancy");
        duaList.add("Dua for Safety of Pregnancy and Avoiding Abortion");
        duaList.add("Dua for easy delivery of child");
        duaList.add("Dua for excessive weeping child");
        duaList.add("Dua for increase in Sustenance");
        duaList.add("Dua for Increasing Memory");
        duaList.add("Dua for Learning Quran by Heart");
        duaList.add("Dua for Banishing the Effect of Black Magic");
        duaList.add("Dua for Protection from Satan and Enchantment");
        duaList.add("Dua for Repelling Devil and Dispelling Magic");
        duaList.add("Dua for security against Witch Craft");
        duaList.add("Dua for cure of all Diseases");
        duaList.add("Dua for all Diseases and for all Purposes");
        duaList.add("Dua for Cure from All Diseases");
        duaList.add("Dua for Increase in Business");
        duaList.add("Dua to be Recited at the Time of Going to Market");
        duaList.add("Dua to be Recited when one sets in his Shop");
        duaList.add("Dua at the Time of Purchase");
        duaList.add("Dua for the safety of the store");
        duaList.add("Dua for all purposes");
        duaList.add("Dua Moosa Kazim (a.s.) Dua for all purposes");
        duaList.add("For all purposes");
        duaList.add("To be recited at the Time of Death");
        duaList.add("To be Recited by 40 Momins at Death Body of Momin");
        duaList.add("While Entering the Graveyard");

    }

    @Override
    public void onPause() {
        if (daily_adView != null) {
            daily_adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (daily_adView != null) {
            daily_adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (daily_adView != null) {
            daily_adView.destroy();
        }
        super.onDestroy();
    }


    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

}