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

public class NamesActivity extends AppCompatActivity {

    private List<NamesModel> quranModelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private NmaesAdapter mAdapter;
    private AdView names_adView;
    InterstitialAd mInterstitialAd;
    AdRequest adRequest;
    ImageView img_names_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);

        // initializing id
        initializeId();

        // ******************** INTERSTITIAl AD **********************

        mInterstitialAd = new InterstitialAd(this);
        // set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));

        adRequest = new AdRequest.Builder().build();

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

        names_adView.loadAd(adRequest);

        names_adView.setAdListener(new AdListener() {
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

        mAdapter = new NmaesAdapter(quranModelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareNamesData();

        img_names_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NamesActivity.this, HomeScreen.class);
                startActivity(intent);
            }
        });

    }

    private void prepareNamesData() {
        NamesModel quranModel = new NamesModel("Allah", "The Greatest Name", " الله "  ,"00");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mu'min", "The Inspirer of Faith", " المؤمن ","01" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Ar-Rahim ", "The All-Merciful", " الرحيم " ,"02");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Malik ", "The Absolute Ruler", " الملك " ,"03");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Quddus ", "The Pure One", " القدوس " ,"04");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("As-Salam", "The Source of Peace", " السلام " ,"05");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mu'min", "The Inspir", " المؤمن " ,"06");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Muhaymin", "The Guardian", " المهيمن ","07" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Aziz ", "The Victorious", " العزيز " ,"08");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Jabbar ", "The Compeller", " الجبار " ,"09");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mutakabbir", "The Greatest", " المتكبر ","10" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Khaliq ", "The Creator", " الخالق " ,"11");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Bari' ", "The Maker of Order", " البارئ " ,"12");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Musawwir", "The Shaper of Beauty", " المصور " ,"13");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Ghaffar ", "The Forgiving", " الغفار " ,"14");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Qahhar ", "The Subduer", " القهار " ,"15");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Wahhab", "The Giver of All", " الوهاب " ,"16");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Ar-Razzaq", "The Sustainer", " الرزاق " ,"17");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Fattah", "The Opener", " الفتاح " ,"18");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-`Alim", "The Knower of All", " العليم " ,"19");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Qabid", "The Constrictor", " القابض " ,"20");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Basit", "The Reliever", " الباسط " ,"21");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Khafid ", "The Abaser", " الخافض " ,"22");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Ar-Rafi", "The Exalter", "الرافع  " ,"23");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mu'izz", "The Bestower of Honors", " المعز " ,"24");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mudhill ", "The Humiliator", " المذل ","25" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("As-Sami", "The Hearer of All", "السميع  " ,"26");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Basir", "The Seer of All", " البصير " ,"27");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Hakam", "The Judge", " الحكم ","28" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-`Adl", "The Just", " العدل " ,"29");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Latif", "The Subtle One", " اللطيف " ,"30");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Khabir", "The All-Aware", " الخبير " ,"31");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Halim", "The Forbearing", " الحليم ","32" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Azim", "The Magnificent", " العظيم " ,"33");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Ghafur", "The Forgiver and Hider of Faults", "  الغفور" ,"34");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Ash-Shakur", "The Rewarder of Thankfulness", " الشكور " ,"35");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Ali", "The Highest", " العلى " ,"36");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Kabir", "The Greatest", " الكبير " ,"37");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Hafiz", "The Preserver", " الحفيظ " ,"38");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Muqit", "The Nourisher", " المقيت " ,"39");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Hasib", "The Accounter", " الحسيب " ,"40");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Jalil", "The Mighty", " الجليل " ,"41");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Karim", "The Generous", " الكريم " ,"42");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Ar-Raqib", "The Watchful One", " الرقيب " ,"43");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mujib", "The Responder to Prayer", " المجيب " ,"44");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Wasi", "The All-Comprehending", " الواسع " ,"45");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Hakim", "The Perfectly Wise", " الحكيم ","46" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Wadud", "The Loving One", " الودود " ,"47");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Majid", "The Majestic One", " المجيد ","48" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Ba'ith", "The Resurrector", " الباعث " ,"49");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Ash-Shahid", "The Witness", " الشهيد " ,"50");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Haqq", "The Truth", " الحق " ,"51");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Wakil", "The Trustee", "الوكيل  " ,"52");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Qawiyy", "The Possessor of All Strength", " القوى " ,"53");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Matin", "The Forceful One", " المتين " ,"54");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Waliyy", "The Governor", " الولى " ,"55");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Hamid", "The Praised One", " الحميد " ,"56");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Muhsi", "The Appraiser", "المحصى  " ,"57");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mubdi'", "The Originator", " المبدئ " ,"58");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mu'id", "The Restorer", " المعيد " ,"59");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Muhyi", "The Giver of Life", " المحيى ","60" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mumit", "The Taker of Life", " المميت ","61" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Hayy", "The Ever Living One", " الحي ","62" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Qayyum", "The Self-Existing One", " القيوم " ,"63");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Wajid", "The Finder", "الواجد  " ,"64");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Majid", "The Glorious", " الماجد ","65" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Wahid", "The Unique, The Single", " الواحد " ,"66");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Ahad", "The One, The Indivisible", " الاحد ","67" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("As-Samad", "The Satisfier of All Needs", " الصمد " ,"68");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Qadir", "The All Powerful", " القادر " ,"69");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Muqtadir", "The Creator of All Power", " المقتدر " ,"70");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Muqaddim", "The Expediter", " المقدم ","71" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mu'akhkhir", "The Delayer", "المؤخر  " ,"72");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Awwal", "The First", " الأول " ,"73");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Akhir", "The Last", "الأخر  ","74" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Az-Zahir", "The Manifest One", " الظاهر " ,"75");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Batin ", "The Hidden One", " الباطن " ,"76");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Wali", "The Protecting Friend", " الوالي " ,"77");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Muta'ali", "The Supreme One", " المتعالي ","78" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Barr", "The Doer of Good", " البر ","79" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("At-Tawwab ", "The Guide to Repentance", " التواب " ,"80");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Muntaqim", "The Avenger", " المنتقم " ,"81");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-'Afuww", "The Forgiver", " العفو " ,"82");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Ar-Ra'uf ", "The Clement", " الرؤوف " ,"83");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Malik-al-Mulk", "The Owner of All", " مالك الملك " ,"84");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Dhu-al-Jalal wa-al-Ikram", "The Lord of Majesty and Bounty", " ذو الجلال و الإكرام " ,"85");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Muqsit", "The Equitable One", " المقسط " ,"86");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Jami'", "The Gatherer", " الجامع " ,"87");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Ghani", "The Rich One", " الغنى " ,"88");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mughni", "The Enricher", " المغنى ","89" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Mani'", "The Preventer of Harm", " المانع " ,"90");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Ad-Darr", "The Creator of The Harmful", " الضار " ,"91");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("An-Nafi'", "The Creator of Good", " النافع " ,"92");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("An-Nur", "The Light", " النور " ,"93");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Hadi", "The Guide", " الهادي ","94" );
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Badi ", "The Originator", " البديع " ,"95");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Baqi", "The Everlasting One", " الباقي " ,"96");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Al-Warith", "The Inheritor of All", " الوارث " ,"97");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("Ar-Rashid", "The Righteous Teacher", " الرشيد " ,"98");
        quranModelList.add(quranModel);

        quranModel = new NamesModel("As-Sabur", "The Patient One", " الصبور " ,"99");
        quranModelList.add(quranModel);
        mAdapter.notifyDataSetChanged();
    }

    private void initializeId() {
        img_names_back=(ImageView)findViewById(R.id.img_names_back);
        recyclerView = (RecyclerView) findViewById(R.id.rv_names);
        names_adView = (AdView) findViewById(R.id.names_adView);

    }

    @Override
    public void onPause() {
        if (names_adView != null) {
            names_adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (names_adView != null) {
            names_adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (names_adView != null) {
            names_adView.destroy();
        }
        super.onDestroy();
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }


}
