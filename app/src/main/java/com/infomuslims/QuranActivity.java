package com.infomuslims;

import android.content.Context;
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

public class QuranActivity extends AppCompatActivity {

    private List<QuranModel> quranModelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private QuranAdapter mAdapter;
    ImageView img_quran_back;

    Context context;
    private AdView quran_adView;
    InterstitialAd mInterstitialAd;
    AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);

        // initializing id
        initializeId();

        open();
    }

    private void open() {

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

        AdRequest adRequest = new AdRequest.Builder().build();
        //adRequest = new AdRequest.Builder().addTestDevice("F3CC59C1590C784605BFF7D998258A67").build();

        quran_adView.loadAd(adRequest);

        quran_adView.setAdListener(new AdListener() {
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

        context=getApplicationContext();
        mAdapter = new QuranAdapter(context,quranModelList );
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareQuranData();

        img_quran_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuranActivity.this, HomeScreen.class);
                startActivity(intent);
            }
        });

    }

    private void initializeId() {
        img_quran_back=(ImageView)findViewById(R.id.img_quran_back);
        recyclerView = (RecyclerView) findViewById(R.id.rv_quran);
        quran_adView = (AdView) findViewById(R.id.quran_adView);

    }

    @Override
    public void onPause() {
        if (quran_adView != null) {
            quran_adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (quran_adView != null) {
            quran_adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (quran_adView != null) {
            quran_adView.destroy();
        }
        super.onDestroy();
    }

    private void prepareQuranData() {

        QuranModel quranModel = new QuranModel("Al-Faatiha", "The Opening", " الفاتحة " );
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Baqara", "The Cow", " البقرة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-i-Imraan", "The Family Of Imraan", " آل عمران ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("An-Nisaa", "Women", " النساء ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Maadia", "The Food", " المائدة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-An'aam", "The Cattle", " الأنعام ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-A'raaf", "The Elevated Place", " الأعراف ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Anfall", "The Spoils Of War", " الأنفال ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Tawba", "Repetance", " التوبة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Hud", "Hud", " هود ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Yusuf", "Yusuf", " يوسف ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Ra'd", "The Thunder", " الرعد ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Ibrahim", "Ibrahim", " ابراهيم ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Hajj", "The Pilgrimage", " الحج ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Noor", "The Light", " النور ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("An-Naml", "The Ant", " النمل ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Qasa", "The Narrative", " القصص ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Ankaboot", "The Spider", " العنكبوت ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Room", "The Romans", " الروم ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Luman", "Luman", " لقمان ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("As-Sajda", "The Aboration", " السجدة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Ahzaab", "The Allies", " الأحزاب ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Saba", "Saba", " سبإ ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Faatir", "The Originator", " فاطر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Yaseen", "Ya Seen", " يس ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("As-Saaffaat", "The Rangers", " الصافات ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Saad", "Suad", " ص ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Az-Zumar", "The Companies", " الزمر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Ghaafir", "The Believer", " غافر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Fussilat", "Ha Mim", " فصلت ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Jaathiya", "The Kneeling", " الجاثية ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Ahqaf", "The Sandhills", " الأحقاف ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Muhammad", "Muhammad", " محمد ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Fat", "The Victory", " الفتح ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Hujuraat", "The Chambers", " الحجرات ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Qaaf", "Qaf", " ق ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Adh-Dhaariyat", "The Scatterers", " الذاريات ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("At-Tur", "The Mountain", " الطور ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("An-Najm", "The Star", " النجم ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Qamar", "The Moon", " القمر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Rahmaan", "The Beneficient", " الرحمن ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Waaqia", "The Great Event", " الواقعة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Hadid", "The Iron", " الحديد ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Mujaadila", "The Pleading One", " المجادلة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Hashr", "The Banishment", " الحشر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Mumtahana", "The Examined One", " الممتحنة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("As-Saff", "The Ranks", " الصف ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Jumu'a", "Friday", " الجمعة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Munaafiqoon", "The Hypocrites", "المنافقون  ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("At-Taghaabun", "Loss and Gain", " التغابن ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("At-Talaaq", "The Divorce", " الطلاق ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("At-Tahrim", "The Prohibition", " التحريم ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Mulk", "The Kingdom", " الملك ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Qalam", "The Pen", " القلم ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Haaqqa", "The Sure Calamity", " الحاقة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Ma'aarij", "The Ways Of Ascent", " المعارج ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Nooh", "Nuh", " نوح ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Jinn", "The Jinn", " الجن ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Muzzammil", "The Wrapped Up", " المزمل ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Muddaththir", "The Clothed Done", " المدثر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Qiyaama", "The Resurrection", " القيامة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Insaan", "The Man", " الانسان ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Mursalaat", "The Emissaries", " المرسلات ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("An-Naba", "The Great Event", " النبإ ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("An-Naazi'aat", "Those Who Pull Out", " النازعات ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Abasa", "He Frowned", " عبس ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("At-Takwir", "The Covering Up", " التكوير ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Infitaar", "The Cleaving Asund", " الإنفطار ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Mutaffifin", "The Defrauding", " البروج ");
        quranModelList.add(quranModel);


        quranModel = new QuranModel("Al-Ishiqaq", "The Sundering", " البروج ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Burooj", "The Mansions Of The Stars", " البروج ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Taariq", "The Night-Corner", " الطارق ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-A'laa", "The Most High", " الأعلى ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Ghaashiya", "The Overwhelming", " الغاشية ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Fajr", "The Daybreak", " الفجر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Balad", "The City", " البلد ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Ash-Shams", "The Sun", " الشمس ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Lail", "The Night", " الليل ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Ad-Dhuhaa", "The Early Hours", " الضحى ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Ash-Sharh", "The Expansion", " الشرح  ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("At-Tin", "The Fig", " التين ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Alaq", "The Clot", " العلق ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Qadr", "The Majesty", " القدر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Bayyina", "The Clever Evidence", " البينة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Az-Zalzala", "The Shaking", " الزلزلة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Aadiyaat", "The Assaulters", " العاديات ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Qaari'a", "The Terrible Calam", " القارعة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("At-Takaathur", "The Multiplicatio", " التكاثر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Asr", "The Time", " العصر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Humaza", "The Slandeer", " الهمزة ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Fil", "The Elephant", " الفيل ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Quarish", "The Qureaish", " قريش ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Maa'un", "The Daily Necessar", " الماعون ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Kawthar", "The Heavily Fount", " الكوثر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Kaafiroon", "The Unbelievers", "الكافرون  ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("An-Nasr", "The Help", " النصر ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Masad", "The Palm Fiber", " المسد ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Ikhlaas", "The Unity", " الإخلاص ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("Al-Falaq", "The Dawn", " الفلق ");
        quranModelList.add(quranModel);

        quranModel = new QuranModel("An-Naas", "The Men", " الناس ");
        quranModelList.add(quranModel);

        mAdapter.notifyDataSetChanged();
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }


}
