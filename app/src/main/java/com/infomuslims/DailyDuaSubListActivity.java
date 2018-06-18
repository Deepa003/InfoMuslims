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
import android.widget.TextView;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class DailyDuaSubListActivity extends AppCompatActivity implements View.OnClickListener{

    private List<DailyDuaSubListModel> dailyDuaSubListModelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DailyDuaSubListAdapter mAdapter;
    TextView tv_dailydua_subtab;

    ImageView img_dailydua_subtab_back;
    private AdView daily_list_adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_dua_sub_list);

        //initialize id
        initializeID();
        img_dailydua_subtab_back.setOnClickListener(this);

        //AdRequest adRequest = new AdRequest.Builder().build();
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("AA26C6DE32BDB7A329A27BC60F42E475").build();

        daily_list_adView.loadAd(adRequest);

        daily_list_adView.setAdListener(new AdListener() {
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
      //  clickListener();

        mAdapter = new DailyDuaSubListAdapter(dailyDuaSubListModelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        tv_dailydua_subtab.setText(message);

        if(message.equalsIgnoreCase("Dua while using Khaak-e-Shifa"))
        {
            prepareDuaSubData1();
        }
        else if(message.equalsIgnoreCase("While Eating Khaak-e-Shifa"))
        {
            prepareDuaSubData2();
        }

        else if(message.equalsIgnoreCase("While Building New House"))
        {
            prepareDuaSubData3();
        }
        else if(message.equalsIgnoreCase("While Leaving House For Special Work/Object/Purpose"))
        {
            prepareDuaSubData4();
        }
        else if(message.equalsIgnoreCase("While salvation of worldly and spiritual tasks at the time of leaving house"))
        {
            prepareDuaSubData5();
        }
        else if(message.equalsIgnoreCase("At the time of wearing Jewels"))
        {
            prepareDuaSubData6();
        }
        else if(message.equalsIgnoreCase("Whenever one sits in gathering"))
        {
            prepareDuaSubData7();
        }
        else if(message.equalsIgnoreCase("While on hill or on great height"))
        {
            prepareDuaSubData8();
        }
        else if(message.equalsIgnoreCase("For avoiding bad omens for traveller"))
        {
            prepareDuaSubData9();
        }
        else if(message.equalsIgnoreCase("Before starting journey"))
        {
            prepareDuaSubData10();
        }
        else if(message.equalsIgnoreCase("For talisman to be keep by traveller"))
        {
            prepareDuaSubData11();
        }
        else if(message.equalsIgnoreCase("For a traveller's family"))
        {
            prepareDuaSubData12();
        }
        else if(message.equalsIgnoreCase("When anyone loses way"))
        {
            prepareDuaSubData13();
        }
        else if(message.equalsIgnoreCase("At the time of visiting a dangerous place"))
        {
            prepareDuaSubData14();
        }else if(message.equalsIgnoreCase("At the time of arrival in new place"))
        {
            prepareDuaSubData15();
        }
        else if(message.equalsIgnoreCase("For safety from robbers"))
        {
            prepareDuaSubData16();
        }
        else if(message.equalsIgnoreCase("Dua and prayer at the time of storm in the sea"))
        {
            prepareDuaSubData17();
        }
        else if(message.equalsIgnoreCase("For safety from drowning"))
        {
            prepareDuaSubData18();
        }
        else if(message.equalsIgnoreCase("Dua after every prayer"))
        {
            prepareDuaSubData19();
        }
        else if(message.equalsIgnoreCase("An excellent invocation Dua after Morning Prayer"))
        {
            prepareDuaSubData20();
        }
        else if(message.equalsIgnoreCase("Dua after Zohar Prayers"))
        {
            prepareDuaSubData21();
        }
        else if(message.equalsIgnoreCase("Dua after Asr Prayer"))
        {
            prepareDuaSubData22();
        }

        else if(message.equalsIgnoreCase("Dua after Maghrib Prayer"))
        {
            prepareDuaSubData23();
        }
        else if(message.equalsIgnoreCase("Dua after Isha Prayer"))
        {
            prepareDuaSubData24();
        }else if(message.equalsIgnoreCase("For preservation of faith"))
        {
            prepareDuaSubData25();
        }
        else if(message.equalsIgnoreCase("For true belief for one�s family"))
        {
            prepareDuaSubData26();
        }
        else if(message.equalsIgnoreCase("For offering thanks for the bounties bestowed by Allah"))
        {
            prepareDuaSubData27();
        }
        else if(message.equalsIgnoreCase("For limitless heavenly reward"))
        {
            prepareDuaSubData28();
        }
        else if(message.equalsIgnoreCase("Dua for reward of paradise"))
        {
            prepareDuaSubData29();
        }
        else if(message.equalsIgnoreCase("For Here After"))
        {
            prepareDuaSubData30();
        }

        else if(message.equalsIgnoreCase("Dua for all Night Ibadat"))
        {
            prepareDuaSubData31();
        }

        else if(message.equalsIgnoreCase("For Sawab of whole Night Ibadat"))
        {
            prepareDuaSubData32();
        }
        else if(message.equalsIgnoreCase("For seeking forgiveness of sins"))
        {
            prepareDuaSubData33();
        }
        else if(message.equalsIgnoreCase("For great sawab and protection from major sins"))
        {
            prepareDuaSubData34();
        }

        else if(message.equalsIgnoreCase("For Sawab, Forgiveness, Protection from Great Sins and Sawab for reciting 12 Qurans"))
        {
            prepareDuaSubData35();
        }

        else if(message.equalsIgnoreCase("For protection from Hell"))
        {
            prepareDuaSubData36();
        }

        else if(message.equalsIgnoreCase("For safety from enemy"))
        {
            prepareDuaSubData37();
        }

        else if(message.equalsIgnoreCase("For protection of self and wealth"))
        {
            prepareDuaSubData38();
        }
        else if(message.equalsIgnoreCase("For recovery of misplaced or lost thing"))
        {
            prepareDuaSubData39();
        }

        else if(message.equalsIgnoreCase("For release from Prison"))
        {
            prepareDuaSubData40();
        }
        else if(message.equalsIgnoreCase("For avoiding bad thoughts and temptation")) {
            prepareDuaSubData41();
        }
        else if(message.equalsIgnoreCase("Dua for avoiding temptation & greed"))
        {
            prepareDuaSubData42();
        }

        else if(message.equalsIgnoreCase("Dua for avoiding bad dreams"))
        {
            prepareDuaSubData43();
        }

        else if(message.equalsIgnoreCase("Dua for not getting afraid in sleep"))
        {
            prepareDuaSubData44();
        }
        else if(message.equalsIgnoreCase("For love (Wife & Husband)"))
        {
            prepareDuaSubData45();
        }
        else if(message.equalsIgnoreCase("For Obedience"))
        {
            prepareDuaSubData46();
        }
        else if(message.equalsIgnoreCase("For getting a child")) {
            prepareDuaSubData47();
        }

        else if(message.equalsIgnoreCase("For easy and safe delivery of child")) {
            prepareDuaSubData48();
        }

        else if(message.equalsIgnoreCase("Dua for Aqiqa of child")) {
            prepareDuaSubData49();
        }

        else if(message.equalsIgnoreCase("At the time of Circumcision")) {
            prepareDuaSubData50();
        }
        else if(message.equalsIgnoreCase("For increase of breast milk")) {
            prepareDuaSubData51();
        }
        else if(message.equalsIgnoreCase("For wealth & prosperity")) {
            prepareDuaSubData52();
        }
        else if(message.equalsIgnoreCase("For increase of Sustenance"))
        {
            prepareDuaSubData53();
        }
        else if(message.equalsIgnoreCase("For Disbursement of Debts"))
        {
            prepareDuaSubData54();
        }
        else if(message.equalsIgnoreCase("For removal of Poverty and Worries"))
        {
            prepareDuaSubData55();
        }
        else if(message.equalsIgnoreCase("For removing Worries"))
        {
            prepareDuaSubData56();
        }
        else if(message.equalsIgnoreCase("For Warding off Calamities"))
        {
            prepareDuaSubData57();
        }
        else if(message.equalsIgnoreCase("Dua for safeguard from Drowning / Burning"))
        {
            prepareDuaSubData58();
        }
        else if(message.equalsIgnoreCase("Do after every prayer"))
        {
            prepareDuaSubData59();
        }
        else if(message.equalsIgnoreCase("Dua and prayers for getting a child"))
        {
            prepareDuaSubData60();
        }
        else if(message.equalsIgnoreCase("Dua for getting a child"))
        {
            prepareDuaSubData61();
        }
        else if(message.equalsIgnoreCase("Dua for Safety of Pregnancy"))
        {
            prepareDuaSubData62();
        }else if(message.equalsIgnoreCase("Dua for Safety of Pregnancy and Avoiding Abortion"))
        {
            prepareDuaSubData63();
        }else if(message.equalsIgnoreCase("Dua for easy delivery of child"))
        {
            prepareDuaSubData64();
        }else if(message.equalsIgnoreCase("Dua for excessive weeping child"))
        {
            prepareDuaSubData65();
        }else if(message.equalsIgnoreCase("Dua for increase in Sustenance"))
        {
            prepareDuaSubData66();
        }else if(message.equalsIgnoreCase("Dua for Increasing Memory"))
        {
            prepareDuaSubData67();
        }else if(message.equalsIgnoreCase("Dua for Learning Quran by Heart"))
        {
            prepareDuaSubData68();
        }else if(message.equalsIgnoreCase("Dua for Banishing the Effect of Black Magic"))
        {
            prepareDuaSubData69();
        }else if(message.equalsIgnoreCase("Dua for Protection from Satan and Enchantment"))
        {
            prepareDuaSubData70();
        }else if(message.equalsIgnoreCase("Dua for Repelling Devil and Dispelling Magic"))
        {
            prepareDuaSubData71();
        }else if(message.equalsIgnoreCase("Dua for security against Witch Craft"))
        {
            prepareDuaSubData72();
        }else if(message.equalsIgnoreCase("Dua for cure of all Diseases"))
        {
            prepareDuaSubData73();
        }else if(message.equalsIgnoreCase("Dua for all Diseases and for all Purposes"))
        {
            prepareDuaSubData74();
        }
        else if(message.equalsIgnoreCase("Dua for Cure from All Diseases"))
        {
            prepareDuaSubData75();
        }
          else if(message.equalsIgnoreCase("Dua for Increase in Business"))
        {
            prepareDuaSubData76();
        }else if(message.equalsIgnoreCase("Dua to be Recited at the Time of Going to Market"))
        {
            prepareDuaSubData77();
        }else if(message.equalsIgnoreCase("Dua to be Recited when one sets in his Shop"))
        {
            prepareDuaSubData78();
        }else if(message.equalsIgnoreCase("Dua at the Time of Purchase"))
        {
            prepareDuaSubData79();
        }else if(message.equalsIgnoreCase("Dua for the safety of the store"))
        {
            prepareDuaSubData80();
        }else if(message.equalsIgnoreCase("Dua for all purposes"))
        {
            prepareDuaSubData81();
        }else if(message.equalsIgnoreCase("Dua Moosa Kazim (a.s.) Dua for all purposes"))
        {
            prepareDuaSubData82();
        }
        else if(message.equalsIgnoreCase("For all purposes"))
        {
            prepareDuaSubData83();
        }
        else if(message.equalsIgnoreCase("To be recited at the Time of Death"))
        {
            prepareDuaSubData84();
        }
        else if(message.equalsIgnoreCase("To be Recited by 40 Momins at Death Body of Momin"))
        {
            prepareDuaSubData85();
        }
        else if(message.equalsIgnoreCase("While Entering the Graveyard"))
        {
            prepareDuaSubData86();
        }

    }


    private void initializeID() {
        recyclerView = (RecyclerView)findViewById(R.id.rl_dailydua_subtab);
        img_dailydua_subtab_back = (ImageView)findViewById(R.id.img_dailydua_subtab_back);
        tv_dailydua_subtab = (TextView) findViewById(R.id.tv_dailydua_subtab);
        daily_list_adView = (AdView) findViewById(R.id.daily_list_adView);

    }

    /*private void clickListener() {
        img_dailydua_subtab_back.setOnClickListener(this);
    }*/
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_dailydua_subtab_back:

                Intent intent = new Intent(DailyDuaSubListActivity.this, DailyDuaActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void prepareDuaSubData1() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" ب اَللّٰهُمَّ إِنِّي أَسْأَلُكَ بِحَقِّ هٰذِهِ الطِّينَةِ وَ بِحَقِّ الْمَلَكِ الَّذِيْ أَخَذَهَا وَ بِحَقِّ النَّبِيِّ الَّذِيْ قَبَضَهَا وَ بِحَقِّ الْوَصِيِّ الَّذِيْ حَلَّ فِيْهَا صَلِّ عَلٰى مُحَمَّدٍ وَ أَهْلِ بَيْتِهٖ وَ اجْعَلْ فِيْهَا شِفَآءً مِنْ كُلِّ دَآءٍ وَ أَمَاناً مِنْ كُلِّ خَوْفٍ \n ", " ALLAAHUMMA INNEE AS-ALOKA BE-HAQQE HAAZEHIT TEENATE WA BE-HAQQIL MALAKIL LAZEE AKHAZAHAA WA BE-HAQQIN NABIYYIL LAZEE QABAZAHAA WA BE-HAQQIL WASIYYIL LAZEE HALLA FEEHAA SALLE A’LAA MOHAMMADIN WA AHLE BAYTEHI WAJ-A’L FEEHAA SHEFAAA-AN MIN KULLE DAAA-IN WA AMAANAN MIN KULLE KHAWFIN. ", " O Allah I bind Thee by thee by this clay and of that angel who had picked up this clay and of the Prophet through whom this clay was sent and of that vicegerent who lies buried under this clay and ask Thee to shower Thy blessing on Mohammad (s.a.w.a.) and Ahle Bait (a.s.) and make this clay a cure for all my diseases and a guardian against all fears. " );
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData2() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ إِنِّي أَسْأَلُكَ بِحَقِّ الْمَلَكِ الَّذِي قَبَضَهَا وَ أَسْأَلُكَ بِحَقِّ النَّبِيِّ الَّذِيْ خَزَنَهَا وَ أَسْأَلُكَ بِحَقِّ الْوَصِيِّ الَّذِيْ حَلَّ فِيْهَا أَنْ تُصَلِّيَ عَلٰى مُحَمَّدٍ وَ آلِ مُحَمَّدٍ وَ أَنْ تَجْعَلَهَا لِيْ شِفَاءً مِنْ كُلِّ دَاءٍ وَ أَمَاناً مِنْ كُلِّ خَوْفٍ وَ حِفْظاً مِنْ كُلِّ سُوْ ءٍ \n ", "ALLAAHUMMA INNEE AS-ALOKA BE-HAQQIL MALAKIL LAZEE QABAZAHAA WA AS-ALOKA BE-HAQQIN NABIYYIL LAZEE KHAZANAHAA WA AS-ALOKA BE-HAQQIL WASIYYIL LAZEE HALLA FEEHAA AN TOSALLEYA A’LAA MOHAMMADIN WA AALE MOHAMMADIN WA AN TAJ-A’LAHAA LEE SHEFAAA-AN MIN KULLE DAAA-IN WA AMAANAN MIN KULLE KHAWFIN WA HIFZAN MIN KULLE SOOO-IN.  " , "O Allah I bind Thee by that angel who had lifted a handful clay; by the prophet who had preserved it in the bottle, by the vice-regent who lies buried under it and pray Thee to shower thy blessing on Mohammed and Aale Mohammad and make this pure clay a cure for all diseases, a shield against all fears, and a safeguard against all curses. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData3() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ إِنِّي أَسْأَلُكَ بِحَقِّ الْمَلَكِ الَّذِي قَبَضَهَا وَ أَسْأَلُكَ بِحَقِّ النَّبِيِّ الَّذِيْ خَزَنَهَا وَ أَسْأَلُكَ بِحَقِّ الْوَصِيِّ الَّذِيْ حَلَّ فِيْهَا أَنْ تُصَلِّيَ عَلٰى مُحَمَّدٍ وَ آلِ مُحَمَّدٍ وَ أَنْ تَجْعَلَهَا لِيْ شِفَاءً مِنْ كُلِّ دَاءٍ وَ أَمَاناً مِنْ كُلِّ خَوْفٍ وَ حِفْظاً مِنْ كُلِّ سُوْ ءٍ \n ", " ALLAAHUMMA INNEE AS-ALOKA BE-HAQQIL MALAKIL LAZEE QABAZAHAA WA AS-ALOKA BE-HAQQIN NABIYYIL LAZEE KHAZANAHAA WA AS-ALOKA BE-HAQQIL WASIYYIL LAZEE HALLA FEEHAA AN TOSALLEYA A’LAA MOHAMMADIN WA AALE MOHAMMADIN WA AN TAJ-A’LAHAA LEE SHEFAAA-AN MIN KULLE DAAA-IN WA AMAANAN MIN KULLE KHAWFIN WA HIFZAN MIN KULLE SOOO-IN. ", " O Allah I bind Thee by that angel who had lifted a handful clay; by the prophet who had preserved it in the bottle, by the vice-regent who lies buried under it and pray Thee to shower thy blessing on Mohammed and Aale Mohammad and make this pure clay a cure for all diseases, a shield against all fears, and a safeguard against all curses. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData4() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَلسَّلاَمُ عَلَيْنَا مِنْ رَبِّنَا ", " ASSALAAMO A’LAYNAA MIN RABBENAA. ", " May there be peace on us from our God. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        dailyDuaSubListModel = new DailyDuaSubListModel(" اِنَّ فِىْ خَلْقِ السَّمَاوَاتِ وَالْاَرْضِ وَاخْتِلاَفِ الَّيْلِ وَالنَّهَارِ لَاٰيَاتٍ لّاُِولِى الْاَلْبَابِ.الَّذِيْنَ يَذْكُرُوْنَ اللهَ قِيَامًا وَّ قُعُوْدًا وَّ عَلٰي جُنُوْبِهِمْ وَ يَتَفَكَّرُوْنَ فِى خَلْقِ السَّمَاوَاتِ وَالْاَرْضِ، رَبَّنَا مَا خَلَقْتَ هٰذَا بَاطِلاً، سُبْحَانَكَ فَقِنَا عَذَابَ النَّارِ.رَبَّنَآ اِنَّكَ مَنْ تُدْخِلِ النَّارَ فَقَدْ اَخْزَيْتَهٗ، وَمَا لِلظَّالِمِيْنَ مِنْ اَنْصَارٍ.رَبَّنَآ اِنَّنَا سَمِعْنَا مُنَادٍيًا يُّنَادِىْ لِلْاِيْمَانِ اَنْ اٰمِنُوْا بِرَبِّكُمْ فَاٰمَنَّا، رَبَّنَا فَاغْفِرْ لَنَا ذُنُوْبَنَا وَ كَفِّرْعَنَّا سَيِّاٰتِنَا وَ تَوَفَّنَا مَعَ الْاَبْرَارِ.رَبَّنَا وَ اٰتِنَا مَا وَعَدْتَّنَا عَلٰي رُسُلِكَ وَلاَ تُخْزِنَا يَوْمَ الْقِيَامَةِ، اِنَّكَ لاَ تُخْلِفُ الْمِيْعَادَ. \n ", " INNA FEE KHALQIS SAMAAWAATE WAL-ARZE WAKH-TELAAFIL LAYLE WAN-NAHAARE LA-AAYAATIL LE-OOLIL ALBAAB. ALLAZEENA YAZKOROONAL LAAHA QEYAAMAWN WA QO-O’ODAWN WA A’LAA ZONOOBEHIM WA YATAFAKKAROONA FEE KHALQIS SAMAAWAATE WAL ARZE, RABBANAA MAA KHALAQTA HAAZAA BAATELAA, SUBHAANAKA FAQENAA A’ZAABAN NAAR. RABBANAA INNAKA MAN TUDKHELIN NAARA FAQAD AKHZAYTAHU, WA MAA LIZ-ZAALEMEENA MIN ANSAAR. RABBANAA INNANAA SAME’NAA MONAADEYAYN YONAADEE LIL-EEMAANE AN AAMENOO BERABBEKUM FA-AAMANNAA, RABBANAA FAGH-FIR LANAA ZONOOBANAA WA KAFFIR A’NNAA SAYYE-AATENAA WA TAWAFFANAA MA-A’L ABRAAR. RABBANAA AATENAA MAA WA-A’DTANAA A’LAA ROSOLEKA WA LAA TUKHZENAA YAWMAL QEYAAMATE, INNAKA LAA TUKHLEFUL ME-A’AD.\n ", " Verily in the creation of the heavens and the earth and the alteration of the night and the day, there are signs for men who possess wisdom. Those who remember Allah standing, and sitting and reclining on their sided and think (Seriously) in the creation of the heaven and the earth saying ‘O Our Lord! Thou hast not created (all) this in vain! Glory be to Thee! Save us then from the torment of the (Hell) fire.’ O Our Lord! Whomsoever Thou causeth to enter the (Hell) fire surely thou hast put him to disgrace; there is not, for the unjust, any of the helpers. O Our Lord! We Have indeed heard the voice of a Crier (Messenger) calling (us) unto faith, saying, “Believe ye in your Lord!” Therefore “Forgive us then our sins and remove away from us our evil deeds and cause us to die with the virtuous ones”. O Our Lord! And give us what Thou didst promise us through Thy prophet, and disgrace us not on the Day of Resurrection; Verily, Thou breakest not Thy Promise”. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData5() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللَّهِ حَسْبِيَ اللَّهُ تَوَكَّلْتُ عَلَى اللَّهِ اَللّٰهُمَّ إِنِّي أَسْأَلُكَ خَيْرَ أُمُوْرِيْ كُلِّهَا وَ أَعُوْذُ بِكَ مِنْ خِزْيِ الدُّنْيَا وَ عَذَابِ الْآخِرَةِ . \n ", "BISMIL LAAHE HASBEYAL LAAHO TAWAKKALTO A’LAL LAAHE ALLAAHUMMA INNEE AS-ALOKA KHAYRA OMOORI KULLEHAA WA A-O’OZO BEKA MIN KHIZYID DUNYAA WA A’ZAABIL AAKHERAH.  ", " I begin with the name of Allah. Allah is enough for me and him only I rely. O Allah I pray Thee for the welfare of all ray affairs and seek Thy shelter from the evils in this world and the torments of the Day of Judgement. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData6() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ سِمْنِي بِسِيْمَاءِ الْإِيمَانِ وَ اخْتِمْ لِي بِالْخَيْرِ وَ اجْعَلْ عَاقِبَتِيْ إِلٰى خَيْرٍ وَ إِنَّكَ أَنْتَ الْعَزِيْزُ الْكَرِيْمُ. \n ", " ALLAAHUMMA SIMNEE BE-SEEMA-IL EEMAANE WAKH-TIIM LEE BIL-KHAYRE WAJ-A’L A’AQEBATEE ELAA KHAYRIN INNAKA ANTAL A’ZEEZUL KAREEM.\n ", "O Allah let the sign of faith be the cause of my recognition! Let my end be worthwhile and let there be good for me even in the world to come. It is well known that Thou art All Mighty, All-Wise and All Generous!  ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData7() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" سُبْحَانَ رَبِّكَ رَبِّ الْعِزَّةِ عَمَّا يَصِفُوْنَ. وَ سَلَامٌ عَلَى الْمُرْسَلِيْنَ. وَالْحَمْدُ لِلّٰهِ رَبِّ الْعَالَمِيْنَ. \n ", " SUBHAANA RABBEKA RABBIL I’ZZATE A’MMAA YASEFOON. WA SALAAMUN A’LAL MURSALEENA. WAL HAMDO LILLAAHE RABBIL A’ALAMEEN.\n ", "Hallowed is thy Lord, the Lord of Majesty, far above from that which they ascribe (unto Him) And peace be upon the prophet. And all praise is God’s the Lord of the worlds.  ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData8() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" لَا اِلٰهَ اِلاَّ اللهُ وَ اللهُ اَكْبَرُ \n ", " LAA ELAAHA ILLAL LAAHO WAL LAAHO AKBAR.\n ", " There is no Creator except Allah and He is Almighty. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData9() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("اِعْتَصَمْتُ بِكَ يَا رَبِّ مِنْ شَرِّ مَا أَجِدُ فِي نَفْسِيْ فَاعْصِمْنِيْ مِنْ ذٰلِكَ\u200F \n  ", " I-A’TASAMTO BEKA YAA RABBE MIN SHARRE MAA AJEDO FEE NAFSEE FA-A’SIMNEE MIN ZAALEKA.\n ", " O my Creator! I seek Thy shelter from the mischief of the danger that is linking in my heart, protect me from it. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData10() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ احْفَظْنِي وَ احْفَظْ مَا مَعِيَ وَ سَلِّمْنِي وَ سَلِّمْ مَا مَعِيَ وَ بَلِّغْنِيْ وَ بَلِّغْ مَا مَعِيَ بِبَلَاغِكَ الْحَسَنِ الْجَمِيْلِ\u200F \n ", " ALLAAHUMMAH FAZNEEE WAH-FAZ MAA MA-E’YA WA SALLIMNEE MAA SALLIM MAA MA-E’YA WA BALLIGHNEE WA BALLIGH MA MA-E’YA BE-BALAAGHEKAL HASANIL JAMEELE. ", " O Allah! Keep me and all the things with me safe and sound and let them reach the destination safely. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData11() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. بِاللَّهِ بِاللَّهِ بِاللَّهِ أَسْأَلُكَ يَا مَلِكَ الْمُلُوكِ الْأَوَّلَ الْقَدِيمَ الْأَبَدِيَّ الَّذِي لَا يَزُولُ وَ لَا يَحُولُ أَنْتَ اللَّهُ الْعَظِيمُ الْكَـافِي كُلَّ شَيْ\u200Fءٍ الْمُحِيْطُ بِكُـلِّ شَيْ\u200Fءٍ اَللّٰهُمَّ اكْفِنِيْ بِاسْمِكَ الْأَعْظَمِ الْأَجَلِّ الْوَاحِدِ الْأَحَدِ الصَّمَدِ الَّذِيْ لَمْ يَلِدْ وَ لَمْ يُولَدْ وَ لَمْ يَكُنْ لَهٗ كُفُواً أَحَدٌ احْجُبْ عَنِّي شُرُوْرَهُمْ وَ شُرُوْرَ الْأَعْدَاءِ كُلِّهِمْ وَ سُيُوْفِهِمْ وَ بَأْسَهُمْ وَ اللَّهُ مِنْ وَرَائِهِمْ مُحِيْطٌ اَللّٰهُمَّ احْجُبْ عَنِّي شَرَّ مَنْ أَرَادَنِيْ بِسُوءٍ بِحِجَابِكَ الَّذِي احْتَجَبْتَ بِهٖ فَلَمْ يَنْظُرْ إِلَيْهِ أَحَدٌ مِنْ شَرِّ فَسَقَةِ الْجِنِّ وَ الْإِنْسِ وَ مِنْ شَرِّ سِلَاحِهِمْ وَ مِنَ الْحَدِيْدِ وَ مِنْ شَرِّ كُلِّ مَا نَتَخَوَّفُ وَ نَحْذَرُ وَ مِنْ شَرِّ كُلِّ شِدَّةٍ وَ بَلِيَّةٍ وَ مِنْ شَرِّ مَا أَنْتَ بِهٖ أَعْلَمُ وَ عَلَيْهِ أَقْدَرُ إِنَّكَ عَلٰى\u200F كُلِّ شَيْ\u200Fءٍ قَدِيْرٌ وَ صَلَّى اللَّهُ عَلٰى مُحَمَّدٍ نَبِيِّهٖ وَ آلِهٖ وَ سَلَّمَ تَسْلِيْماً كَثِيْرًا. \n ", " BISMIL LAAHIR RAHMAANIR RAHEEM. BILLAAHE BILLAAHE BILLAAHE AS-ALOKA YAA MALEKAL MOLOOKIL AWWALAL QADEEMAL ABADIYYIL LAZEE LAA YAZOOLO WA LAA YAHOOLO ANTAL LAAHUL A’ZEEMUL KAAFEE KULLA SHAY-IL MOHEETO BE-KULLE SHAY-IN ALLAAHUMMAK FENEE BIS-MEKAL A-A’ZAMIL AJALLIL WAAHEDIL AHADIS SAMADIL LAZE LAM YALID WA LAM YOOLAD WA LAM YAKUN LAHU KOFOWAN AHADUN OHJOB A’NNEE SHOROORAHUM WA SHOROORAL A-A’DAA-E KULLEHIM WA SOYOOFEHIM WA BAASAHUM WALLAAHO MIN WARAA-EHIM MOHEETUN ALLAAHUMMAH JUB A'NNEE SHARRA MAN ARAADANEE BE-SOOO-IN BE-HEJAABEKAL LAZIH TAJABTA BEHI FALAM YANZUR ELAYHE AHADUN MIN SHARRE FASAQATIL JINNE WAL-INSE WA MIN SHARRE SALAAHEHIM WA MENAL HADEEDE WA MIN SHARRE KULLE MAA NATAKHAWWAFO WA NAHZARO WA MIN SHARRE KULLE SHIDDATIN WA BALIYYATIN WA MIN SHARRE MAA ANTA BEHI A-A'LAMO WA A'LAYHE AQDARO INNAKA A'LAA KULLE SHAY-IN QADEERUN WA SALLAL LAAHO A'LAA MOHAMMADIN NABIYYEHI WA AALEHI WA SALLAMA TASLEEMAN KASEERAN.\n ", " In the name of Allah the Beneficent the Merciful. By Allah! By Allah! By Allah! O the First and Eternal King of Kings! O He whose personality exists from times eternal and for whom there is no change or times eternal and for whom there is no change or deterioration (fall). I beg of Thee Who is the Almighty God, enough for everything and Who holds everything under His sway: O Allah on behalf of Thy Great name, Uniqueness and needlessness from Whom no one is born and Who is born of no one and Who does not have a single partner, look after me and protect me from the mischief of men, my enemies and their swords and put a stop to all types of torture. When God has surrounded them from all sides then where links the danger. O Allah do protect me from the danger who intend harming me, cover me with avail as is Thy sacred veil which does not let the mischief of bad and mad people come near Thee or be hurt by the swords, the iron and all those which ordinarily people are afraid of and keep away from and all the difficulties and mischief of all these things which are well known to Thee or be hurt by the swords, the iron and all those which ordinarily people are afraid and keep away from, and all the difficulties and the mischief of all those things which are well known to thee and on whom thou hast complete authority. No doubt Thy power encompasses everything. Shower Thy blessing on Thy prophet and his dear and near ones and a greeting which they have the right of. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData12() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ إِنِّيْ أَسْتَوْدِعُكَ نَفْسِيْ وَ أَهْلِيْ وَ مَالِيْ وَ دِيْنِيْ وَ دُنْيَايَ وَ آخِرَتِيْ وَ أَمَانَتِيْ وَ خَوَاتِيْمَ عَمَلِيْ\u200F \n ", " ALLAAHUMMA INNEE ASTAW-DE-O’KA NAFSEE WA AHLEE WA MAALEE WA DEENEE WA DUNYAAYA WA AAKHERATEE WA AMAANATEE WA KHAWAATEEMA A’MALEE. ", "O Allah! I leave unto Thy care my life, my wife and children, my merchandise, my generation, my world here and hereafter, deposits under my custody and place my end of life Thy hands.  ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData13() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" يَا صَالِحُ اَغِثْنِيْ ", " YAA SAALEHO AGHISNEE ", " O Saleh! Render help unto me! ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        dailyDuaSubListModel = new DailyDuaSubListModel(" يَا صَالِحُ يَا اَبَا صَالِحٍ أَرْشِدُوْنَا إِلَى الطَّرِيْقِ رَحِمَكُمُ اللهُ ", " YAA SAALEHO YAA ABAA SAALEHIN ARSHEDOONA ELAT TAREEQE RAHEMAKOMUL LAAHO.\n ", " O Saleh and Abaa Saleh may God show His mercy on you show us the right way. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData14() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" رَبِّ اَدْخِلْنِىْ مُدْخَلَ صِدْقٍ وَّ اَخْرِجْنِىْ مُخْرَجَ صِدْقٍ وَّ اجْعَلْ لِّىْ مِنْ لَّدُنْكَ سُلْطَانًا نَصِيْرًا. ", " RABBE ADKHILNEE MUDKHALA SIDQIWN WA AKHRIJNEE MUKHRAJA SIDQIWN WAJ-A’L LEE MIL LADUNKA SULTAANAN NASEERAA.\n ", " “O My Lord! Cause me to enter a goodly entrance and cause me to go out (of) a goodly exit, and grant me from unto Thee an authority to assist (me)” ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData15() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ أَنْزِلْنِيْ مُنْزَلًا مُبَارَكًا وَ أَنْتَ خَيْرُ الْمُنْزِلِيْنَ. ", "ALLAAHUMMA ANZILNEE MUNZALAN MOBAARAKAN WA ANTA KHAYRUL MUNZELEEN.\n  ", " O Allah make my arrival over here rewarding, for Thou art the best host and care-taker. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData16() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" لَا تَخَافُ دَرَكاً وَ لَا تَخْشٰى\u200F ", " LAA TAKHAAFO DARAKAN WA LAA TAKHSHAA. ", "Not fearing to be overtaken, nor being afraid  ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData17() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللهُ الَّذِىْ نَزَّلَ الْكِتَابَ، وَ هُوَ يَتَوَلَّى الصَّالِحِيْنَ.\n" +
                "وَ مَا قَدَرُوْا اللهَ حَقَّ قَدْرِهٖ، وَ الْاَرْضُ جَمِيْعًا قَبْضَتُهٗ يَوْمَ الْقِيَامَةِ وَ السَّمٰوَاتُ مَطْوِيَّاتٌۢ بِيَمِيْنِهٖ، سُبْحَانَهٗ وَ تَعَالٰى عَمَّا يُشْرِكُوْنَ. \n ", " ALLAAHUL LAZE NAZZALAL KETAABA, WA HOWA YATAWALLAS SAALEHEEN.\n" +
                "WA MAA QADARUL LAAHA HAQQA QADREHI, WAL-ARZO JAMEE-A’N QABZATOHU YAWMAL QEYAAMATE WAS-SAMAAWAATO MATWIYYAATUM BE-YAMEENEHI, SUBHAANAHU WA TA-A’ALAA A’MMAA YUSHREKOON. ", " He is Allah who sent down the book (Quran) and He guardeth the virtuous one.\n" +
                "They have esteemed not Allah, as is His due: While the whole earth shall be in His grip on the day of Judgement and heavens rolled up (shall be) in the right hand: Hallowed is He and Exalted is He, high above what they associate (with Him). ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData18() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اِنَّ وَلِىِّىَ اللهُ الَّذِىْ نَزَّلَ الْكِتَابَ، وَ هُوَ يَتَوَلَّى الصَّالِحِيْنَ.\n" +
                "وَ مَا قَدَرُوْا اللهَ حَقَّ قَدْرِهٖ، وَ الْاَرْضُ جَمِيْعًا قَبْضَتُهٗ يَوْمَ الْقِيَامَةِ وَ السَّمٰوَاتُ مَطْوِيَّاتٌۢ بِيَمِيْنِهٖ، سُبْحَانَهٗ وَ تَعَالٰى عَمَّا يُشْرِكُوْنَ. \n ", " INNA WALIYYEYAL LAAHUL LAZEE NAZZALAL KETAABA, WA HOWA YATAWALLAS SAALEHEEN.\n" +
                "WA MAA QADARUL LAAHA HAQQA QADREHI, WAL-ARZO JAMEE-A’N QABZATOHU YAWMAL QEYAAMATE WAS-SAMAAWAATO MATWIYYAATUM BE-YAMEENEHI, SUBHAANAHU WA TA-A’ALAA A’MMAA YUSHREKOON. ", " Verily my protector is God who sent down the Book (Qur’an) and He gradeth the virtuous once.\n" +
                "They have esteemed not God, as is His due: while the whole earth shall Be in His grip on the Day of judgement and heavens rolled up (shall be) in His right hand, Hallowed is He, and Exalted is He, high above what they associate (with Him) ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData19() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَسْتَغْفَرُوْ ا اللهَ الَّذِيْ لَا اَلٰهَ اِلاَّ هُوَ الْحَيُّ الْقَيُّوْمُ ذُوْ الْجَلَالِ وَ الْاِكْرَامِ وَ اَتُوْبُ اِلَيْهِ. ", " ASTAGHFERUL LAAHAL LAZEE LAA ELAAHA ILLAA HOWAL HAYYUL QAYYOOMO ZUL JALAALE WAL IKRAAME WA ATOOBO ELAYHE.\n ", " I seek forgiveness of Allah Who, there is no deity other than He, the Ever-Living the Self-Subsistent the Glorious and the Gracious. I turn unto Him (repentant) ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData20() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. لَا اِلٰهَ اِلاَّ اللهُ الْجَلِيْلُ الْجَبَّارُ لَا اِلٰهَ اِلاَّ اللهُ الْعَزِيْزُ الْغَفَّارُ لَا اِلٰهَ اِلاَّ اللهُ الْوَاحِدُ الْقَهَّارُ لَا اِلٰهَ اِلاَّ اللهُ وَحْدَهٗ لَا شَرِيْكَ لَهٗ اِلٰهًا وَّاحِدًا وَّ نَحْنُ لَهٗ مُسْلِمُوْنَ لَا اِلٰهَ اِلاَّ اللهُ وَحْدَهٗ لاَ شَرِيْكَ لَهٗ اِلٰهًا وَّاحِدًا وَ نَحْنُ لَهٗ مُخْلِصُوْنَ لَا اِلٰهَ اِلَّا اللهُ وَحْدَهٗ لاَ شَرِيْكَ لَهٗ اِلٰهًا وَّاحِدًا وَّ نَحْنُ لَهٗ عَابِدُوْنَ لاَ اِلٰهَ اِلاَّ اللهُ مُحَمَّدٌ رَّسُوْلُ اللهِ عَلِیٌّ وَلِیُّ اللهِ وَ صَلَّی اللهُ عَلٰی خَيْرِ خَلْقِهٖ وَ مَظْهَرِ لُطْفِهٖ مُحَمَّدٍ وَّ اٰلِهٖ اَجْمَعِيْنَ الطَّيِّبِيْنَ الطَّاهِرِيْنَ بِرَحْمَتِكَ يَا اَرْحَمَ الرَّاحِمِيْنَ حَسْبُنَا اللهُ وَ نِعْمَ الْوَكِيْلُ نِعْمَ الْمَوْلٰی وَ نِعْمَ النَّصِيْرُ. \n ", " BISMIL LAAHIR RAHMAANIR RAHEEM. LAA ELAAHA ILLAL LAAHUL JALEELUL JABBAARO LAA ELAAHA ILLAL LAAHUL A’ZEEZUL GHAFFAARO LAA ELAAHA ILLAL LAAHUL WAAHEDUL QAHHAARO LAA ELAAHA ILLAL LAAHO WAHDAHU LAA SHAREEKA LAHU ELAAHAN WAAHEDAN WA NAHNO LAHU MUSLEMOONA LAA ELAAHA ILLAL LAAHO WAHDAHU LAA SHAREEKA LAHU ELAAHAN WAAHEDAN WA NAHNO LAHU MUKHLESOONA LAA ELAAHA ILLAL LAAHO WAHDAHU LAA SHAREEKA LAHU ELAAHAN WAAHEDAN WA NAHNO LAHU A’ABEDOONA LAA ELAAHA ILLAL LAAHO MOHAMMADUR RASOOLUL LAAHE A’LIYYUN WALIYYUL LAAHE WA SALLAL LAAHO A’LAA KHAYRE KHALQEHEE WA MAZHARE LUTFEHEE MOHAMMADIN WA AALEHEE AJMA-E’ENAT TAYYEBEENAT TAAHEREENA BERAHMATEKA YAA ARHAMAR RAAHEMEEN HASBONAL LAAHO WA NE’MAL WAKEELO NE’MAL MAWLAA WA NE’MAN NASEER. ", " In the name of Allah the Beneficent the Merciful There is no deity but Allah the One the All Dominant: There is no deity but Allah the Ever Prevalent the All Forgiving: There is no deity but Allah, He has no associate: Allah the One and we submit to Him. There has no associate, Allah the One and we are (Exclusively) loyal to Him. There is no deity but Allah, He is One, He has no associate. Allah the One and Him (alone) do we worship. There is no deity but Allah. Mohammed is the Messenger of Allah. ‘Ali is the friend of Allah: Allah’s blessing be on the best of His creation, the manifestation of His Benignity Mohammad and his (pure) progeny, all of them the pure the purified by thy Mercy. O the Most Merciful, Sufficient is for us Allah, and (He is) the most Excellent Protector, the Most Excellent Lord and the Most Excellent helper. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData21() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. لاَ اِلٰـهَ اِلاَّ اللهُ الْعَظِيْمُ الْحَلِيْمُ لاَ اِلٰـهَ اِلاَّ اللهُ رَبُّ الْعَرْشِ الْكَرِيْمُ الْحَمْدُ لِلّٰهِ رَبِّ الْعَالَمِيْنَ اَللّٰهُمَّ اِنِّيْ أَسْأَلُكَ مُوْجِبَاتِ رَحْمَتِكَ وَ عَزَآئِمَ مَغْفِرَتِكَ وَ الْغَنِيْمَةَ مِنْ كُلِّ بِرٍّ وَ السَّلاَمَةَ مِنْ كُلِّ اِثْمٍ اَللّٰهُمَّ لاَ تَدَعْ لِيْ ذَنْباً اِلاَّ غَفَرْتَهٗ وَ لاَ هَمّاً اِلاَّ فَرَّجْتَهٗ وَ لاَ سُقْمًا اِلاَّ شَفَيْتَهٗ وَ لاَ عَيْباً اِلاَّ سَتَرْتَهٗ وَ لاَ رِزْقاً اِلاَّ بَسَطْتَهٗ وَ لاَ خَوْفاً اِلاَّ اٰمَنْتَهٗ وَ لاَ سُوْءاً اِلاَّ صَرَفْتَهٗ وَ لاَ حَاجَةً هِيَ لَكَ رِضاً وَ لِيَ فِيْهَا صَلاَحٌ اِلاَّ قَضَيْتَهَا يَا اَرْحَمَ الرَّاحِمِيْنَ اٰمِيْنَ رَبَّ الْعَالَمِيْنَ.  ", " BISMIL LAAHIR RAHMAANIR RAHEEM. LAA ELAAHA ILLAL LAAHUL A’ZEEMUL HALEEMO LAA ELAAHA ILLAL LAAHO RABBUL A’RSHIL KAREEMO AL-HAMDO LILLAAHE RABBIL A’ALAMEENA ALLAAHUMMA INNEE AS-ALOKA MOOJEBAATE RAHMATEKA WA A’ZAA-EME MAGHFERATEKA WAL GHANEEMATA MIN KULLE BIRRIN WAS-SALAAMATA MIN KULLE ISMIN ALLAAHUMMA LAA TADA’ LEE ZAMBAN ILLAA GHAFARTAHU WA LAA HAMMAN ILLAA FARRAJTAHU WA LAA SUQMAN ILLAA SHAFAYTAHU WA LAA A’YBAN ILLAA SATARTAHU WA LAA RIZQAN ILLAA BASAT-TAHU WA LAA KHAWFAN ILLAA AAMANTAHU WA LAA SOOO-AN ILLAA SARAFTAHU WA LAA HAAJATAN HEYA LAKA REZAN WA LEYA FEEHAA SALAAHUN ILLAA QAZAYTAHAA YAA ARHAMAR RAAHEMEENA AAMEENA RABBAL A’ALAMEENA. ", " In the name of Allah the Beneficent the Merciful There is no god but Allah, the Great the clement; there is no god but Allah the Lord of (the throne) of Grace: and all praise is for Allah, the Lord of the worlds; O Allah I beseech thee for all that time which is the cause of Thy Mercy, and that which ascertain Thy Forgiveness: and the benefit of every virtue and safety from every sin: O ‘Allah leave not any sin on me but that You forgive it, and any affliction but that You remove it. and any illness but that You heal it and any defect but You increase it and any fear but that You protect (me) from it; and any evil but that You repel it, and any of my need in which is Thy pleasure and which is beneficial for me, but that You grant it; O the Most Merciful, grant me my supplication O the Lord of the Worlds ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData22() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" \n" +
                "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. سُبْحَانَ اللَّهِ وَ الْحَمْدُ لِلَّهِ وَ لَا إِلٰهَ إِلَّا اللَّهُ وَ اللَّهُ أَكْبَرُ وَ لَا حَوْلَ وَ لَا قُوَّةَ إِلَّا بِاللَّهِ الْعَلِيِّ الْعَظِيْمِ سُبْحَانَ اللَّهِ بِالْغُدُوِّ وَ الْآصَالِ سُبْحَانَ اللَّهِ بِالْعَشِيِّ وَ الْإِبْكـَارِ فَسُبْحانَ اللَّهِ حِينَ تُمْسُوْنَ وَ حِيْنَ تُصْبِحُونَ وَ لَهُ الْحَمْدُ فِي السَّمٰوَاتِ وَ الْأَرْضِ وَ عَشِيًّا وَ حِيْنَ تُظْهِرُوْنَ سُبْحَانَ رَبِّكَ رَبِّ الْعِزَّةِ عَمَّا يَصِفُوْنَ وَ سَلَامٌ عَلَى الْمُرْسَلِيْنَ وَ الْحَمْدُ لِلَّهِ رَبِّ الْعالَمِينَ سُبْحَانَ ذِي الْمُلْكِ وَ الْمَلَكُوْتِ سُبْحَانَ ذِي الْعِزِّ وَ الْجَبَرُوْتِ سُبْحَانَ الْحَيِّ الَّذِيْ لَا يَمُوْتُ سُبْحَانَ الْقَائِـمِ الدَّائِـمِ سُبْحَانَ اللَّهِ الْحَيِّ الْقَيُّوْمِ سُبْحَانَ الْعَلِيِّ الْأَعْلَى سُبْحَانَهٗ وَ تَعَالٰى سُبُّوْحٌ قُدُّوْسٌ رَبُّ الْمَلَآئِكَةِ وَ الرُّوْحِ اَللّٰهُمَّ إِنَّ ذَنْبِيْ أَمْسٰى مُسْتَجِيْراً بِعَفْوِكَ وَ خَوْفِي أَمْسٰى مُسْتَجِيْراً بِأَمْنِكَ وَ فَقْرِيْ أَمْسٰى مُسْتَجِيْراً بِغِنَاكَ وَ ذُلِّيْ أَمْسٰى مُسْتَجِيْراً بِعِزِّكَ اَللّٰهُمَّ صَلِّ عَلٰى مُحَمَّدٍ وَ آلِ مُحَمَّدٍ وَ اغْفِرْ لِي وَ ارْحَمْنِيْ إِنَّكَ حَمِيْدٌ مَجِيْدٌ اَللّٰهُمَّ تَمَّ نُوْرُكَ فَهَدَيْتَ فَلَكَ الْحَمْدُ وَ عَظُمَ حِلْمُكَ فَعَفَوْتَ فَلَكَ الْحَمْدُ وَجْهُكَ رَبَّنَا أَكْرَمُ الْوُجُوْهِ وَ جَاهُكَ أَعْظَمُ الْجَاهِ وَ عَطِيَّتُكَ أَفْضَلُ الْعَطَاءِ تُطَاعُ رَبُّنَا وَ تَشْكُرُ وَ تُعْصٰى فَتَغْفِرُ وَ تُجِيْبُ الْمُضْطَرَّ وَ تَكْشِفُ الضُّرَّ وَ تُنَجِّيْ مِنَ الْكَرْبِ وَ تُغْنِي الْفَقِيْرَ وَ تَشْفِي السَّقِيْمَ وَ لَا يُجَازِيْ آلَائَكَ أَحَدٌ وَ أَنْتَ أَرْحَمُ الرَّاحِمِيْنَ. ", " BISMIL LAAHIR RAHMAANIR RAHEEM. SUBHAANAL LAAHE WAL HAMDO LILLAAHE WA LAA ELAAHA ILLAL LAAHO WAL LAAHO AKBARO WA LAA HAWLA WA LAA QUWWATA ILLAA BILLAAHIL A’LIYYIL A’ZEEME SUBHAANAL LAAHE BIL-GHODUWWE WAL AAASAALE SUBHAANAL LAAHE BIL-A’SHIYYE WAL-IBKAARE FA-SUBHAANAL LAAHE HEENA TUMSOONA WA HEENA TUSBEHOONA WA LAHUL HAMDO FIS SAMAAWAATE WAL ARZE WA A’SHIYYAN WA HEENA TUZHEROONA SUBHAANA RABBEKA RABBIL I'ZZATE A'MMAA YASEFOONA WA SALAAMUN A'LAL MURSALEENA WAL-HAMDO LILLAAHE RABBIL A'ALAMEENA SUBHAANA ZIL MULKE WAL MALAKOOTE SUBHAANA ZIL I'ZZE WAL JABAROOTE SUBHAANAL HAYYIL LAZEE LAA YAMOOTO SUBHAANAL QAA-EMID DAA-EME SUBHAANAL LAAHIL HAYYIL QAYYOOM SUBHAANAL A'LIYYIL A-A'LAA SUBHAANAHU WA TA-A'ALAA SUBBOOHUN QUDDOOSUN RABBUL MALAAA-EKATE WAR-ROOHE ALLAAHUMMA INNA ZAMBEE AMSAA MUSTAJEERAN BE-A'FWEKA WA KHAWFEE AMSAA MUSTAJEERAN BE-AMNEKA WA FAQREE AMSAA MUSTAJEERAN BE-GHENAAKA WA ZULLI AMSAA MUSTAJEERAN BE-I'ZZEKA ALLAAHUMMA SALLE A'LAA MOHAMMADIN WA AALE MOHAMMADIN WAGH-FIR LEE WAR-HAMNEE INNAKA HAMEEDUM MAJEED. ALLAAHUMMA TAMMA NOOROKA FA-HADAYTA FALAKAL HAMDO WA A'ZOMA HILMOKA FA-A'FAWTA FALAKAL HAMDO WAJHOKA RABBANAA AKRAMUL WOJOOHE WA JAAHOKA A-A'ZAMO HILMOKA FA-A'FAWTA FALAKAL HAMDO WAJ-HOKA RABBANAA AKRAMUL WOJOOHE WA JAAHOKA A-A'ZAMUL JAAHE WA A'TIYYATOKA AFZALUL A'TAA-E TO-TAA-O' RABBONAA WA TASHKORO WA TO'SAA FA-TAGHFERO WA TOJEEBUL MUZ-TARRA WA TAKSHEFUZ ZURRA WA TUNAJJEE MENAL KARBE WA TUGHNIL FAQEERA WA TASHFIS SAQEEMA WA LAA YOJAAZEE AAALAA-AKA AHADUN WA ANTA ARHAMUR RAAHEMEEN. ", " In the name of Allah the most Beneficent and Merciful. Glory be to Allah: all praise is due to Allah: there is no deity other than Allah: Allah is the Supreme. There is no power and no strength except with Allah, the Most Great. Glory be to Allah at the Dusk and the dawns. Glory be to Allah when ye enter evening and when ye enter the morning and all praise is due to Him in the heavens and the earth at the sun’s decline and when ye enter the noon. Hallowed is Thy Lord, ‘the Lord of majesty for above from what they ascribe (unto Him); Glory be to the Master of Kingdoms; Glory be to the Master of Majesty and Might: Glory be to the Ever-Living who does not die: Glory be to the Self Subsisting the eternal; Glory be to the Most High; Glory Holy is our Lord, and the Lord of the Angles and the spirit. O Allah! this evening I seek thy protection and pardon of my sin: this evening I seek Thy Protection and shelter from my fears this evening I seek Thy protection and Opulence for my destitution: this evening I seek Thy protection and Grace from my disgrace: O Allah send Thy blessing on Mohammad (s.a.w.a.) and the (purified) progeny of Mohammad (s.a.w.a.) and forgive me and have mercy on me. Indeed Thou art praise worthy, the Most Glorious. O Allah! Thy Light is perfected and thou hast guided so all praise to Thee. O Our Lord. Thy Face is the Most Gracious of all the faces. Thy Eminence is the Greatest of all Thy gift is the Most Excellent gift; O Our Lord (if) Thou art obeyed Thou accept: if Thou art disobeyed Thou for giveth: Thou answer to (the call of) the distressed: Thou dispelleth the grief: Thou relieveth from the affliction:Thou enricheth the poor: Thou cureth the sick: and none can repay Thy bounties O the Most Merciful. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData23() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. اَللّٰهُمَّ اِنِّیْ اَسْاَلُكَ مُوجِبَاتِ رَحْمَتِكَ وَ عَزَائِمَ مَغْفِرَتِكَ وَ النَّجَاةَ مِنَ النَّارِ وَ مِنْ کُلِّ بَلِيَّةٍ وَ الْفَوْزَ بِالْجَنَّةِ وَ الرِّضْوَانَ فِیْ دَارِ السَّلاَمِ وَ جِوَارِ نَبِّيِّكَ مُحَمَّدٍ عَلَيْهِ وَآلِهِ السَّلاَمُ اَللّٰهُمَّ مَا بِنَا مِنْ نِعْمَةٍ فَمِنْكَ لآَ اِلٰهَ اِلاَّ اَنْتَ اَسْتَغْفِرُكَ وَ اَتُوْبُ اِلَيْكَ. ", " BISMIL LAAHIR RAHMAANIR RAHEEM. ALLAAHUMMA INNEE AS-ALOKA MOOJEBAATE RAHMATEKA WA A’ZAAEMA MAGHFERATEKA WAN NAJAATA MENAN NAARE WA MIN KULLE BALIYYATIN WAL FAWZA BIL JANNATE WAR RIZWAANA FEE DAARIS SALAAME WA JEWAARE NABIYYEKA MOHAMMADIN A’LAYHE WA AALEHIS SALAAMO ALLAAHUMMA MAA BENAA MIN NEA’MATIN FAMINKA LAA ELAAHA ILLAA ANTA ASTAGHFEROKA WA ATOOBO ELAYKA. ", " In the name of Allah the most Beneficent, the Merciful. O Allah I beseech Thee for the causes of Thy Mercy the right of Thy pardon: safety from every sin; the benefit from every virtue; salvation from (Hell) Fire and every Calamity; achievement of the Paradise and (Thy) Pleasure in the abode of peace; and the proximity of thy prophet Mohammed and his purified progeny peace be on all of them. O Allah! Whatever bounties we have all are from Thee there is no deity except Thee; I beseech Thy forgiveness and turn unto thee. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData24() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" \n" +
                "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. أَعُوْذُ بِعِزَّةِ اللَّهِ وَ أَعُوْذُ بِقُدْرَةِ اللَّهِ وَ أَعُوْذُ بِمَغْفِرَةِ اللَّهِ وَ أَعُوْذُ بِرَحْمَةِ اللَّهِ وَ أَعُوْذُ بِسُلْطَانِ اللَّهِ الَّذِيْ هُوَ عَلٰى كُلِّ شَيْ\u200Fءٍ قَدِيْرٌ وَ أَعُوْذُ بِكَرَمِ اللَّهِ وَ أَعُوْذُ بِجَمْعِ اللَّهِ مِنْ شَرِّ كُلِّ جَبَّارٍ عَنِيْدٍ وَ شَيْطَانٍ مَرِيْدٍ وَ كُلِّ مُغْتَالٍ وَ سَارِقٍ وَ عَارِضٍ وَ مِنْ شَرِّ السَّامَّةِ وَ الْهَامَّةِ وَ الْعَامَّةِ وَ مِنْ شَرِّ كُلِّ دَابَّةٍ صَغِيرَةٍ أَوْ كَبِيرَةٍ بِلَيْلٍ أَوْ نَهَارٍ وَ مِنْ شَرِّ فُسَّاقِ الْعَرَبِ وَ الْعَجَمِ وَ فُجَّارِهِمْ وَ مِنْ شَرِّ فَسَقَةِ الْجِنِّ وَ الْإِنْسِ وَ مِنْ شَرِّ كُـلِّ دَابَّةٍ اَنْتَ آخِذٌ بِناصِيَتِها إِنَّ رَبِّي عَلى\u200F صِراطٍ مُسْتَقِيمٍ\u200F ", " BISMIL LAAHIR RAHMAANIR RAHEEM. A-O'OZO BE-I'ZZATIL LAAHE WA A-O'OZO BE-QUDRATIL LAAHE WA A-O'ZO BE-MAGHFERATIL LAAHE WA A-O'ZO BE-RAHMATIL LAAHE WA A-O'OZO BE-SULTAANIL LAAHIL LAZEE HOWA A'LAA KULLE SHAY-IN QADEER WA A-O'OZO BE-KARAMIL LAAHE WA A-O'OZO BE-JAM-I'L LAAHE MIN SHARRE KULLE JABBAARIN A'NEEDIN WA SHAYTAANIN MAREEDIN WA KULLE MUGHTAALIN WA SAAREQIN WA A'AREZIN WA MIN SHARRIS SAAM-MATE WAL-HAAM-MATE WAL-A'AMMATE WA MIN SHARRE KULLE DAAB-BATIN SAGHEERATIN AW KABEERATIN BE-LAYLIN AW NAHAARIN WA MIN SHARRE FUSSAAQIL A'ARABE WAL A'JAME WA FUJJAAREHIM WA MIN SHARRE FASAQATIL JINNNE WAL-INSE WA MIN SHARRE KULLE DAABBATIN ANTA AAKHEZUN BE-NAASEYATEHAA INNA RABBEE A'LAA SERAATIM MUSTAQEEM. ", " In the name of Allah the Beneficent, the Merciful I seek protection with the Honour of Allah; I seek protection with the Might of Allah; I seek Protection with the forgiveness of Allah I seek protection with the mercy of Allah I Seek Protection with the Authority of Allah who is All Powerful over everything. I seek protection with the Grace of Allah and I Seek protection with All-Prevalent Allah from the evil of every insolent tyrant and the despised Devil. Every Killer, thief and every one approaching (to harm); and from the evil of poisonous (animals). Vermin’s and those causing injury; and from the evil of every animal, small or big, by night and by day; and from the evil of the transgressor of Arabs and non-Arabs; and of loose-conduct from among them; and from the evil of the transgressors from among the genii and men: and from the evil of every animal Thou takes by its fore-lock; indeed my Lord is on the right path. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData25() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. يَا اَللهُ يَا اَللهُ يَا اَللهُ اَلْاَمَانُ اَلْاَمَانُ اَلْاَمَانُ مِنْ زَوَالِ الْاِيْمَانِ يَا دَآئِمَ الْمَعْرُوْفِ يَا قَدِيْمَ الْاِحْسَانِ وَ يَا هَادِيَ الْمُضِلِّيْنَ اِيَّاكَ نَعْبُدُ وَ اِيَّاكَ نَسْتَعِيْنُ وَ صَلَّي اللهُ عَلٰي خَيْرِ خَلْقِهٖ مُحَمَّدٍ وَآلِهٖ اَجْمَعِيْنَ. ", " BISMIL LAAHIR RAHMAANIR RAHEEM. YAA ALLAAHO YAA ALLAAHO YAA ALLAAHO AL-AMAANO AL-AMAANO AL-AMAANO MIN ZAWAALIL EEMAANE YAA DAAA-EMAL MA’ROOFE YAA QADEEMAL EHSAAN YAA HAADEYAL MOZILLEENA IYYAAKA NA’BODO WA IYYAAKA NASTA-E’EN WA SALLAL LAAHO A’LAA KHAYRE KHALQEHI MOHAMMADIN WA AALEHI AJMA-E’EN. ", "In the name of Allah the Beneficent the Merciful O Allah! O Allah! O Allah! The Security, the Security the Security from the vanishment of the faith. O the Eternally Known! O the Eternally Obliging and O the Guide of those gone astray, Thee alone do we worship and of Thee (only) do we seek help. May Allah’s blessings be upon His best creation Mohammed and all his (pure) progeny.  ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData26() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" رَبَّنَا هَبْ لَنَا مِنْ اَزْوَاجِنَا وَ ذُرِّيَّاتِنَا قُرَّةَ اَعْيُنٍ وَّ اجْعَلْنَا لِلْمُتَّقِيْنَ اِمَامًا. ", " RABBANAA HAB LANAA MIN AZWAAJENAA WA ZURRIYYAATENAA QURRATA A-A’YONIWN WAJ-A’LNAA LIL-MUTTAQEENA EMAAMAA.\n ", " O our Lord! Grant us from our wives and our offsprings, the joy of our eyes, and make us for the pious ones ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData27() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَلْحَمْدُ لِلَّهِ عَلٰى كُلِّ نِعْمَةٍ كَانَتْ أَوْ هِيَ كَائِنَةٌ ", " ALHAMDDO LILLAAHE A’LAA KULLE NE’MATIN KAANAT AWHEYA KAA-ENATUN. ", " All praise is due to Allah for every past bounty and every nature (bounty). ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData28() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" \n" +
                "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. سُبْحَانَ اللهِ کُلَّمَا سَبَّحَ اللهَ شَیْءٌ وَ كَمَا يُحِبُّ اللهُ اَنْ يُّسَبَّحَ وَ كَمَا هُوَ اَهْلُهٗ وَ كَمَا يَنْبَغِیْ لِكـَرَمِ وَجْهِهٖ وَ عِزِّ جَلاَلِهٖ وَ الْحَمْدُ لِلّٰهِ کُلَّمَا حَمِدَ اللهَ شَیْءٌ وَ كَمَا يُحِبُّ اللهُ اَنْ يُحْمَدَ وَ كَمَا هُوَ اَهْلُهٗ وَ كَمَا يَنْبَغِیْ لِكَرَمِ وَجْهِهٖ وَ عِزِّ جَلاَلِهٖ وَ لاَ اِلٰهَ اِلاَّ اللهُ کُلَّمَا هَلَّلَ اللهَ شَیْءٌ وَ كَمَا يُحِبُّ اللهُ اَنْ يُهَلَّلَ وَ كَمَا هُوَ اَهْلُهٗ وَ كَمَا يَنْبَغِیْ لِكَرَمِ وَجْهِهٖ وَ عِزِّ جَلاَلِهٖ وَ اللهُ اَکْبَرُ کُلَّمَا كَبَّرَ اللهَ شَیْءٌ وَ كَمَا يُحِبُّ اللهُ اَنْ يُكَبَّرَ وَ كَمَا هُوَ اَهْلُهٗ وَ كَمَا يَنْبَغِیْ لِكَرَمِ وَجْهِ وَ عِزِّ جَلاَلِهٖ سُبْحَانَ اللهِ وَ الْحَمْدُ لِلّٰهِ وَ لاَ اِلٰهَ اِلاَّ اللهُ وَ اللهُ اَکْبَرُ عَلٰی کُلِّ نِعْمَةٍ اَنْعَمَ بِهَا عَلَیَّ وَ عَلٰی کُلِّ اَحَدٍ مِنْ خَلْقِهٖ مِمَّنْ كَانَ اَوْ يَکُوْنُ اِلٰی يَوْمِ الْقِيٰمَةِ اَللّٰهُمَّ اِنِّیْ اَسْئَلُكَ اَنْ تُصَلِّىَ عَلٰی مُحَمَّدٍ وَّ اٰلِ مُحَمَّدٍ وَ اَسْئَلُكَ مِنْ خَيْرِ مَا اَرْجُوْ وَ خَيْرِ مَا لاَ اَرْجُوْ وَ اَعُوْذُ بِكَ مِنْ شَرِّ مَا اَحْذَرُ وَ مِنْ شَرِّ مَا لاَ اَحْذَرُ. ", " BISMIL LAAHIR RAHMAANIR RAHEEM. SUBHAANAL LAAHE KULLAMAA SABBAHAL LAAHA SHAY-UN WA KAMAA YOHIBBUL LAAHO AYN YOSABBAHA WA KAMAA HOWA AHLAHU WA KAMAA YANBAGHEE LEKARAME WAJHEHI WA I’ZZE JALAALEHI WAL HAMDO LILLAAHE KULLAMAA HAMEDAL LAAHA SHAY-UN WA KAMAA YOHIBBUL LAAHO AYN YOHMADA WA KAMAA HOWA AHLOHU WA KAMAA YAMBAGHEE LEKARAME WAJHEHI WA I’ZZE JALAALEHI WA LAA ELAAHA ILLAL LAAHO KULLAMAA HALLAL LAAHA SHAY-UN WA KAMAA YOHIBBUL LAAHO AYN YOHALLALA WA KAMAA HOWA AHLOHU WA KAMAA YAMBAGHEE LEKARAME WAJHEHEE WA I’ZZE JALAALEHI WAL LAAHO AKBARO KULLAMAA KABBARAL LAAHA SHAY-UN WA KAMAA YOHIBBUL LAAHO AYN YOKABBARA WA KAMAA HOWA AHLOHU WA KAMAA YAMBAGHEE LEKARAME WAJHE WA I’ZZE JALAALEHI SUBHAANAL LAAHE WAL HAMDO LILLAAHE WA LAA ELAAHA ILLAL LAAHO WAL LAAHO AKBARO A’LAA KULLE NE’MATIN ANA’MA BEHAA A’LAYYA WA A’LAA KULLE AHADIM MIN KHALQEHI MIMMAN KAANA AW YAKOONO ELAA YAWMIL QEYAAMATE ALLAAHUMMA INNEE AS-ALOKA AN TOSALLEYA A’LAA MOHAMMADIN WA AALE MOHAMMADIN WA AS-ALOKA MIN KHAYRE MAA ARJOO WA KHAYRE MAA LAA ARJOO WA A-O’OZO BEKA MIN SHARRE MAA AHZARO WA MIN SHARRE MAA LAA AHZARO. ", " In the name of Allah the Most Beneficent and Merciful Glory be to Allah! like everything that glorifies Allah; and in way Allah loves to be glorified and as He deserved it so; and as it beloved Him due to His distinct Munificence and His Excellent Glory. There is no god but Allah! like everything that praises Allah, and He desees it so and as it beloves Him due to His distinct Munificence and His Excellent Glory, There is no god but Allah! like everything that proclaims Allah’s Absolute Unity, and in the way of Allah loves to be proclaimed Absolute One, and as He deserves it so and as it beloves Him due to His distinct Munificence and Excellent Glory. Allah is the Greatest! like everything that declares Allah’s Greatness, and in the way Allah loves to be declared Great and as He deserves it so, and as it beloves Him due to His distinct Munificence and Excellent Glory. Glory be to Allah. All praise is due to Allah, there is no god but Allah, is the Greatest, (I repeatedly recite this) to the extent of the bounties He has bestowed on me and everyone of His creations those who have been and those who are to be till Day of Judgement. O Allah! I beseech Thee to shower thy blessing on Mohammed and (pure) progeny of Mohammed And (O Allah!) I beseech Thee to grant me the good I hope for and (the good), for which I have not hoped for and (due to my ignorance); and I beseech Thy protection from the evil I (wish) to keep away from, and (the evil) I have not taken care of (due to my ignorance) ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData29() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" هُوَ اللهُ الَّذِىْ لَآ اِلٰهَ اِلاَّ هُوَ، عَالِمُ الْغَيْبِ وَالشَّهَادَةِ هُوَ الرَّحْمٰنُ الرَّحِيْمُ. هُوَ اللهُ الَّذِىْ لَآ اِلٰهَ اِلاَّ هُوَ، الْمَلِكُ الْقُدُّوْسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيْزُ الْجَبَّارُ الْمُتَكَبِّرُ، سُبْحَانَ اللهِ عَمَّا يُشْرِكُوْنَ . هُوَ اللهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُ لَهُ الْاَسْمَآءُ الْحُسْنٰى، يُسَبِّحُ لَهٗ مَا فِى السَّمَاوَاتِ وَالْاَرْضِ، وَ هُوَ الْعَزِيْزُ الْحَكِيْمُ. ", " HOWAL LAAHUL LAZEE LAAA ELAAHA ILLAA HOWA, A’ALEMUL GHAYBE WASH-SHAHAADATE HOWAR RAHMAANUR RAHEEM. HOWAL LAAHUL LAZEE LAA ELAAHA ILLAA HOWAL MALEKUL QUDDOOSUS SALAAMUL MOAMENUL MOHAYMENUL A’ZEEZUL JABBAARUL MOTAKABBERO, SUBHAANAL LAAHE A’MMAA YUSHREKOON. HOWAL LAAHUL KHAALEQUL BARE-UL MOSAWWESO LAHUL ASMAAA-UL HUSNAA, YOSABBEHO LAHU MAA FIS-SAMAAWAATE WAL-ARZ, WA HOWAL A’ZEEZUL HAKEEM ", " \n" +
                "He is Allah There is no god. Save He: The Knower of the unseen and the seen He is the Beneficent The Most Merciful. He is Allah There is no god Save He: the king the Holy, the peace loving (the Bestower of) conviction. The Guardian (over all) the Ever-Prevalent. The Supreme, the Great Absolute! Hallowed is Allah from what they associate (with Him). He is Allah the Creator, the Maker, The Fashioner. His are all the Excellent names: Halloweth Him whatsoever is in the heavens the earth: and He is the Ever Prevalent the All-Wise. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData30() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اِلٰهِيْ بِاَخَصِّ صِفَاتِكَ وَ بِعِزِّ جَلَالِكَ وَ بِاَعْظَمِ اَسْمَآئِكَ وَ بِعِصْمَةِ اَنْبِيَآئِكَ وَ بِنُوْرِ اَوْلِيَآئِكَ وَ بِدَمِ شُهْدَآئِكَ وَ بِمِدَادِ عُلَمَآئِكَ وَ بِدُعَآءِ صُلَحَآئِكَ وَ بِمُنَاجَاتِ فُقَرَآئِكَ نَسْئَلُكَ زِيَادَةً فِيْ الْعِلْمِ وَصِحَّةً فِيْ الْجِسْمِ وَ طُوْلاً فِيْ الْعُمْرِ فِيْ طَاعَتِكَ وَ سِعَةً فِيْ الرِّزْقِ وَ تَوْبَةً قَبْلَ الْمَوْتِ وَ رَاحَةً عِنْدَ الْمَوْتِ وَ مَغْفِرَةً بَعْدَ الْمَوْتِ وَ نُوْرًا فِيْ الْقَبْرِ وَ نَجَاةً مِّنَ النَّارِ وَ دُخْوْلًا فِيْ الْجَنَّةِ وَ عَافِيَةً مِنْ كُلِّ بَلَآءِ الدُّنْيَا وَعَذَابِ الْآخِرَةِ بِحَقِّ مُحَمَّدٍ وَ اَهْلِ بَيْتِهِ الطَّيِّبِيْنَ الطَّاهِرِيْنَ. \n ", " ELAAHEE BE-AKHASSE SEFAATEKA WA BE-I’ZZE JALAALEKA WA BE-A-A’ZAME ASMAAA-EKA WA BE-I’SMATE AMBEYAAA-EKA WA BE-NOORE AWLEYAAA-EKA WA BEDAME SHOHADAAA-EKA WA BE-MEDAADE O’LAMAAA-EKA WA BE-DO-A’AA-E SOLAHAAA-EKA WA BE-MONAAJAATE FOQARAAA-EKA NAS-ALOKA ZEYAADATAN FIL I’LME WA SEHHATAN FIL JISME WA TOOLAN FIL O’MRE FEE TAA-A’TEKA WA SE-A’TAN FIR-RIZQE WA TAWBATAN QABLAL MAWTE WA RAAHATAN I’NDAL MAWTE WA MAGHFERATN BA’DAL MAWTE WA NOORAN FIL-QABRE WA NAJAATAM MENAN NAARE WA DOKHOOLAN FIL JANNATE WA A’AFEYATAN MIN KULLE BALAAA-ID DUNYAA WA A’ZAABIL AAKHERATE BE-HAQQE MOHAMMADIN WA AHLE BAYTEHIT TAYYEBEENAT TAAHEREEN. ", " O Allah! By the most particular attributes. By thy powerful glory. By thy Great names, by infallibility of thy prophets, by the light of thy friends, by the blood of thy Martyrs, by the ink of Thy learned personalities, by the supplications of Thy pious persons. And by the invocation of Thy need persons we beseech Thee for the increase in knowledge, health of the body, increase in the life tenure, for Thy obedience, abundance in the sustenance, repentance before death, ease at the time of death, forgiveness after death, the light in the grave, redemption from the hell fire, admission in the paradise and rescue from all calamities of the world and punishment of the next world by the grace of Mohammad and his best, pure and infallible progeny ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData31() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اِنَّ فِىْ خَلْقِ السَّمَاوَاتِ وَالْاَرْضِ وَاخْتِلاَفِ الَّيْلِ وَالنَّهَارِ لَاٰيَاتٍ لّاُِولِى الْاَلْبَابِ. الَّذِيْنَ يَذْكُرُوْنَ اللهَ قِيَامًا وَّ قُعُوْدًا وَّ عَلٰي جُنُوْبِهِمْ وَ يَتَفَكَّرُوْنَ فِى خَلْقِ السَّمَاوَاتِ وَالْاَرْضِ، رَبَّنَا مَا خَلَقْتَ هٰذَا بَاطِلاً، سُبْحَانَكَ فَقِنَا عَذَابَ النَّارِ. رَبَّنَآ اِنَّكَ مَنْ تُدْخِلِ النَّارَ فَقَدْ اَخْزَيْتَهٗ، وَمَا لِلظَّالِمِيْنَ مِنْ اَنْصَارٍ. رَبَّنَآ اِنَّنَا سَمِعْنَا مُنَادٍيًا يُّنَادِىْ لِلْاِيْمَانِ اَنْ اٰمِنُوْا بِرَبِّكُمْ فَاٰمَنَّا، رَبَّنَا فَاغْفِرْ لَنَا ذُنُوْبَنَا وَ كَفِّرْعَنَّا سَيِّاٰتِنَا وَ تَوَفَّنَا مَعَ الْاَبْرَارِ. رَبَّنَا وَ اٰتِنَا مَا وَعَدْتَّنَا عَلٰي رُسُلِكَ وَلاَ تُخْزِنَا يَوْمَ الْقِيَامَةِ، اِنَّكَ لاَ تُخْلِفُ الْمِيْعَادَ. ", " INNA FEE KHALQIS SAMAAWAATE WAL-ARZE WAKHTELAAFIL LAYLE WAN-NAHAARE LA-AAYAATIL LE-OOLIL ALBAAB. ALLAZEENA YAZKOROONAL LAAHA QEYAAMAWN WA QO-O’ODAWN WA A’LAA JONOOBEHIM WA YATAFAKKAROONA FEE KHALQIS SAMAAWAATE WAL-ARZE, RABBANAA MAA KHALAQTA HAAZAA BAATELAA, SUBHAANAKA FAQENAA A’ZAABAN NAAR. RABBANAA INNAKA MAN TUDKHELIN NAARA FAQAD AKHZAYTAHU, WA MAA LIZ-ZAALEMEENA MIN ANSAAR. RABBANAA INNANAA SAME’NAA MONAADEYAYN YONAADEE LIL-EEMAANE AN AAMENOO BE-RABBEKUM FA-AAMANNNAA, RABBANAA FAGH-FIR LANAA ZONOOBANAA WA KAFFIR A’NNAA SAYYE-AATENAA WA TAWAFFANAA MA-A’L ABRAAR. RABBANAA WA AATENAA MAA WA-A’DTANAA A’LAA ROSOLEKA WA LAA TUKHZENAA YAWMAL QEYAAMATE, INNAKA LAA TUKHLEFUL ME-A’AD. ", " Verily, in the creations of the heavens and the earth and the alternation of the night and day, there are signs for men who possess wisdom. Those who remember Allah standing and sitting and reclining on their sides and think (seriously) in die creation of the heaven and the earth: saying O Our Lord! Thou hast not created (all) this in vain! Glory be to Thee! Save us then from the torment of the (Hell) fire. O Our Lord! Whomsoever Thou causeth to enter the (Hell) fire, surely Thou hast put him to disgrace: there is not, for the unjust, any of the helpers, O Our Lord! We have indeed heard the voice of a crier (Prophet), calling (us) unto faith, saying Believe ye in your Lord! And we did believe. Our Lord! Therefore Forgive us then our sins and remove away from us our evil deeds, and cause us to die with die virtuous ones. O Our Lord! And give us what Thou didst promise us through Thy messengers, and disgrace us not on the Day of Resurrection: Verily, Thou breakest not Thy Promise ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData32() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" رَبَّنَا مَا خَلَقْتَ هٰذَا بَاطِلاً، سُبْحَانَكَ فَقِنَا عَذَابَ النَّارِ. رَبَّنَآ اِنَّكَ مَنْ تُدْخِلِ النَّارَ فَقَدْ اَخْزَيْتَهٗ، وَمَا لِلظَّالِمِيْنَ مِنْ اَنْصَارٍ. رَبَّنَآ اِنَّنَا سَمِعْنَا مُنَادٍيًا يُّنَادِىْ لِلْاِيْمَانِ اَنْ اٰمِنُوْا بِرَبِّكُمْ فَاٰمَنَّا، رَبَّنَا فَاغْفِرْ لَنَا ذُنُوْبَنَا وَ كَفِّرْعَنَّا سَيِّاٰتِنَا وَ تَوَفَّنَا مَعَ الْاَبْرَارِ. رَبَّنَا وَ اٰتِنَا مَا وَعَدْتَّنَا عَلٰي رُسُلِكَ وَلاَ تُخْزِنَا يَوْمَ الْقِيَامَةِ، اِنَّكَ لاَ تُخْلِفُ الْمِيْعَادَ. ", " RABBANAA MAA KHALAQTA HAAZAA BAATELAA, SUBHAANAKA FAQENAA A’ZAABAN NAAR. RABBANAA INNAKA MAN TUDKHELIN NAARA FAQAD AKHZAYTAHU, WA MAA LIZ-ZAALEMEENA MIN ANSAAR. RABBANAA INNANAA SAME’NAA MONAADEYAYN YONAADEE LIL-EEMAANE AN AAMENOO BE-RABBEKUM FA-AAMANNNAA, RABBANAA FAGH-FIR LANAA ZONOOBANAA WA KAFFIR A’NNAA SAYYE-AATENAA WA TAWAFFANAA MA-A’L ABRAAR. RABBANAA WA AATENAA MAA WA-A’DTANAA A’LAA ROSOLEKA WA LAA TUKHZENAA YAWMAL QEYAAMATE, INNAKA LAA TUKHLEFUL ME-A’AD.\n ", " O Lord! Thou hast not created (all) this in vain! Glory be to Thee! Save us then from the torment of the (Hell) fire. O Lord! Whomsoever Thou Causeth to enter the (Hell) fire. Surely Thou hast put him to disgrace: there is not. For the unjust any of the helpers. O Lord! We have indeed heard the voice of a crier (Messenger), calling (us) unto faith. Saying “Believe ye in your Lord!” And we did believe. O Lord! Therefore “Forgive us then our sins and remove away from us our evil deeds, and cause us to die with the virtuous ones.” O Our Lord! And give us what Thou didst promise us through thy messengers, and disgrace us not on the Day of Resurrection: Verily, Thou breakfast not Thy promise. O Our Lord! And give us what Thou didst promise us through thy messengers. And disgrace us not on the Day of Resurrection: Verily, Thou breakfast not Thy promise. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData33() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("رَبِّ إِنِّي ظَلَمْتُ نَفْسِيْ فَاغْفِرْ لِيْ اِنَّهٗ لَا يَغْفِرُ الذُّنُوْبَ اِلاَّ اَنْتَ.  ", " RABBE INNEE ZALAMTO NAFSEE FAGHFIR LEE INNAHU LAA YAGHFERUZ ZONOOBA ILLAA ANTA.\n ", " O My Lord! Verily I have been unjust to myself So forgive me (for it) Indeed none pardons the sins except Thee. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData34() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" فَسُبْحَانَ اللهِ حِيْنَ تُمْسُوْنَ وَ حِيْنَ تُصْبِحُوْنَ. وَ لَهُ الْحَمْدُ فِى السَّمَاوَاتِ وَ الْاَرْضِ وَ عَشِيًّا وَّ حِيْنَ تُظْهِرُوْنَ. ", " FA-SUBHAANAL LAAHE HEENA TUMSOONA WA HEENA TUSBEHOONA. WA ALHUL HAMDO FIS-SAMAAWAATE WAL ARZE WA A’SHIYYAWN WA HEENA TUZHEROON. ", " So Glory be to Allah when you enter evening and when you enter the morning, and for Him (alone) is all the praise in the heavens and the earth. At the sun’s decline and when you enter the noon. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData35() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَشْهَدُ اَنْ لاَ اِلٰهَ اِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهٗ اِلٰهًا وَاحِدًا اَحَدًا صَمَدًا لَمْ يَتَّخِذْ صَاحِبَةً وَ لاَ وَلَدًا. ", " ASH-HADO AN LAA ELAAHA ILLAL LAAHO WAHDAHU LAA SHAREEKA LAHU ELAAHAN WAAHEDAN AHADAN SAMADAN LAM YATTAKHIZ SAAHEBATAN WA LAA WALADAN. ", " I bear witness that there is no deity but Allah He is alone and without any partner. He is (the only) Deity Single, Peerless and Independent. He neither took a wife nor begot any child. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData36() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" أَسْأَلُ اللَّهَ الْجَنَّةَ وَ أَعُوذُ بِاللَّهِ مِنَ النَّارِ. ", " AS-ALUL LAAHAL JANNATA WA A-O’OZO BILLAAHE MENAN NAAR. ", " I beseech Allah (to grant me) Paradise and I seek protection of Allah from the (Hell) Fire: at this the Hell Says: O Allah grant him/her Protection. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData37() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" يَا عُدَّتِي عِنْدَ شِدَّتِي وَ يَا غَوْثِي عِنْدَ كُرْبَتِي اُحْرُسْنِي بِعَيْنِكَ الَّتِيْ لَا تَنَامُ وَ اكْنُفْنِي بِرُكْنِكَ الَّذِي لَا يُرَامُ يَا ذَا الْقُوَّةِ الْقَوِيَّةِ وَ يَا ذَا الْمِحَالِ الشَّدِيْدِ وَ يَا ذَا الْعِزَّةِ الَّتِيْ كُلُّ خَلْقِكَ لَهَا ذَلِيلٌ صَلِّ عَلٰي مُحَمَّدٍ وَ آلِ مُحَمَّدٍ وَ اكْفِنِيْ ظَالِمِيْ وَ انْتَقِمْ لِي مِنْهُ \n ", " YAA O’DDATEE I’NDA SHIDDATEE WA YAA GHAUSEE I’NDA KURBATEE OHRUSNEE BE-A’YNEKAL LATEE LAA TANAAMO WAKFENEE BE-RUKNEKAL LAZE LAA YORAAMO YAA ZAL QUWWATIL QAWIYYATE WA YAA ZAL MEHAALISH SHADEEDE WA YAA ZAL I’ZZATIL LATEE KULLO KHALQEKA LAHAA ZALEELUN SALE A’LAA MOHAMMADIN WA AALE MOHAMMADIN WAKFENEE ZAALEMEE WANTAQIM LEE MINHO. ", " O my Rescuer in my difficulties: O my Helper in my afflictions: Guard me with the eye that sleepeth not, and suffice me with the pillar of Might which cannot be reached: O the Master of great artifice. And O the Purchaser of the honour before whom all Thy creation is low and humble: Send the blessings on Mohammad and (holy) progeny of Mohammad. Help me against the oppressor and take my revenge from him. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData38() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" \n" +
                "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. الٓمّٓ. ذٰلِكَ الْكِتَابُ لاَ رَيْبَ، فِيْهِ، هُدًى لِّلْمُتَّقِيْنَ. الَّذِيْنَ يُؤْمِنُوْنَ بِالْغَيْبِ وَ يُقِيْمُوْنَ الصَّلوٰةَ وَ مِمَّا رَزَقْنَاهُمْ يُنْفِقُوْنَ. وَالَّذِيْنَ يُؤْمِنُوْنَ بِمَآ اُنْزِلَ اِلَيْكَ وَمَآ اُنْزِلَ مِنْ قَبْلِكَ، وَ بِالْاٰخِرَةِ هُمْ يُوْقِنُوْنَ. اَللهُ لَآاِلٰهَ اِلاَّ هُوَ، اَلْحَىُّ الْقَيُّوْمُ، لاَ تَاْخُذُهٗ سِنَةٌ وَّلاَ نُوْمٌ، لَهٗ مَا فِى السَّمَاوَاتِ وَمَا فِى الْاَرْضِ، مَنْ ذَا الَّذِىْ يَشْفَعُ عِنْدَهٗٓ اِلاَّ بِاِذْنِهٖ، يَعْلَمُ مَا بَيْنَ اَيْدِيْهِمْ وَمَا خَلْفَهُمْ، وَلاَ يُحِيْطُوْنَ بِشَىْءٍ مِّنْ عِلْمِهٖٓ اِلاَّ بِمَا شَآءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْاَرْضَ، وَلاَ يَئُوْدُهٗ حِفْظُهُمَا، وَهُوَ الْعَلِىُّ الْعَظِيْمُ. لَآ اِكْرَاهَ فِى الدِّيْنَ، قَدْ تّبَيَّنَ الرُّشْدُ مِنَ الْغَىِّ، فَمَنْ يَّكْفُرْ بِالطَّاغُوْتِ وَيُؤْمِنْۢ بِاللهِ فَقَدِ اسْتَمْسَكَ بِالْعُرْوَةِ الْوُثْقٰى، لَانْفِصَامَ لَهَا، وَاللهُ سَمِيْعٌ عَلِيْمٌ. اَللهُ وَلِىُّ الَّذِيْنَ اٰمَنُوْا، يُخْرِجُهُمْ مِّنَ الظُّلُمَاتِ اِلَى النُّوْرِ، وَ الَّذِيْنَ كَفَرُوْآ اَوْلِيَآئُهُمُ الطَّاغُوْتُ، يُخْرِجُوْنَهُمْ مِّنَ النُّوْرِ اِلَى الظُّلُمَاتِ، اُولٰۤئِكَ اَصْحَابُ النَّارِ، هُمْ فِيْهَا خَالِدُوْنَ. لِلّٰهِ مَا فِى السَّمَاوَاتِ وَمَا فِى الْاَرْضِ، وَ اِنْ تُبْدُوْا مَا فِىْٓ اَنْفُسِكُمْ اَوْ تُخْفُوْهُ يُحَاسِبْكُمْ بِهِ اللهُ، فَيَغْفِرُ لِمَنْ يَّشَآءُ وَ يُعَذِّبُ مَنْ يَّشَآءُ، وَاللهُ عَلٰي كُلِّ شَىْ ءٍ قَدِيْرٌ . اٰمَنَ الرَّسُوْلُ بِمَآ اُنْزِلَ اِلَيْهِ مِنْ رَّبِّهٖ وَالْمُؤْمِنُوْنَ، كُلٌّ اٰمَنَ بِاللهِ وَ مَلَآئِكَتِهٖ وَ كُتُبِهٖ وَ رُسُلِهٖ، لاَ نُفَرِّقُ بَيْنَ اَحَدٍ مِّنْ رُّسُلِهٖ، وَقَالُوْا سَمِعْنَا وَ اَطَعْنَا، غُفْرَانَكَ رَبَّنَا وَ اِلَيْكَ الْمَصِيْرُ . لاَ يُكَلِّفُ اللهُ نَفْسًا اِلاَّ وُسْعَهَا، لَهَا مَا كَسَبَتْ وَ عَلَيْهَا مَا اكْتَسَبَتْ، رَبَّنَا لاَ تُوٴَاخِذْنَآ اِنْ نَّسِيْنَآ اَوْ اَخْطَاْنَا، رَبَّنَا وَلاَ تَحْمِلْ عَلَيْنَآ اِصْرًا كَمَا حَمَلْتَهٗ عَلَى الَّذِيْنَ مِنْ قَبْلِنَا، رَبَّنَا وَلاَ تُحَمِّلْنَا مَا لاَ طَاقَةَ لَنَا بِهٖ، وَاعْفُ عَنَّا، وَاغْفِرْلَنَا، وَارْحَمْنَا، اَنْتَ مَوْلَانَا فَانْصُرْنَا عَلَى الْقَوْمِ الْكَافِرِيْنَ. ", " BISMIL LAAHIR RAHMAANIR RAHEEM. ALEEF-LAAM-MEEM. ZAALEKAL KETAABO LAA RAYBA FEEHE, HODAL LIL-MUTTAQEENAL. LAZEENA YOAMENOONA BIL-GHAYBE WA YOQEEMOONAS SALAATA WA MIMMAA RAZAQNAAHUM YUNFEQOON. WAL-LAZEENA YOAMENOONA BEMAA UNZELA ELAYKA WA MAA UNZELA MIN QABLEKA, WA BIL-AAKHERATE HUM YOOQENOON. ALLAAHO LAA ELAAHA ILLAA HOWAL HAYYUL QAYYUMO LAA TAAKHOZOHU SENATUN WA LAA NAWM LAHU MAA FIS SAMAAWAATE WA MAA FIL ARZE MAN ZAL LAZEE YASHFAO’ I’NDAHU ILLAA BE-IZNEHI YA’LAMO MAA BAYNA AYDEEHIM WA MAA KHALFAHUM WA LAA YOHEETOONA BE-SHAY-IM MIN I’LMEHI ILLAA BEMAA SHAAA-A WASEA’ KURSIYYOHUS SAMAAWAATE WAL ARZ WA LAA YAOODOHU HIFZOHOMAA WA HOWAL A’LIYYUL A’ZEEMO LAA IKRAAHA FID-DEENE QAT-TABAYYANAR RUSHDO MENAL GHAYYE FAMAYN YAKFUR BIT-TAAGHOOTE WA YOAMIM BILLAAHE FAQADIS TAMSAKA BIL-U’RWATIL WUSQAA LAN FESAAMA LAHAA WAL LAAHO SAMEEU’N A’LIM. ALLAAHO WALIYYUL LAZEENA AAAMANOO YUKHREJOHUM MENAZ ZOLOMAATE ELAN NOORE WAL LAZEENA KAFAROO AWLEYAAA-O-HOMUT TAAGHOOTO YUKHREJOONAHUM MENAN NOORE ELAZ-ZOLOMAATE OOLAAAEKA ASHAABUN NAARE HUM FEEHAA KHAALEDOON. LILLAAHE MAA FIS-SAMAAWAATE WA MAA FIL-ARZ, WA IN TUBDOO MAA FEE ANFOSEKUM AW TUKHFOOHO YOHAASIBKUM BEHIL LAAHO, FAYAGHFERO LEMAYN YASHAAA-O WA YO-A’ZZEBO MAYN YASHAAA-O, WAL-LAAHO A’LAA KULLE SHAY-IN QADEER. AAMANAR RASOOLO BEMAA UNZELA ELAYHE MIR RABBEHI WAL-MOAMENOON, KULLUN AAMANA BILLAAHE WA MALAAA-EKATEHI WA KOTOBEHI WA ROSOLEHI, LAA NOFARREQO BAYNA AHADIM MIR ROSOLEH, WA QAALOO SAME’NAA WA A-TA’NAA, GHUFRAANAKA RABBANAA WA ELAYKAL MASEER. LAA YOKALLEFUL LAAHO NAFSAN ILLAA WUS-A'HAA, LAHAA MAA KASABAT WA A'LAYHAA MAK-TASABAT, RABBANAA LAA TO-AAKHIZNAA IN NASEENAA AW AKHTAANAA, RABBANAA WA LAA TAHMIL A'LAYNAA ISRAN KAMAA HAMALTAHU A'LAL LAZEENA MIN QABLENAA, RABBANAA WA LAA TOHAMMILNAA MAA LAA TAAQATA LANAA BEHI, WA'FO A'NNAA, WAGHFIR LANAA, WARHAMNAA, ANTA MAWLAANAA FAN-SURNAA A'LAL QAWMIL KAAFEREEN. ", " Alif Laam Mim. This is the Book, there is no doubt in it, (being the word of God) (it is) a guidance for the pious. (Ones). Who believe in the unseen, and establish the prayers and of what We have provided them with. They give (in the way of their Lord). And who believe in that which hath been sent down unto thee (O Our Prophet Mohammad) and that which hath been sent down (unto the other Prophets) before thee, and of the hereafter they are sure. Allah is He besides Whom there is no god, the Everliving, the Self-subsisting by Whom all subsist; slumber does not overtake Him nor sleep; whatever is in the heavens and whatever is in the earth is His; who is he that can intercede with Him but by His permission? He knows what is before them and what is behind them, and they cannot comprehend anything out of His knowledge except what He pleases. His knowledge extends over the heavens and the earth, and the preservation of them both tires Him not, and He is the Most High, the Great. There is no compulsion in religion; truly the right way has become clearly distinct from error; therefore, whoever disbelieves in the Shaitan and believes in Allah he indeed has laid hold on the firmest handle, which shall not break off, and Allah is Hearing, Knowing. Allah is the guardian of those who believe. He brings them out of the darkness into the light; and (as to) those who disbelieve, their guardians are Shaitans who take them out of the light into the darkness; they are the inmates of the fire, in it they shall abide. Whatever is in the heavens and whatever is in the earth is Allah’s; and whether you manifest what is in your minds or hide it, Allah will call you to account according to it; then He will forgive whom He pleases and chastise whom He pleases, and Allah has power over all things. The apostle believes in what has been revealed to him from his Lord and (so do) the believers; they all believe in Allah and His angels and His books and His apostles; We make no difference between any of His apostles; and they say: We hear and obey, our Lord! Thy forgiveness (do we crave), and to Thee is the eventual course. Allah does not impose upon any soul a duty but to the extent of its ability; for it is (the benefit of) what it has earned and upon it (the evil of) what it has wrought: Our Lord! Do not punish us if we forget or make a mistake; Our Lord! do not lay on us a burden as Thou didst lay on those before us; Our Lord do not impose upon us that which we have not the strength to bear; and pardon us and grant us protection and have mercy on us, Thou art our Patron, so help us against the unbelieving people. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData39() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ اَصْبَحْتُ فِيْ اَمَانِ اللهِ وَ اَمْسَيْتُ فِيْ جَوَارِ اللهِ. ", " BISMIL LAAHIR RAHMAANIR RAHEEM ASBAHTO FEE AMAANIL LAAHE WA AMSAYTO FEE JAWAARIL LAAHE.\n ", " In the name of Allah, the Beneficent, the Merciful. I have entered upon the morning in the protection of Allah, and I shall enter in to the evening in the refuge of Allah. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ اَمْسَيْتُ فِيْ اَمَانِ اللهِ وَ اَصْبَحْتُ فِيْ جَوَارِ اللهِ. ", " BISMIL LAAHIR RAHMAANIR RAHEEM AMSAYTO FEE AMAANIL LAAHE WA ASBAHTO FEE JAWAARIL LAAHE.\n ", " In the name of Allah, the Beneficent, the Merciful. I have entered into the evening in the protection of Allah and I shall enter upon the morning in the refuge of Allah. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData40() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(
                "اَللّٰهُمَّ إِنِّي أَسْأَلُكَ الْعَفْوَ وَ الْعَافِيَةَ وَ الْمُعَافَاةَ فِي الدُّنْيَا وَ الْآخِرَةِ  ", "  ALLAAHUMMA INNEE AS-ALOKAL A’FWA WAL-A’AFEYATA WAL-MO-A’AFAATA FID-DUNYAA WAL AAKHERATE",
                "O Allah! I beseech Thee for forgiveness, health, and safety from every calamity of this world & hereafter.");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }

    private void prepareDuaSubData41() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللَّهِ وَ بِاللَّهِ اَللّٰهُمَّ مَنَنْتَ عَلَيَّ بِالْإِيمَانِ وَ أَوْدَعْتَنِي الْقُرْآنَ وَ رَزَقْتَنِيْ صِيَامَ شَهْرِ رَمَضَانَ فَامْنُنْ عَلَيَّ بِالرَّحْمَةِ وَ الرِّضْوَانِ وَ الرَّأْفَةِ وَ الْغُفْرَانِ وَ تَمَامِ مَا أَوْلَيْتَنِيْ مِنَ النِّعَمِ وَ الْإِحْسَانِ يَا حَنَّانُ يَا مَنَّانُ يَا دَائِمُ يَا رَحْمٰنُ سُبْحَانَكَ وَ لَيْسَ لِي أَحَدٌ سِوَاكَ سُبْحَانَكَ أَعُوْذُ بِكَ بَعْدَ هٰذِهِ الْكَرَامَاتِ مِنَ الْهَوَانِ وَ أَسْأَلُكَ أَنْ تُجْلِيَ عَنْ قَلْبِي الْأَحْزَانِ. ", " BISMIL LAAHE WA BILLAAHE ALLAAHUMMA MANANTA A’LAYYA BIL-EEMAANE WA AWDA’TANIL QUR-AANA WA RAZAQTANEE SEYAAMA SHAHRE RAMAZAANA FAM-NUN A’LAYYA BIR-RAHMATE WAR-RIZWAANE WAR-RAAFATE WAL-GHUFRAANE WA TAMAAME MAA AWLAYTANEE MENAN NE-A’ME WAL-EHSAANE YAA HANNAANO YAA MANNAANO YAA DAA-EMO YAA RAHMAANO SUBHAANAKA WA LAYSA LEE AHADUN SEWAAKA SUBHAANAKA A-O’OZO BEKA BA’DA HAAZEHIL KARAAMAATE MENAL HAWAANE WA AS-ALOKA AN TUJLEYA A’N QALBIL AHZAANE. ", "  \n" +
                "I begin with the name of Allah and rely on Him O Allah by giving me faith Thou hast obliged me unto Thou. Thou hast made responsible for Qur’an-e-Majeed and presented me with the fasts of Ramazan. Make me now the centre of all Thy Kindness. Charity, good Benefactor! O the doer of Kindness. Charity, good will, rewards and obligations and O the great art pure and purified and I seek. Thy refuge from my downfall after showering me with these gifts and respect and pray you to alleviate those doubts superstitions and grief which are crowding on me and send innumerable durood on Hazrat Mohammad (s.a.w.a.) and his offspring (Ahle Bayt).");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        dailyDuaSubListModel = new DailyDuaSubListModel(" مَا شَاءَ اللَّهُ لَا حَوْلَ وَ لَا قُوَّةَ إِلَّا بِاللَّهِ ", "MAA SHAA ALLAAHO LAA HAWLA WA LAA QUWWATA ILLAA BILLAAHE.  ",
                "Whatever Allah wishes it happens. There is no power and strength except with Allah, the Grand the Great ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData42() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللَّهِ وَ بِاللَّهِ وَ مُحَمَّدٌ رَسُوْلُ اللَّهِ صَلَّي اللهُ عَلَيْهِ وَ آلِهٖ وَ سَلَّمَ وَ لَا حَوْلَ وَ لَا قُوَّةَ إِلَّا بِاللَّهِ الْعَلِيِّ الْعَظِيْمِ اَللّٰهُمَّ امْسَحْ عَنِّيْ مَا أَجِدُ ", " BISMIL LAAHE WA BIL LAAHE WA MOHAMMADUN RASOOLUL LAAHE (S.A.W.A.) WA LAA HAWLA WA LAA QUWWATA ILLAA BILLAAHIL A’LIYYIL A’ZEEME ALLAAHUMMAM SAH A’NNEE MAA AJEDO. ", " I begin be relying on the name and relity of Allah and Mohammad (s.a.w.a.) The Prophet of God. Except Allah no one possesses power might. O Allah! Alleviate the pain I am suffering from. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData43() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("فَضَرَبْنَا عَلٰى اٰذَانِهِمْ فِى الْكَهْفِ سِنِيْنَ عَدَدًا. ثُمَّ بَعَثْنَاهُمْ لِنَعْلَمَ اَىُّ الْحِزْبَيْنِ اَحْصٰى لِمَا لَبِثُوْآ اَمَدًا.  ", " FA-ZARABNAA A’LAA AAZAANEHIM FIL KAHFE SENEENA A’DADAA. SUMMA BA-A’SNAAHUM LE-NA’LAMA AYYUL HIZBAYNE AHSAA LEMAA LABESOO AMADAA. ", " \n" +
                "Then we did set a seal on their ears for a number of years, then We raised them up that We might Know (i.e. ...show) which of the two parties reckoneth best the duration of their stay. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData44() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" \n" +
                "لَا إِلٰهَ إِلَّا اللَّهُ وَحْدَهٗ لَا شَرِيْكَ لَهٗ لَهُ الْمُلْكُ وَ لَهُ الْحَمْدُ يُحْيِيْ وَ يُمِيْتُ وَ يُمِيْتُ وَ يُحْيِيْ وَ هُوَ حَيٌّ لَا يَمُوْتُ\u200F  ", "  LAA ELAAHA ILLAL LAAHO WAHDAHU LAA SAHREEKA LAHU LAHUL MULKO WA LAHUL HAMDO YOHYEE WA YOMEETO WA YOMEETO WA YOHYEE WA HOWA HAYYUN LAA YAMOOTO.", " There is no Lord except Allah: He is such a One Who has no partner and holds the power of the life and death of His creatures and Himself is such a Being Who never dies. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData45() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(
                "اِنِّىْٓ اَحْبَبْتُ حُبَّ الْخَيْرِ عَنْ ذِكْرِ رَبِّىْ، حَتّٰى تَوَارَتْ بِالْحِجَابِ  ", "  INNEE AHBABTO HUBBAL KHAYRE A’N ZIKRE RABBEE, HATTAA TAWAARAT BIL-HEJAABE.",
                "Verily I have loved the good things besides the remembrance of my Lord. Until got hidden in the veil (of the darkness of the Night).");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData46() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" رَبِّ ...اَصْلِحْ لِىْ فِىْ ذُرِّيَّتِىْ، اِنِّىْ تُبْتُ اِلَيْكَ وَ اِنِّىْ مِنَ الْمُسْلِمِيْنَ  ", " RABBE … ASHLEH LEE FEE ZURRIYYATEE, INNEE TUBTO ELAYKA WA INNEE MENAL MUSLEMEEN. ", " \n" +
                "O Lord… do good unto me in respect of my offspring: Verily 1 turn unto Thee (repentant), and verily I am one of the Muslims. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData47() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(
                "رَبِّ لاَ تَذَرْنِىْ فَرْدًا وَّ اَنْتَ خَيْرُ الْوَارِثِيْنَ ",
                "RABBE LAA TAZARNEE FARDAWN WA ANTA KHAYRUL WAARESEEN. ",
                "O My Lord! Leave me not alone (without an issue) though Thou art the Best of heirs! ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData48() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" فَاَجَآءَ هَا الْمَخَاضُ اِلٰى جِذْعِ النَّخْلَةِ، قَالَتْ يَالَيْتَنِىْ مِتُّ قَبْلَ هٰذَا وَ كُنْتُ نَسْيًا مَّنْسِيًّا. فَنَادَاهَا مِنْ تَحْتِهَآ اَلاَّ تَحْزَنِىْ قَدْ جَعَلَ رَبُّكِ تَحْتَكِ سَرِيًّا. وَ هُزِّىْٓ اِلَيْكِ بِجِذْعِ النَّخْلَةِ تُسَاقِطْ عَلَيْكِ رُطَبًا جَنِيًّا.  ", " FA-JAAA-A-HAL MAKHAAZO ELAA ZIJ-I’N NAKHLATE, QAALAT YAA LAYTANEE MITTO QABLA HAAZAA WA KUNTO NASYAM MANSIYYAA. FA-NAADAAHAA MIN TAHTEHAAA ALLAA TAHZANEE QAD JA-A’LA RABBOKE TAHTAKE SARIYYAA. WA HUZZEE ELAYKE BE-JIZ-I’N NAKHLATE TOSAAQIT A’LAYKE ROTABAN JANIYYAA. ", " And the throes (of child birth) forced her to betake herself unto the trunk of a palm tree. She said, “O! Had I died before this, and had been lost in oblivion totally forgotten!” Then (a voice) called out unto her from beneath her, “Grieve not thou, verily Thy Lord hath caused from beneath thee. (To flow) a stream!” And shale towards thee the trunk of the palm tree in will drop on the dates fresh (and) ripe: And say loudly ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        dailyDuaSubListModel = new DailyDuaSubListModel(" وَاللهُ اَخْرَجَكُمْ مِّنْۢ بُطُوْنِ اُمَّهَاتِكُمْ لاَ تَعْلَمُوْنَ شَيْئًا، وَّ جَعَلَ لَكُمُ السَّمْعَ وَالْاَبْصَارَ وَالْاَفْئِدَةً، لَعَلَّكُمْ تَشْكُرُوْنَ. كَذٰلِكَ اُخْرُجْ أَيُّهَا الطَّلْقُ اُخْرُجْ بِإِذْنِ اللَّهِ . ", " WALLAAHO AKHRAJAKUM MIM BOTOONE UMMAHAATEKUM LAA TA’LAMOONA SHAY-AWN, WA JA-A’LA LAKOMUS SAM-A’ WAL-ABSAARA WAL-AF-EDATA, LA-A’LLAKUM TASHKOROON. KAZAALEKA UKHRUJ AYYOHAT TALQO UKHRUJ BE-IZNIL LAAHE. ", " Allah has taken you out from your mother’s womb when you were quite ignorant and he endowed you with the sense of hearing sight and determined for you the ways of thinking so that you should bow in thanks to Him. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData49() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ وَبِاللهِ اَللّٰہُمَّ هٰذِهٖ عَقِیْقَةٌ عَنْ فُلانٍ (take the name of the child and his father) لَحْمُہَا بِلَحْمِہٖ وَدَمُہَا بِدَمِہٖ وَعَظْمُہَا بِعَظْمِہٖ اَللّٰہُمَّ اجْعَلْہَا وِقَاءً لِآلِ مُحَمَّدٍ عَلَیْہِ وَآلِہِ السَّلَامُ. ", " BISMIL LAAHE WA BILLAAHE ALLAAHUMMA HAAZEHI A’QEEQATUN A’N FOLAANIN (TAKE THE NAME OF THE CHILD AND HIS FATHER) LAHMOHAA BE-LAHMEHI WA DAMOHAA BE-DAMEHI WA A’ZMOHAA BE-AZMEHI ALLAAHUMMAJ A’LHAA WEQAA-AN LE-AALE MOHAMMADIN A’LAYHE WA AALEHIS SALAAM. ", " \n" +
                "I begin with the name of Allah and with reliance with Him O Allah this Aqiqa is of (take the name of the child and his father) this meat is instead of his meat. This blood is instead of his blood and these bones are instead of his bones. O Allah. (I beseech Thee) through Mohammad and ale-Mohammad to consider this Aqiqa instead of the child. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        dailyDuaSubListModel = new DailyDuaSubListModel(" لَحْمُہَا بِلَحْمِهَا وَدَمُہَا بِدَمِهَا وَعَظْمُہَا بِعَظْمِهَا. ", " LAHMOHAA BE-LAHMEHAA WA DAMOHAA BE-DAMEHAA WA A’ZMOHAA BE-AZMEHAA ",
                "This meat is instead of her meat. This blood is instead of her blood, these bones are instead of her bones. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        dailyDuaSubListModel = new DailyDuaSubListModel("بِسْمِ اللَّهِ وَ بِاللَّهِ وَ الْحَمْدُ لِلَّهِ وَ اللَّهُ أَكْبَرُ إِيْمَاناً بِاللَّهِ وَ ثَنَآءً عَلٰى رَسُوْلِ اللَّهِ صَلَّي اللهُ عَلَيْهِ وَ آلِهٖ وَ الْعِصْمَةَ لِأَمْرِهٖ وَ الشُّكْرَ لِرِزْقِهٖ وَ الْمَعْرِفَةَ بِفَضْلِهٖ عَلَيْنَا أَهْلَ الْبَيْتِ  ", " BIMSIL LAHE WA BILLAAHE WAL-HAMDO LILLAAHE WALLAAHO AKBARO EEMAANAN BILLAAHE WA SANAAA-AN A’LAA RASOOLIL LAAHE SALLAL LAAHO A’LAYHE WA AALEHI WAL-I’SMATA LE-AMREHI WASH-SHUKRA LE-RIZQEHI WAL-MA’REFATA BE-FAZLEHI A’LAYNAA AHLAL BAYTE. ", " \n" +
                "O Allah you have blessed us with a son and you are aware of what calibre he is. Whatever Thou hast blessed with and whatever Thou that done for us is by Thyself O, accept this from us: it is in accordance with Thy sunnat and the sunnat of Thy good will am I offering this blood. All praise is for Allah who is the Creator of all the universe. O Allah this meat is instead of his and these bones are instead of his bones and these hairs are instead of his hair and this skin is instead of his skin O Allah accepts this as the sacrifice of so and so of so and so (name of the son and the father) ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData50() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ هٰذِهٖ سُنَّتُكَ وَ سُنَّةُ نَبِيِّكَ صَلَوَاتُكَ عَلَيْهِ وَ آلِهٖ وَ اتِّبَاعٌ مِنَّا لَكَ وَ لِنَبِيِّكَ بِمَشِيَّتِكَ وَ بِإِرَادَتِكَ وَ قَضَآئِكَ لِأَمْرٍ أَنْتَ أَرَدْتَهٗ وَ قَضَآءٍ حَتَمْتَهٗ وَ أَمْرٍ أَنْفَذْتَهٗ فَأَذَقْتَهٗ حَرَّ الْحَدِيْدِ فِي خِتَانِهٖ وَ حِجَامَتِهٖ لِأَمْرٍ أَنْتَ أَعْرَفُ بِهٖ مِنِّي اَللّٰهُمَّ فَطَهِّرْهُ مِنَ الذُّنُوبِ وَ زِدْ فِي عُمُرِهٖ وَ ادْفَعِ الْآفَاتِ عَنْ بَدَنِهٖ وَ الْأَوْجَاعَ عَنْ جِسْمِهٖ وَ زِدْهُ مِنَ الْغِنٰى وَ ادْفَعْ عَنْهُ الْفَقْرَ فَإِنَّكَ تَعْلَمُ وَ لَا نَعْلَمُ. ", " ALLAAHUMMA HAAZEHI SUNNATOKA WA SUNNATO NABIYYEKA SALAWAATOKA A’LAYHE WA AALEHI WAT-TEBAA-U’N MINNAA LAKA WA LENABIYYEKA BE-MASHIYYATEKA WA BE-ERAADATEKA WA QAZAAA-EKA LE-AMRIN ANTA ARADTAHU WA QAZAAA-IN HATAMTAHU WA AMRIN ANFAZTAHU FA-AZAQTAHU HARRAL HADEEDE FEE KHEYAANEHI WA HEJAAMATEHI LE-AMRIN ANTA A-A’RAFO BEHI MINNEE ALLAAHUMMA FA-TAHHIRHO MENAZ ZONOOBE WA ZID FEE O’MOREHI WAD-FA-I’L AAFAATE A’N BADANEHI WA AWJA-A’ A’N JISMEHI WA ZIDHO MENAL GHENAA WAD-FA’ A’NHUL FAQRA FA-INNAKA TA’LAMO WA LAA NA’LAMO. ", " \n" +
                "O Allah! This is Thy Sunnat and that of Thy Prophet on whom and on whose Aal (dear ones) Thou shower Thy blessing We follow Thou and Thy Prophet which is in accordance with Thy will Intention and the affair about which Thou had willed and decided and commanded according to which Thou hast made him taste the temperature of iron and Hajamat (vivisection) the suitability of which Thou art more aware than us, O Allah! Cleanse him of his sins. Lengthen his age. All his bodily pains, and make him healthy and let him not suffer from poverty for Thou hast knowledge whereas we do not have, ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData51() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("  اَللهُ يَعْلَمُ مَا تَحْمِلُ كُلُّ اُنْثٰى وَمَا تَغِيْضُ الْاَرْحَامُ وَمَا تَزْدَادُ، وَ كُلُّ شَىْءٍ عِنْدَهٗ بِمِقْدَارٍ. عَالِمُ الْغَيْبِ وَ الشَّهَادَةِ الْكَبِيْرُ الْمُتَعَالِ.", " ALLAAHO YA’LAMO MAA TAHMELO KULLO UNSAA WA MAA TAGHEEZUL ARHAAMO WA MAA TAZDAAD,WA KULLO SHAY-IN I’NDAHU BE-MIQDAAR. A’ALEMUL GHAYBE WASH-SHAHAADATIL KABEERUL MOTA-A’AL. ", "\n" +
                "God Knoweth what every female beareth and that which the wombs fall shorts (of completion) and that in which they increase; and of everything (there is) with Him a measure The Knower of the unseen and the seen, the Great, the Most High.  ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData52() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("يَا قَوِيُّ يَا غَنِيُّ يَا وَلِيُّ يَا مَلِيُّ.  ", " YAA QAWIYYO YAA GHANIYYO WA WALIYYO WA MALIYYO. ",
                "O Mighty; O Self -Sufficient; O Guardian; O Absolute Authority. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData53() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("اَللّٰهُمَّ رَبَّ السَّمَاوَاتِ السَّبْعِ وَ رَبَّ الْعَرْشِ الْعَظِيْمِ عَنَّا الدَّيْنَ وَ أَغْنِنَا مِنَ الْفَقْرِ.  ", " ALLAAHUMMA RABBAS SAMAAWAATIS SAB-E’ WA RABBAL A’RSHIL A’ZEEME A’NNAD DAYNA WA AGHNENAA MENAL FAQRE ", " \n" +
                "O Allah! The Lord of seven heavens. The Lord of great throne (authority), defray our debts and free us from poverty. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData54() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ اكْـفِنِيْ بِحَلاَلِكَ عَنْ حَـرَامِكَ وَ اَغْنِنِيْ بِفَضْلِكَ عَمَّنْ سِوَاكَ يَا حَيُّ يَا قَيُّوْمُ. ",
                "ALLAAHUMMAK-FENEE BE-HALAALEKA A’N HARAAMEKA WA AGHNENEE BE-FAZLEKA A’MMAN SEWAAKA YAA HAYYO YAA QAYYOOM. ",
                "O Allah make me contented with Your legitimate (things) in lace of Your forbidden things; and make me contented with Your favours, instead of other than thee. O The Ever Living, the Self Subsistent. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData55() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(
                "لَا حَوْلَ وَ لاَ قُوَّةَ اِلاَّ بِاللهِ الْعَلِيِّ الْعَظِيْمِ. ",
                "LAA HAWLA WA LAA QUWWATA ILLAA BILLAAHIL A’LIYYIL A’ZEEM. ",
                "There is no power and strength except with Allah the Grand, The Great ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData56() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("سُبْحَانَ اللَّهِ الْعَظِيْمِ وَ بِحَمْدِهٖ أَسْتَغْفِرُ اللَّهَ وَ أَسْأَلُهٗ مِنْ فَضْلِهٖ  ", "SUBHAANL LAAHIL A’ZEEME WA BE-HAMDEHI ASTAGHFERUL LAAHA WA AS-ALOHU MIN FAZLEHI.  ",
                "The Almighty God is pure and I begin with His praise. I pray salvation from Him and supplicate His Blessings ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData57() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. وَ لَا حَوْلَ وَ لاَ قُوَّةَ اِلاَّ بِاللهِ.  ", " BISMILLAAHIR RAHMAANIR RAHEEM. LAA HAWLA WA LAA QUWWATA ILLAA BILLAAH. ",
                "In the name of Allah The Beneficent, the Merciful There is no might and no power except with Allah.");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData58() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اِنَّ وَلِىِّىَ اللهُ الَّذِىْ نَزَّلَ الْكِتَابَ، وَ هُوَ يَتَوَلَّى الصَّالِحِيْنَ. وَ مَا قَدَرُوْا اللهَ حَقَّ قَدْرِهٖ، وَ الْاَرْضُ جَمِيْعًا قَبْضَتُهٗ يَوْمَ الْقِيَامَةِ وَ السَّمٰوَاتُ مَطْوِيَّاتٌۢ بِيَمِيْنِهٖ، سُبْحَانَهٗ وَ تَعَالٰى عَمَّا يُشْرِكُوْنَ. ", " INNA WALIYYEYAL LAAHUL LAZEE NAZZALAL KETAABA, WA HOWA YATAWALLAS SAALEHEEN. WA MAA QADARUL LAAHA HAQQA QADREHI, WAL-ARZO JAMEE-A’N QABZATOHU YAWMAL QEYAAMATE WAS-SAMAAWAATO MATWIYYAATUM BE-YAMEENEHI, SUBHAANAHU WA TA-A’ALAA A’MMAA YUSHREKOON. ",
                "In the name of Allah the Most Beneficent the merciful. Verily my Protector is Allah, who sent down the Book (Quran) and He guardeth the virtuous ones. They have esteemed not Allah as is His due; While the whole earth shall be in His grip on the Day of Judgement and heavens rolled up (shall be) in his right hand: Hallowed is He, and Exalted is He, high above what they associate (with Him). ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData59() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. إِلٰهِي هٰذِهٖ صَلَاتِيْ صَلَّيْتُهَا لَا لِحَاجَةٍ مِنْكَ إِلَيْهَا وَ لَا رَغْبَةٍ مِنْكَ فِيهَا إِلَّا تَعْظِيمْاً وَ طَاعَةً وَ إِجَابَةً لَكَ إِلٰى مَا أَمَرْتَنِيْ. إِلٰهِي إِنْ كَانَ فِيْهَا خَلَلٌ أَوْ نَقْصٌ مِنْ رُكُوعِهَا أَوْ سُجُوْدِهَا فَلَا تُؤَاخِذْنِي وَ تَفَضَّلْ عَلَيَّ بِالْقَبُوْلِ وَ الْغُفْرَانِ. ", " BISMILLAAHIR RAHMAANIR RAHEEM. ELAAHEE HAAZEHI SALAATEE SALLAYTOHAA LAA LE-HAAJATIN MINKA ELAYHAA WA LAA RAGHBATIN MINKA FEEHAA ILLAA TA’ZEEMAN WA TAA-A’TAN WA EJAABATAN LAKA ELAA MAA AMARTANEE. ELAAHEE IN KAANA FEEHAA KHALALUN AW NAQSUN MIN ROKOO-E’HAA AW SOJOODEHAA FALAA TO-AAKHIZNEE WA TAFAZZAL A’LAYYA BIL-QABOOLE WAL GHUFRAANE ",
                "In the name of Allah the Most Beneficent the Merciful. My Allah this my prayer which 1 have offered not for any need of Thine for it nor for any linking of Thine towards it but out of esteem and obedience and by way of carrying out what Thou hast commanded me. My Allah if there be any interstice therein or any deficiency in its kneeling postures or its prostrations do not haul me up favour me with acceptance and forgiveness ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData60() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ إِنِّي أَسْأَلُكَ بِمَا سَأَلَكَ بِهٖ زَكَرِيَّا يَا رَبِّ لَا تَذَرْنِي فَرْداً وَ أَنْتَ خَيْرُ الْوَارِثِيْنَ اَللّٰهُمَّ هَبْ لِي مِنْ لَدُنْكَ ذُرِّيَّةً طَيِّبَةً إِنَّكَ سَمِيْعُ الدُّعَآءِ اَللّٰهُمَّ بِاسْمِكَ اسْتَحْلَلْتُهَا وَ فِي أَمَانَتِكَ أَخَذْتُهَا فَإِنْ قَضَيْتَ فِي رَحِمِهَا وَلَداً فَاجْعَلْهُ غُلَاماً مُبَارَكاً زَكِيّاً وَ لَا تَجْعَلْ لِلشَّيْطَانِ فِيْهِ شِرْكاً وَ لَا نَصِيْبًا. ", "  ALLAAHUMMA INNEE AS-ALOKA BEMAA SA-ALAKA BEHI ZAKARIYYAA YAA RABBE LAA TAZARNEE FARDAN WA ANTA KHAYRUL WAARESEEN ALLAAHUMMA HAB LEE MIN LADUNKA ZURRIYYATAN TAYYEBATAN INNAKA SAMEE-U’D DO-A’AA. ALLAAHUMMA BISMEKAS TAHLALTOHAA WA FEE AMAANATEKA AKHAZTOHAA FA-IN QAZAYTA FEE RAHEMEHAA WALADAN FAJ-A’LHO GHOLAAMAN MOBAARAKAN ZAKIYYAN WA LAA TAJ-A’L LISH-SHAYTAANE FEEHE SHIRKAN WA LAA NASEEBAN.", " \n" +
                "O Allah! I beseech Thee through those who were referred to by Zakaria. He had said “O my Allah! Leave me not alone and there is no better guardian than Thee.” O Allah! Bless me through Thee with a pious child; undoubtedly Thou art the Hearer of all prayers. O Allah! Through Thy name I have made this woman permissible unto me and have taken her from Thy guardianship. If Thou intend this woman’s womb to be filled with the child then make this child virtuous and pure and let partake anything of the Satan. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData61() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" وَلَقَدْ خَلَقْنَا الْاِنْسَانَ مِنْ سُلَالَةٍ مِّنْ طِيْنٍ. ثُمَّ جَعَلْنَاهُ نُطْفَةً فِىْ قَرَارٍ مَّكِيْنٍ.\n" +
                "ثُمَّ خَلَقْنَا النُّطْفَةَ عَلَقَةً فَخَلَقْنَا الْعَلَقَةَ مُضْغَةً فَخَلَقْنَا الْمُضْغَةَ عِظَامًا فَكَسَوْنَا الْعِظَامَ لَحمًا، ثُمَّ اَنْشَاْنَاهُ خَلْقًا اٰخَرَ، فَتَبَارَكَ اللهُ اَحْسَنُ الْخَالِقِيْنَ. ", " WA LAQAD KHALAQNAL INSAANA MIN SOLAALATIM MIN TEEN. SUMMA JA-A’LNAAHO NUTFATAN FEE QARAARIM MAKEEN." +
                "SUMMA KHALAQNAN NUTFATA A’LAQATAN FA-KHALAQNAL A’LAQATA MUZGHATAN FA-KHALAQNAL MUZGHATA E’ZAAMAN FA-KASAWNAL E’ZAAMA LAHMAA, SUMMA ANSHAA-NAAHO KHALQAN AAKHAR, FA-TABAARAKAL LAAHO AHSANUL KHAALEQEEN. ",
                "And indeed We created man from an extract of clay Then We made him sperm, in a firm resulting place." +
                "Then made We the sperm a clot, then made we the clot, a lump of flesh then made We in the lump of bones, then clothed We the bones with flesh: then We did grow it into another creation. So blessed be God, the Best of the creators. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        dailyDuaSubListModel = new DailyDuaSubListModel(" وَلَوْ اَنَّ قُرْاٰنًا سُيِّرَتْ بِهِ الْجِبَالُ اَوْ قُطِّعَتْ بِهِ الْاَرْضُ اَوْ كُلِّمَ بِهِ الْمُوْتٰى، بَلْ لِلّٰهِ الْاَمْرُ جَمِيْعًا. ", " WA LAW ANNA QUR-AANAN SUYYERAT BEHIL JEBAALO AW QUTTE-A’T BEHIL ARZO AW KULLEMA BEHIL MAWTAA, BAL LILLAAHIL AMRO JAMEE-A’N. ", " WA LAW ANNA QUR-AANAN SUYYERAT BEHIL JEBAALO AW QUTTE-A’T BEHIL ARZO AW KULLEMA BEHIL MAWTAA, BAL LILLAAHIL AMRO JAMEE-A’N. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData62() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(
                "وَالَّتِىْٓ اَحْصَنَتْ فَرْجَهَا فَنَفَخْنَا فِيْهَا مِنْ رُّوْحِنَا وَ جَعَلْنَاهَا وَابْنَهَآ اٰيَةً لِّلْعَالَمِيْنَ. اِنَّ هٰذِهٖٓ اُمَّتُكُمْ اُمَّةً وَّاحِدَةً، وَّاَنَا رَبُّكُمْ فَاعْبُدُوْنِ. وَ تَقَطَّعُوْآ اَمْرَهُمْ بَيْنَهُمْ، كُلٌّ اِلَيْنَا رَاجِعُوْنَ. ", " WALLATEE AHSANAT FARJAHAA FA-NAFAKHNAA FEEHAA MIR ROOHENAA WA JA-A’LNAAHAA WABNAHAAA AAYATAL LIL-A’ALAMEEN. INNA HAAZEHI UMMATOKUM UMMATAWN WAAHEDATAN, WA ANA RABBOKUM FA’BODOON. WA TAQATTA-O’O AMRAHUM BAYNAHUM, KULLUN ELAYNAA RAAJE-O’ON. ", " And (O Our Prophet Mohammed!) remember her (Mary) who guarded her chastity We breathed into her Our Sprit, and We made her and her son a sign unto all peoples. Verily the (Islam) is your group, one group and I am your Lord! Therefore worship ye Me (alone)! But they have rent as under (this) their concern among themselves (into sects), (and yet) unto Us shall all of them return. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData63() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" يَآاَيُّهَا النَّاسُ اتَّقُوْا رَبَّكُمْ، اِنَّ زَلْزَلَةَ السَّاعَةِ شَىْءٌ عَظِيْمٌ. ",
                "YAAA AYYOHAN NAASUT TAQOO RABBAKUM, INNA ZALZALATAS SAA-A’TE SHAY-UN A’ZEEM. ", "O ye people! Fear ye your Lord! Verily the quake of the hour (of doom) is a thing tremendous!  ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData64() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. يَا خَالِقَ النَّفْسِ مِنَ النَّفْسِ وَ مُخْرِجَ النَّفْسِ مِنَ النَّفْسِ خَلِّصْهَا ", " BISMIL LAAHIR RAHMAANIR RAHEEM. YAA KHAALEQAN NAFSE MENAN NAFSE WA MUKHREJAN NAFSE MENAN NAFSE KHALLIS-HAA ",
                "In the name of Allah the Most Beneficent the Merciful. O the Creator of living for the living; O the Extractor a living from the living; O the Rescuer of living from the living; O relieve it (the foetus from the womb). ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData65() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" يَوْمَئِذٍ يَّتَّبِعُوْنَ الدَّاعِىَ لَاعِوَجَ لَهٗ، وَ خَشَعَتِ الْاَصْوَاتُ لِلرَّحْمٰنِ فَلاَ تَسْمَعُ اِلاَّ هَمْسًا. يَوْمَئِذٍ لاَّ تَنْفَعُ الشَّفَاعَةُ اِلاَّ مَنْ اَذِنَ لَهُ الرَّحْمٰنُ وَ رَضِىَ لَهٗ قَوْلاً. يَعْلَمُ مَا بَيْنَ اَيْدِيْهِمْ وَمَا خَلْفَهُمْ وَلاَ يُحِيْطُوْنَ بِهٖ عِلْمًا. وَعَنَتِ الْوُجُوْهُ لِلْحَىِّ الْقَيُّوْمِ، وَ قَدْ خَابَ مَنْ حَمَلَ ظُلْمًا. وَمَنْ يَّعْمَلْ مِنَ الصَّالِحَاتِ وَهُوَ مُؤْمِنٌ فَلاَ يَخَافُ ظُلْمًا وَّلاَ هَضْمًا. ", "  YAWMA-EZIYN YATTABE-O’ONAD DAA-E’YA LAA E’WAJA LAHU, WA KHASHA-A’TIL ASWAATO LIR-RAHMAANE FALAA TASMA-O’ ILLAA HAMSAA. YAWMA-EZIL LAA TANFA-O’SH SHAFAA-A’TO ILLAA MAN AZENA LAHUR RAHMAANO WA RAZEYA LAHU QAWLAA. YA’LAMO MAA BAYNA AYDEEHIM WA MAA KHALFAHUM WA LAA YOHEETOONA BEHI I’LMAA. WA A’NATIL WOJOOHO LIL-HAYYIL QAYYOOM, WA QAD KHAABA MAN HAMALA ZULMAA. WA MAYN YA’MAL MENAS SAALEHAATE WA HOWA MOA-MENUN FALAA YAKHAAFO ZULMAWN WA LAA HAZMAA.", " On that day they shall follow the summoner no crookedness (shall be shown) unto him, and low shall be the voice before the Beneficent (God), that thou shall, hear not aught but the light footfall. On that day shall avail not intercession (of any) save that of) whom hath permitted God and whose word He is pleased with. Knoweth He what is before them and what is behind them, while they comprehend Him in (their) knowledge. And (all) faces shall be humbled before the ever Living. The Self Subsistent God, and indeed disappointed will be he who beareth iniquity. And whosoever doth good deeds and he be a believer, he shall fear not of (the least) injustice (unto him) nor of (any) curtailment (of his dues). ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData66() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ صُنْ وَجْهِي بِالْيَسَارِ وَ لَا تَبَذَّلْ جَاهِي بِالْإِقْتَارِ فَأَسْتَرْزِقَ طَالِبِي رِزْقِكَ وَ أَسْتَعْطِفَ شِرَارَ خَلْقِكَ وَ أَبْتَلِيَ بِحَمْدِ مَنْ أَعْطَانِي وَ أَفْتَتِنَ بِذَمِّ مَنْ مَنَعَنِيْ وَ أَنْتَ مِنْ وَرَاءِ ذٰلِكَ كُلِّهٖ وَلِيُّ الْإِعْطَاءِ وَ الْمَنْعِ إِنَّكَ عَلٰى\u200F كُلِّ شَيْ\u200Fءٍ قَدِيْرٌ. ", " ALLAAHUMMA SUN WAJHEE BIL-YASAARE WA LAA TABAZZAL JAAHEE BIL-IQTAARE FA-ASTARZEQA TAALEBEE RIZQEKA WA AS-TA’TEFA SHERAARA KHALQEKA WA ABTALEYA BE-HAMDE MAN A-A’TAANEE WA AFTATANA BE-ZAMME MAN MANA-A’NEE WA ANTA MIN WARAA-E ZAALEKA KULLEHI WALIYYUL E-A’TAA-E WAL-MAN-E’ INNAKA A’LAA KULLE SHAY-IN QADEER. ", " \n" +
                "In the name of Allah the Beneficent and the Merciful. O Allah! Save My face by granting me prosperity and destroy not my prestige by reducing me to poverty so that I may have to seek my sustenance from those who seek (the same) from thee, or I may look forward for the kindness to thy evil Creatures; and consequently I may indulge in praise of those who may give and dispraise those who refused, though (indeed) Thou alone art responsible of all for grant or refusal, verily Thou art all-powerful over everything. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData67() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" سُبْحَانَ مَنْ لَا يَعْتَدِي عَلٰى أَهْلِ مَمْلَكَتِهٖ سُبْحَانَ مَنْ لَا يَأْخُذُ أَهْلَ الْأَرْضِ بِأَلْوَانِ الْعَذَابِ سُبْحَانَ الرَّءُوْفِ الرَّحِيْمِ اَللّٰهُمَّ اجْعَلْ لِي فِي قَلْبِيْ نُوراً وَ بَصَراً وَ فَهْماً وَ عِلْماً إِنَّكَ عَلٰى كُلِّ شَيْ\u200Fءٍ قَدِيْرٌ. ", "  SUBHAANA MAN LAA YA’TADEE A’LAA AHLE MAMLAKATEHI SUBHAANA MAN LAA YAAKHOZO AHLAL ARZE BE-ALWAANIL A’ZAABE SUBHAANAR RAOOFIR RAHEEM ALLAAHUMMAJ A’L LEE FEE QALBEE NOORAN WA BASARAN WA FAHMAN WA I’LMAN INNAKA A’LAA KULLE SHAY-IN QADEER.", " In the name of Allah the Beneficent, and the Merciful. Glory be to be him who does not oppress His subject Glory be to him who does not chastise the people of the earth with various punishments. Glory be to Him who is kind (and) Merciful O my Lord establish in my mind, light insight wisdom and knowledge indeed you have power on everything. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData68() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("\n" +
                "اَللّٰهُمَّ ارْحَمْنِيْ بِتَرْكِ مَعَاصِيْكَ أَبَداً مَا أَبْقَيْتَنِيْ وَ ارْحَمْنِيْ مِنْ تَكَـلُّفِ مَا لَا يَعْنِيْنِيْ وَ ارْزُقْنِيْ حُسْنَ الْمَنْظَرِ فِيْمَا يُرْضِيْكَ عَنِّيْ وَ أَلْزِمْ قَلْبِيْ حِفْظَ كِتَابِكَ كَمَا عَلَّمْتَنِيْ وَ ارْزُقْنِيْ أَنْ أَتْلُوَهٗ عَلَى النَّحْوِ الَّذِي يُرْضِيْكَ عَنِّي اَللّٰهُمَّ نَوِّرْ بِكِتَابِكَ بَصَرِيْ وَ اشْرَحْ بِهٖ صَدْرِيْ وَ فَرِّحْ بِهٖ قَلْبِيْ وَ أَطْلِقْ بِهٖ لِسَانِيْ وَ اسْتَعْمِلْ بِهٖ بَدَنِيْ وَ قَوِّنِيْ عَلٰى ذٰلِكَ وَ أَعِنِّيْ عَلَيْهِ إِنَّهٗ لَا مُعِيْنَ عَلَيْهِ إِلَّا أَنْتَ لَا إِلٰهَ إِلَّا أَنْتَ.  ", "  ALLAAHUMMAR HAMNEE BE-TARKE MA-A’ASEEKA ABADAN MAA ABQAYTANEE WAR HAMNEE MIN TAKALLOFE MAA LAA YA’NEENEE WAR-ZUQNEE HUSNAL MANZARE FEEMAA YURZEEKA A’NNEE WA ALZIM QALBEE HIFZA KETAABEKA KAMAA A’LLAMTANEE WAR-ZUQNEE AN ATLOWAHU A’LAN NAHWIL LAZE YURZEEKA A’NNEE ALLAAHUMMA NAWWIR BE-KETAABEKA BASAREE WASH-RAH BEHI SADREE WA FARREH BEHI QALBEE WA AT-LIQ BEHI LESAANEE WAS-TA’MIL BEHI BADANEE WA QAWWENEE A’LAA ZAALEKA WA A-I’NNEE A’LAYHE INNAHU LAA MO-E’ENA A’LAYHE ILLAA ANTA LAA ELAAHA ILLAA ANTA.", " \n" +
                "O Allah! Be merciful on me by making me obedient to thee and not to be disobedient till my life time. Be merciful on me by not commanding me what is beyond my capacity. Grant me such virtuous conduct which makes Thee Pleased with me. Make my heart to preserve thy book (Quran) as thou has taught me. Grant me so that I may recite it in the manner which makes Thee pleased with me. O Allah! Brighten my eyes: and expend for my breast with it; and open my mind with it and free with my tongue: and devote my body to it; and strengthen me over it and help me over it because certainly there is no helper in this matter save thee. There is no god except Thee. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData69() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَعُوْذُ بِعِزَّةِ الله وَ قُدْرَةِ اللهِ وَ قُوَّةِ اللهِ وَ عَظَمَةِ اللهِ وَ بُرْهَانِ اللهِ وَ سُلْطَانِ اللهِ وَ كَنَفِ اللهِ وَ جَوَارِ اللهِ وَ اَمَانِ اللهِ وَ حِرْزِ اللهِ وَ صُنْعِ اللهِ وَ كِبْرِيَآءِ اللهِ وَ نَظَرِ اللهِ وَ بَهَآءِ اللهِ وَ جَلاَلِ اللهِ وَ كَمَالِ اللهِ وَ جَمَالِ اللهِ لَآ اِلٰهَ اِلاَّ اللهُ مُحَمَّدٌ رَّسُوْلُ اللهِ مِنْ شَرِّ مَا اَجِدُ. ", "  A-O’OZO BE-I’ZZATIL LAAHE WA QUDRATIL LAAHE WA QUWWATIL LAAHE WA A’ZAMATIL LAAHE WA BURHAANIL LAAHE WA SULTAANIL LAAHE WA KANAFIL LAAHE WA JAWAARIL LAAHE WA AMAANIL LAAHE WA HIRZIL LAAHE WA SUN-I’L LAAHE WA KIBREYAAA-IL LAAHE WA NAZARIL LAAHE WA BAHAAA-IL LAAHE WA JALAALIL LAAHE WA KAMAALIL LAAHE WA JAMAALIL LAAHE LAA ELAAHA ILLAL LAAHO MOHAMMADUR RASOOLUL LAAHE MIN SHARRE MAA AJEDO.",
                "In the name of Allah the Beneficent and the Merciful. I seek protection against evil, I find around me through the honour of Allah and the might of Allah and the strength of Allah and the grandeur of Allah and the proof of Allah and the Supremacy as Allah and the protection by Allah and the succour of Allah and the safe guard by Allah and the fortification by Allah and safe guard by Allah and the pride of Allah and superintendence of Allah and the splendour of Allah and the majesty of Allah and the perfection of Allah and the glory of Allah and through “Laa elaaha illal laah Mohammadun Rusoolul laah,” (i.e. there is no deity but Allah. Muhammad, Allah’s blessings and peace be upon him and his holy posterity, is the Messenger of Allah.) ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData70() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("لَا إِلٰهَ إِلَّا اللَّهُ عَلَيْهِ تَوَكَّلْتُ وَ هُوَ رَبُّ الْعَرْشِ الْعَظِيْمِ مَا شَاءَ اللَّهُ كَانَ وَ مَا لَمْ يَشَأْ لَمْ يَكُنْ أَشْهَدُ أَنَّ اللَّهَ عَلٰى\u200F كُلِّ شَيْ\u200Fءٍ قَدِيْرٌ وَ أَنَّ اللَّهَ قَدْ أَحاطَ بِكُـلِّ شَيْ\u200Fءٍ عِلْماً اَللّٰهُمَّ إِنِّي أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِي وَ شَرِّ كُلِّ دَابَّةٍ أَنْتَ آخِذٌ بِنَاصِيَتِهَا إِنَّ رَبِّيْ عَلٰى\u200F صِرَاطٍ مُسْتَقِيْمٍ\u200F.  ", "  LAA ELAAHA ILLAL LAAHO A’LAYHE TAWAKKALTO WA HOWA RABBUL A’RSHIL A’ZEEM MAA SHAAA-AL LAAHO KAANA WA MAA LAM YASHAAA LAM YAKUN ASH-HADO ANNAL LAAHA A’LAA KULLE SHAY-IN QADEER WA ANNAL LAAHA QAD AHAATA BE-KULLE SHAY-IN I’LMAA. ALLAAHUMMA INNEE A-O’OZO BEKA MIN SHARRE NAFSEE WA SHARRE KULLE DAABBATIN ANTA AAKHEZUN BE-NAASEYATEHAA INNA RABBEE A’LAA SERAATIM MUSTAQEEM.", " \n" +
                "There is no god but Allah. I trust in Him for He is the Lord of the throne. Whatever He wishes it happens and whatever He does not desire does not happen. I bear witness that indeed Allah has power over everything and indeed his knowledge encompasses everything. O my lord I seek “Thy refuge from the evil of myself and from the evil of every creature of the earth who is under Your control and power in the way of my Lord is the right path. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData71() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" \n" +
                "اِنَّ ربَّكُمُ اللهُ الَّذِىْ خَلَقَ السَّمَاوَاتِ وَالْاَرْضَ فِىْ سِتَّةِ اَيَّامٍ ثُمَّ اسْتَوٰى عَلَى الْعَرْشِ يُغْشِى اللَّيْلَ النَّهَارَ يَطْلُبُهٗ حَثِيْثًا وَّالشَّمْسَ وَالْقَمَرَ وَالنُّجُوْمَ مُسَخَّرَاتٍ بِاَمْرِهٖ اَلاَ لَهُ الْخَلْقُ والْاَمْرُ تَبَارَكَ اللهُ رَبُّ الْعَالَمِيْنَ. اُدْعُوْا رَبَّكُمْ تَضَرُّعًا وَّخُفْيَةً اِنَّهٗ لاَيُحِبُّ الْمُعْتَدِيْنَ. وَلاَ تُفْسِدُوْا فِى اْلاِرْضِ بَعْدَ اِصْلاَحِهَا وَادْعُوْهُ خَوْفًا وَّطَمَعًا اِنَّ رَحْمَتَ اللهِ قَرِيْبٌ مِّنَ الْمُحْسِنِيْنَ. ", "  INNA RABBAKOMUL LAAHUL LAZE KHALAQAS SAMAAWAATE WAL-ARZA FEE SITTATE AYYAAMIN SUMMAS TAWAA A’LAL A’RSHE YUGHSHIL LAYLAN NAHAARA YATLOBOHU HASEESAWN WASH-SHAMSA WAL-QAMARA WAN-NOJOOMA MOSAKH-KHARAATIN BE-AMREHI ALAA LAHUL KHALQO WAL AMRO TABAARAKAL LAAHO RABBUL A’ALAMEEN. UD-O’O RABBAKUM TAZARRROA’WN WA KHUFYATAN INNAHU LAA YOHIBBUL MOA’TADEEN. WA LAA TUFSEDOO FIL ARZE BA’DA ISLAAHEHAA WAD-O’OHO KHAWFAWN WA TAMA-A’N INNA RAHMATAL LAAHE QAREEBUM MENAL MOHSENEEN", " INNA RABBAKOMUL LAAHUL LAZE KHALAQAS SAMAAWAATE WAL-ARZA FEE SITTATE AYYAAMIN SUMMAS TAWAA A’LAL A’RSHE YUGHSHIL LAYLAN NAHAARA YATLOBOHU HASEESAWN WASH-SHAMSA WAL-QAMARA WAN-NOJOOMA MOSAKH-KHARAATIN BE-AMREHI ALAA LAHUL KHALQO WAL AMRO TABAARAKAL LAAHO RABBUL A’ALAMEEN. UD-O’O RABBAKUM TAZARRROA’WN WA KHUFYATAN INNAHU LAA YOHIBBUL MOA’TADEEN. WA LAA TUFSEDOO FIL ARZE BA’DA ISLAAHEHAA WAD-O’OHO KHAWFAWN WA TAMA-A’N INNA RAHMATAL LAAHE QAREEBUM MENAL MOHSENEEN ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData72() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ رَبَّ مُوْسٰى وَ خَاصَّهٗ بِكَـلَامِهٖ وَ هَازِمَ مَنْ كَادَهٗ بِسِحْرِهٖ بِعَصَاهُ وَ مُعِيْدَهَا بَعْدَ الْعَوْدِ ثُعْبَاناً وَ مُلَقِّفَهَا إِفْكَ أَهْلِ الْإِفْكِ وَ مُفْسِدَ عَمَلِ السَّاحِرِيْنَ وَ مُبْطِلَ كَيْدِ أَهْلِ الْفَسَادِ مَنْ كَادَنِي بِسِحْرٍ أَوْ بِضُرٍّ عَامِداً أَوْ غَيْرَ عَامِدٍ أَعْلَمُهٗ أَوْ لَا أَعْلَمُهٗ وَ أَخَافُهٗ أَوْ لَا أَخَافُهٗ فَاقْطَعْ مِنْ أَسْبَابِ السَّمَاوَاتِ عَمَلَهٗ حَتّٰى تُرْجِعَهٗ عَنِّي غَيْرَ نَافِذٍ وَ لَا ضَارٍّ لِيْ وَ لَا شَامِتٍ بِيْ إِنِّيْ أَدْرَأُ بِعَظَمَتِكَ فِي نُحُوْرِ الْأَعْدَاءِ فَكُنْ لِي مِنْهُمْ مُدَافِعاً أَحْسَنَ مُدَافَعَةٍ وَ أَتَمَّهَا يَا كَرِيْمُ . ", " ALLAAHUMMA RABBA MOOSAA WA KHAASSAHU BEKALAAMEHI WA HAAZEMA MAN KAADAHU BE-SEHREHI BE-A’SAAHO WA MO-E’EDAHAA BA’DAL A’WDE SO’BAANAN WA MOLAQQEFAHAA IFKA AHLIL IFKE WA MUFSEDA A’MALAS SAAHEREENA WA MUBTELA KAYDE AHLIL FASAADE MAN KAADANEE BE-SEHRIN AW BE-ZURRIN AAMEDAN AW GHAYRA A’AMEDIN A-A’LAMOHU AW LAA A-A’LAMOHU WA AKHAAFOHU AW LAA AKHAAFOHU FAQ-TA’ MIN ASBAABIS SAMAAWAATE A’MALAHU HATTAA TURJE-A’HU A’NNEE GHAYRA NAAFEZIN WA LAA ZAARRIN LEE WA LAA SHAAMETIN BEE INNEE ADRA-O BE-A’ZAMATEKA FEE NOHOORIL A-A’DAA-E FAKUN LEE MINHUM MODAA-FE-A’N AHSANA MODAA-FA-A’TIN WA ATAMMAHAA YAA KAREEMO. ", " O Allah! O the Lord of Moosa (a.s.) who honoured him with His communion, who prevailed with Moosa (a.s.) and who retransformed it in to a serpent, after transforming it to its original state who got the falsehood of the liars swallowed up who reduced to naught the craft of the magician and O Thou who nullified the mischief of the mischief-monger; grant me with metaphysical whoever vexes me with magic, or inflicts harm on me intentionally or otherwise, whether I know about it or not, whether I am afraid of it or not, with heavenly means cut off his action, till it be warded off from me without being executed, without being harmful to me, and without having malevolent effect on me. Indeed, with Thy Greatness, I ward off my enemies; so (O Allah). You be my Protector against them with the Best Protection with Perfection O the Benevolent. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData73() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" \n" +
                "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. اَللّٰهُمَّ إِنِّي أَسْأَلُكَ تَعْجِيْلَ عَافِيَتِكَ أَوْ صَبْراً عَلٰى بَلِيَّتِكَ أَوْ خُرُوْجًا إِلٰى رَحْمَتِكَ. ", " BISMILLAAHIR RAHMAANIR RAHEEM. ALLAAHUMMA INNEE AS-ALOKA TA’JEELA A’AFEYATEKA AW SABRAN A’LAA BALIYYATEKA AW KHOROOJAN ELAA RAHMATEKA. ", " In the name of Allah the Beneficent and the Merciful. O Allah! I beseech Thee for the speedy recovery or patience on the affliction and going out of this world toward Thy mercy. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData74() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. اَللّٰهُمَّ إِنِّي أَسْأَلُكَ تَعْجِيْلَ عَافِيَتِكَ وَ صَبْراً عَلٰى بَلِيَّتِكَ وَ خُرُوْجًا مِنَ الدُّنْيَا إِلٰى رَحْمَتِكَ. ", " BISMILLAAHIR RAHMAANIR RAHEEM. ALLAAHUMMA INNEE AS-ALOKA TA’JEELA A’AFEYATEKA WA SABRAN A’LAA BALIYYATEKA WA KHOROOJAN MENAD DUNYAA ELAA RAHMATEKA. ", " \n" +
                "In the name of Allah the Beneficent and the Merciful. My Allah I ask Thee quick recovery or else endurance on Thy trail from this world towards Thy Mercy. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData75() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. يَا نُوْرَ كُلِّ شَيْ\u200Fءٍ وَ هُدَاهُ أَنْتَ الَّذِيْ فَلَقَ الظُّلُمَاتِ نُوْرُهٗ. ", " BISMILLAAHIR RAHMAANIR RAHEEM. YAA NOORA KULLE SHAY-IN WA HODAAHO ANTAL LAZEE FALAQAZ ZOLOMAATE NOOROHU. ", "  In the name of Allah the Beneficent and the Merciful. O the Light! Which is the Light of everything and guides of it, Thou art the One, Who splitted the darkness by His Light.");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData76() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" يَّرْجُوْنَ تِجَارًةً لَّنْ تَبُوْرَ.\n" +
                "زُيِّنَ لِلنَّاسِ حُبُّ الشَّهَوَاتِ. ", " YARJOONA TEJAARATAL LAN TABOOR.\n" +
                "ZUYYENA LINNAASE HUBBUSH SHAHAWAATE. ", " Hope for a merchandise which will never perish.\n" +
                "It has been made to seen attractively fair unto men. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);


        dailyDuaSubListModel = new DailyDuaSubListModel(
                "اَللّٰهُمَّ اِنِّيْۤ اَسْئَلُكَ مِنْ خِيْرِهَا وَ خَيْرِ اَهْلِهَا وَ اَعُوْذُ بِكَ مِنْ شَرِّهَاوَ شَرِّ اَهْلِهَا. ", " ALLAAHUMMA INNEE AS-ALOKA MIN KHAYREHAA WA KHAYRE AHLEHAA WA A-O’OZO BEKA MIN SHARREHAA WA SHARRE AHLEHAA ",
                "O Allah! I beseech Thee to grant me goodness from the Bazar and goodness from those who are in it. I seek refuge for the mischief of the Bazar and the mischief of those who are there.");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData77() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ اِنِّيْۤ اَسْئَلُكَ مِنْ خِيْرِهَا وَ خَيْرِ اَهْلِهَا.  ", " ALLAAHUMMA INNEE AS-ALOKA MIN KHAYREHAA WA KHAYRE AHLEHAA. ", "  \n" +
                "O Allah! I seek you benefits for this bazar and those who through it.");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData78() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَشْهَدُ اَنْ لَّا اِلٰهَ اِلاَّ اللهُ وَحْدَهٗ لاَ شَرِيْكَ لَهٗ وَ اَشْهَدُ اَنَّ مُحَمَّدًا صَلَّي اللهُ عَلَيْهِ وَ اٰلِهٖ عَبْدُهٗ وَ رَسُوْلُهٗ اَللّٰهُمَّ اِنِّيْۤ اَسْئَلُكَ مِنْ فَضْلِكَ رِزْقًا حَلاَلًا طَيِّبًا وَ اَعُوْذُ بِكَ مِنْ اَنْ اَظْلِمَ اَوْ اُظْلِمَ وَ اَعُوْذُ بِكَ مِنْ صَفْقَةٍ خَاسِرَةٍ وَ يَمِيْنٍ كَاذِبَةٍ. ", "ASH-HADO AN LAA ELAAHA ILLAL LAAHO WAHDAHU LAA SHAREEKA LAHU WA ASH-HADO ANNA MOHAMMADIN SALLAL LAAHO A’LAYHE WA AALEHI A’BDOHU WA RASOOLOHU ALLAAHUMMA INNEE AS-ALOKA MIN FAZLEKA RIZQAN HALAALAN TAYYEBAN WA A-O’OZO BEKA MIN AN AZLEMA AW UZLEMA WA A-O’OZO BEKA MIN SAFQATIN KHAASHERATIN WA YAMEENIN KAAZEBATIN.  ", "  \n" +
                "I stand witness that there is no God except One who has no partner and I also stand witness to Mohammed Mustafa (s.a.w.a.) being His servant and His Prophet O Allah! I beg You to give me permissible and purified daily bread with our blessings; and seek shelter for myself doing any cruelty on any one or anyone doing any cruelty with me and also seek refuge from trade which incurs losses and false oaths.");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData79() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("اَللّٰهُمَّ إِنِّي اشْتَرَيْتُهٗ أَلْتَمِسُ فِيْهِ مِنْ فَضْلِكَ فَصَلِّ عَلٰى مُحَمَّدٍ وَ آلِ مُحَمَّدٍ اَللّٰهُمَّ فَاجْعَلْ لِي فِيْهِ فَضْلًا اَللّٰهُمَّ إِنِّي اشْتَرَيْتُهٗ أَلْتَمِسُ فِيهِ مِنْ رِزْقِك\u200F فَاجْعَلْ فِيهِ رِزْقاً.  ", "  ALLAAHUMMA INNISH TARAYTOHU ALTAMESO FEEHE MIN FAZLEKA FA-SALLE A’LAA MOHAMMADIN WA AALE MOHAMMADIN ALLAAHUMMA FAJ-A’L LEE FEEHE FAZLAN ALLAAHUMMA INNISH TARAYTOHU ALTAMESO FEEHE MIN RIZQEKA FAJ-A’L FEEHE RIZQAN.", " ALLAAHUMMA INNISH TARAYTOHU ALTAMESO FEEHE MIN FAZLEKA FA-SALLE A’LAA MOHAMMADIN WA AALE MOHAMMADIN ALLAAHUMMA FAJ-A’L LEE FEEHE FAZLAN ALLAAHUMMA INNISH TARAYTOHU ALTAMESO FEEHE MIN RIZQEKA FAJ-A’L FEEHE RIZQAN. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        dailyDuaSubListModel = new DailyDuaSubListModel(" يَا حَيُّ يَا قَيُّوْمُ يَا دَآئِمُ يَا رَءُوْفُ يَا رَحِيْمُ أَسْأَلُكَ بِعِزَّتِكَ وَ قُدْرَتِكَ وَ مَا أَحَاطَ بِهٖ عِلْمُكَ أَنْ تَقْسِمَ لِي مِنَ التِّجَارَةِ الْيَوْمَ أَعْظَمَهَا رِزْقاً وَ أَوْسَعَهَا فَضْلًا وَ خَيْرَهَا عَاقِبَةً فَإِنَّهٗ لَا خَيْرَ فِيْمَا لَا عَاقِبَةَ لَهٗ. ", " YAA HAYYO YAA QAYYOOMO YAA DAAA-EMO YAA RA-OOFO YAA RAHEEMO AS-ALOKA BE-IZZATEKA WA QUDRATEKA WA MAA AHAATA BEHI I’LMOKA AN TAQSEMA LEE MENAT TEJAARATIL YAWMA A-A’ZAMAHAA RIZQAN WA AW-SA-A’HAA FAZLAN WA KHAYRAHAA A’AQEBATAN FA-INNAHU LAA KHAYRA FEEMAA LAA A’AQEBATA LAHU. ", " O the Ever-living the Self subsisting; the Eternal the Generous the Merciful, I bind Thee and by thy dignity, Thy might and all those thing which are in thy knowledge and beg Thee to increase my prosperity and respect and make my end good through today’s trade, as those things whose end is not good are never good. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData80() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" وَ جَعَلْنَا مِنْۢ بَيْنِ اَيْدِيْهِمْ سَدًّا وَّ مِنْ خَلْفِهِمْ سَدًَّا فَاَغْشَيْنَاهُمْ فَهُمْ لاَ يُبْصِرُوْنَ. لَا ضَيْعَةَ عَلٰي مَا حَفِظَهُ اللهُ. فَاِنْ تَوَلَّوْا فَقُلْ حَسْبِىَ اللهُ، لَآ اِلٰهَ اِلاَّ هُوَ، عَلَيْهِ تَوَكَّلْتُ وَهُوَ رَبُّ الْعَرْشِ الْعَظِيْمِ. ",
                "WA JA-A’LNAA MIM BAYNA AYDEEHIM SADDAWN WA MIN KHALFEHIM SADDAN FA-AGHSHAYNAAHUM FAHUM LAA YUBSEROON. LAA ZAY-A’TA A’LAA MAA HAFEZAHUL LAAHO. FA-IN TAWALLAW FAQUL HASBEYAL LAAHU, LAA ELAAHA ILLAA HOWA, A’LAYHE TAWAKKALTO WA HOWA RABBUL A’RSHIL A’ZEEM. ",
                "We have set a wall before them and another behind and have closed the gap from above. They can think of nothing.[37] That thing cannot be lost whose protector is Allah. And if after this they do not see in the right direction then say Allah is enough for me. Allah, there is no god but He! I rely on Him and he is the Lord of the Arsh-e-Azeem (Quran) ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData81() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" یا رب تو چنان کن که پریشان نشوم\n" +
                "محتاج برادران و خویشان نشوم \n" +
                "بی منت مخلوق مرا روزی ده\n" +
                "تا از در تو بر در ایشان نروم ", " \n" +
                "YAA RABB TU CHENAAN KUN KE PARESHAAN NASHAWAM\n" +
                "MOHTAAJ-E- BIRAADARAAN-O-KHISHAAN NASHAWAM\n" +
                "BI MINNAT-E-MAKHLOOQ MARAA ROZI DEH\n" +
                "TAA AZ DAR TU BAR DAR-E-EESHAAN NARAWAM ", " \n" +
                "O Lord! Do provide such a cause for me that I may not be perturbed and perplexed; I may stand in need of my brothers and relatives (and acquaintances) Provide me sustenance without the obligation of Thy creatures; So that I may not have to leave Thy door and go to their. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData82() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" اَللّٰهُمَّ إِنِّي أَطَعْتُكَ فِي أَحَبِّ الْأَشْيَاءِ إِلَيْكَ وَ هُوَ التَّوْحِيْدُ، وَ لَمْ أَعْصِكَ فِي أَبْغَضِ الْأَشْيَاءِ إِلَيْكَ وَ هُوَ الْكُفْرُ، فَاغْفِرْ لِي مَا بَيْنَهُمَا، يَا مَنْ إِلَيْهِ مَفَرِّي آمِنِّي مِمَّا فَزِعْتُ مِنْهُ إِلَيْكَ. اَللّٰهُمَّ اغْفِرْ لِيَ الْكَثِيْرَ مِنْ مَعَاصِيْكَ، وَ اقْبَلْ مِنِّي الْيَسِيْرَ مِنْ طَاعَتِكَ\u200F، يَا عُدَّتِي دُوْنَ الْعُدَدِ، وَ يَا رَجَائِيْ وَ الْمُعْتَمَدَ، وَ يَا كَهْفِيْ وَ السَّنَدَ، وَ يَا وَاحِدُ يَا أَحَدُ، يَا قُلْ هُوَ اللَّهُ أَحَدٌ اَللَّهُ الصَّمَدُ لَمْ يَلِدْ وَ لَمْ يُوْلَدْ وَ لَمْ يَكُنْ لَهٗ كُفُواً أَحَدٌ، أَسْأَلُكَ بِحَقِّ مَنِ اصْطَفَيْتَهُمْ مِنْ خَلْقِكَ، وَ لَمْ تَجْعَلْ فِي خَلْقِكَ مِثْلَهُمْ أَحَداً، أَنْ تُصَلِّيَ عَلٰى مُحَمَّدٍ وَ آلِهٖ، وَ تَفْعَلَ بِي مَا أَنْتَ أَهْلُهٗ اَللّٰهُمَّ إِنِّي أَسْأَلُكَ بِالْوَحْدَانِيَّةِ الْكُبْرٰى، وَ الْمُحَمَّدِيَّةِ الْبَيْضَاءِ، وَ الْعَلَوِيَّةِ الْعُلْيَا، وَ بِجَمِيْعِ مَا احْتَجَجْتَ بِهٖ عَلٰى عِبَادِكَ، وَ بِالاِسْمِ الَّذِيْ حَجَبْتَهٗ عَنْ خَلْقِكَ فَلَمْ يَخْرُجْ مِنْكَ إِلاَّ إِلَيْكَ\u200F، صَلِّ عَلٰى مُحَمَّدٍ وَ آلِهٖ، وَ اجْعَلْ لِي مِنْ أَمْرِيْ فَرَجاً وَ مَخْرَجاً، وَ ارْزُقْنِيْ مِنْ حَيْثُ أَحْتَسِبُ وَ مِنْ حَيْثُ لاَ أَحْتَسِبُ، إِنَّكَ تَرْزُقُ مَنْ تَشَآءُ بِغَيْرِ حِسَابٍ. ", " ALLAAHUMMA INNEE A-TA'TOKA FEE AHABBIL ASHYAA-E ELAYKA WA HOWAT TAWHEED, WA LAM A-A'SEKA FEE ABGHAZIL ASHYAA-E ELAYKA WA HOWAL KUFR, FAGH-FIR LEE MAA BAYNAHOMAA, YAA MAN ELAYHE MAFARREE AAMINNEE MIMMAA FA-ZE'TO MINHO ELAYKA. ALLAAHUMMAGH FIR LEYAL KASEERA MIN MA-A'ASEEKA, WAQ-BAL MINNIL YASEERA MIN TA-A'TEKA, YAA U'DDATEE DOONAL O'DADE, WA YAA RAJAAA-EE WAL-MOA'TAMADA, WA YAA KAHFEE WAS-SANADA, WA YAA WAAHEDO YAA AHADO, YAA QUL HOWAL LAAHO AHADUN ALLAAHUS SAMADO LAM YALID WA LAM YOOLAD WA LAM YAKUN LAHU KOFOWAN AHAD, AS-ALOKA BE-HAQQE MANIS TAFAYTAHUM MIN KHALQEKA, WA LAM YAJ-A'L FEE KAHLQEKA MISLAHUM AHADAN, AN TOSALLEYA A'LAA MOHAMMADIN WA AALEHI, WA TAF-A'LA BEE MAA ANTA AHLOHU. ALLAAHUMMA INNEE AS-ALOKA BIL-WAHDAANIYYATIL KUBRAA, WAL-MOHAMMADIYYATIL BAYZAA, WAL-A'LAWIYYATIL U'LYAA, WA BE-JAMEE-E' MAH-TAJAJTA BEHI A'LAA E'BAADEKA, WA BIL-ISMIL LAZEE HAJABTAHU A'N KHALQEKA FALAM YAKHRUJ MINKA ILLAA ELAYKA,SALLE A'LAA MOHAMMADIN WA AALEHI, WAJ-A'L LEE MIN AMREE FARAJAN WA MAKHRAJAN, WAR-ZUQNEE MIN HAYSO AHTASEBO WA MIN HAYSO LAA AHTASEBO, INNAKA TARZOQO MAN TASHAAA-O BE-GHAYRE HESAAB. ", " \n" +
                "O Allah! I have been obedient to Thee in the matter most beloved to Thee and it is Thy Oneness and I have not been disobedient to Thee in the thing most hated by Thee and that is infidelity. So Forgive me whatever (I may have done) in between these two. O Thou! To whom I run (for protection), afford me safety against that from which I have fled to Thee. O Allah! Forgive me the great quantity of my sins and accept the small quantity of my obedience to Thee. O my provision against all provisions. O my Hope and object of confidence, O my shelter and support. O One, O Singular O (Thou about whom Quran Says) Say: He God is One (Alone), god the needless, He begetteth not, nor is He begotten. And there is none like unto Him. I beseech Thee by the right of those whom Thou hast chosen from among Thy creatures and did not make anyone like them in Thy creation that Thou send blessings on Muhammad and his descendants and deal with me as behooves Thee. O Allah! I have beseeched Thee through the great Oneness. The effulgent qualities of Muhammad and the sublime quality of all through all that with which Thou has rendered please before thy creatures and through the name which Thou has concealed from thy creatures so that it has not come out from Thee save towards Thee that Thou send blessings on Muhammad and his descendants and grant me relief and outlet in my affairs, and allow me livelihood from, where I expect and from where I don’t expect. Verily Thou giveth livelihood anyone Thou pleasest without accounting. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData83() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("اَللّٰهُمَّ رَبَّ السَّمَاوَاتِ السَّبْعِ وَ مَا بَيْنَهُنَّ وَ رَبَّ الْعَرْشِ الْعَظِيْمِ وَ رَبَّ جَبْرَئِيْلَ وَ مِيْكَـائِيْلَ وَ إِسْرَافِيْلَ وَ رَبَّ الْقُرْآنِ الْعَظِيْمِ وَ رَبَّ مُحَمَّدٍ خَاتَمِ النَّبِيِّيْنَ إِنِّي أَسْأَلُكَ بِالَّذِيْ تَقُوْمُ بِهِ السَّمَآءَ وَ بِهٖ تَقُوْمُ الْأَرْضَ وَ بِهٖ تُفَرِّقُ بَيْنَ الْجَمْعِ وَ بِهٖ تَجْمَعُ بَيْنَ الْمُتَفَرِّقِ وَ بِهٖ تَرْزُقُ الْأَحْيَآءَ وَ بِهٖ أَحْصَيْتَ عَدَدَ الرِّمَالِ وَ وَزْنَ الْجِبَالِ وَ كَيْلَ الْبُحُوْرِ.  ", " ALLAAHUMMA RABBAS SAMAAWAATIS SAB-E’ WA MAA BAYNAHUNNA WA RABBAL A’RSHIL A’ZEEME WA RABBA JABRA-EELA WA MEEKAA-EELA WA ISRAAFEELA WA RABBAL QUR-AANIL A’ZEEME WA RABBA MOHAMMADIN KHAATAMIN NABIYYEENA INNEE AS-ALOKA BIL-LAZEE TAQOOMO BEHIS SAMAAA-A WA BEHI TAQOOMUL ARZA WA BEHI TOFARREQO BAYNAL JAM-E’ WA BEHI TAJMA-O’ BAYNAL MOTAFARREQE WA BEHITARZOQUL AHYAAA-A WA BEHI AHSAYTA A’DADAR REMAALE WA WAZNAL JEBAALE WA KAYLAL BOHOORE. ", " ALLAAHUMMA RABBAS SAMAAWAATIS SAB-E’ WA MAA BAYNAHUNNA WA RABBAL A’RSHIL A’ZEEME WA RABBA JABRA-EELA WA MEEKAA-EELA WA ISRAAFEELA WA RABBAL QUR-AANIL A’ZEEME WA RABBA MOHAMMADIN KHAATAMIN NABIYYEENA INNEE AS-ALOKA BIL-LAZEE TAQOOMO BEHIS SAMAAA-A WA BEHI TAQOOMUL ARZA WA BEHI TOFARREQO BAYNAL JAM-E’ WA BEHI TAJMA-O’ BAYNAL MOTAFARREQE WA BEHITARZOQUL AHYAAA-A WA BEHI AHSAYTA A’DADAR REMAALE WA WAZNAL JEBAALE WA KAYLAL BOHOORE. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData84() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("اَللّٰهُمَّ اغْفِرْ لِيَ الْكَثِيْرَ مِنْ مَعَاصِيْكَ وَ اقْبَلْ مِنِّي الْيَسِيْرَ مِنْ طَاعَتِكَ.  ", " ALLAAHUMMAGH FIR LEYAL KASEERA MIN MA’SEEKA WAQBAL MINNIL YASEERA MIN TAA-A’TEKA. ", " \n" +
                "In the name of Allah the Beneficent the Merciful O Allah! Pardon my sins which are many, accept my prayers which are very little. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        dailyDuaSubListModel = new DailyDuaSubListModel("لَا إِلٰهَ إِلَّا اللَّهُ الْحَلِيْمُ الْكَرِيْمُ لَا إِلٰهَ إِلَّا اللَّهُ الْعَلِيُّ الْعَظِيْمُ سُبْحَانَ اللَّهِ رَبِّ السَّمَاوَاتِ السَّبْعِ وَ رَبِّ الْأَرَضِيْنَ السَّبْعِ وَ مَا فِيْهِنَّ وَ مَا بَيْنَهُنَّ وَ رَبِّ الْعَرْشِ الْعَظِيْمِ وَ الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِيْنَ.  ", " LAA ELAAHA ILLAL LAAHUL HALEEMUL KAREEMO LAA ELAAHA ILLAL LAAHUL A’LIYYUL A’ZEEMO SUBHAANAL LAAHE RABBIS SAMAAWAATIS SAB-E’ WA RABBIL ARAZEENAS SAB-E’ WA MAA FEEHINNA WA MAA BAYNAHUNNA WA RABBIL A’RSHIL A’ZEEM WAL-HAMDO LILLAAHE RABBIL A’ALAMEEN. ", "  In the name of Allah the Beneficent the Merciful. Except Allah, the Generous and Patient, there is no Lord except the Almighty and All wise Allah, there is no lord, Pure is that Allah Who is the Creator of the seven heavens and seven earths and all that is in them and between them. He is due to that God who is the Lord of all the creation.");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);

        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData85() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel(" بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. اَللّٰهُمَّ إِنَّا لَا نَعْلَمُ مِنْهُ إِلَّا خَيْراً وَ أَنْتَ أَعْلَمُ بِهٖ مِنَّا. ", "BISMILLAAHIR RAHMAANIR RAHEEM. ALLAAHUMMA INNAA LAA NA’LAMO MINHO ILLAA KHAYRAA WA ANTA A-A’LAMO BEHI MINNAA.  ",
                "In the name of Allah the Beneficent the Merciful. O Allah! We are only aware of the good deeds of this dead body but you know much more about its acts and deeds. Then God will answer, “I have accepted your evidence and have forgiven all those sins of his which you were not aware of and of which I had knowledge.” ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }
    private void prepareDuaSubData86() {
        DailyDuaSubListModel dailyDuaSubListModel = new DailyDuaSubListModel("بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ. اَللّٰهُمَّ رَبَّ هٰذِهِ الْأَرْوَاحِ الْفَانِيَةِ وَ الْأَجْسَادِ الْبَالِيَةِ وَ الْعِظَامِ النَّخِرَةِ الَّتِيْ خَرَجَتْ مِنَ الدُّنْيَا وَ هِيَ بِكَ مُؤْمِنَةٌ أَدْخِلْ عَلَيْهِمْ رَوْحاً مِنْكَ وَ سَلَاماً مِنِّيْ.  ", " BISMILLAAHIR RAHMAANIR RAHEEM. ALLAAHUMMA RABBA HAAZEHIL ARWAAHIL FAANEYATE WAL-AJSAADIL BAALEYATE WAL-E’ZAAMIN NAKHERATIL LATEE KHARAJAT MENAD DUNYAA WA HEYA BEKA MOAMENATUN ADKHIL A’LAYHIM RAWHAN MINKA WA SALAAMAN MINNEE. ", " \n" +
                "In the name of Allah the Beneficent the Merciful. O Allah the Lord of these souls that have left (this world) and these stale bodies and these rotten bones that have made and exit from this world in the state of having faith in thee, Grant them ease from Thyself and greeting from me. ");
        dailyDuaSubListModelList.add(dailyDuaSubListModel);
        mAdapter.notifyDataSetChanged();
    }


    @Override
    public void onPause() {
        if (daily_list_adView != null) {
            daily_list_adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (daily_list_adView != null) {
            daily_list_adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (daily_list_adView != null) {
            daily_list_adView.destroy();
        }
        super.onDestroy();
    }




}
