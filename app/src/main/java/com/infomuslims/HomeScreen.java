package com.infomuslims;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import static android.R.attr.button;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener{

    ImageView img_quran,img_names,img_holiday,img_dua,img_tasbih,img_duaRequest, img_menu_bar;
    private AdView quran_adView;
    InterstitialAd mInterstitialAd;
    AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // refer id's
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
        adRequest = new AdRequest.Builder().build();

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


        // on click listener
        clicLkListener();

    }


    // id's
    private void initializeId() {
        img_quran=(ImageView)findViewById(R.id.img_quran);
        img_names=(ImageView)findViewById(R.id.img_names);
        img_holiday=(ImageView)findViewById(R.id.img_holiday);
        img_dua=(ImageView)findViewById(R.id.img_dua);
        img_tasbih=(ImageView)findViewById(R.id.img_tasbih);
        img_duaRequest=(ImageView)findViewById(R.id.img_duaRequest);
        img_menu_bar=(ImageView)findViewById(R.id.img_menu_bar);
        quran_adView = (AdView) findViewById(R.id.home_adView);

    }

    private void clicLkListener() {
        img_quran.setOnClickListener(this);
        img_names.setOnClickListener(this);
        img_holiday.setOnClickListener(this);
        img_dua.setOnClickListener(this);
        img_tasbih.setOnClickListener(this);
        img_duaRequest.setOnClickListener(this);
        img_menu_bar.setOnClickListener(this);
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
        AlphaAnimation anim = new AlphaAnimation(1.0f, 0.0f);
        anim.setDuration(1000);
        anim.setRepeatCount(1);
        anim.setRepeatMode(Animation.REVERSE);
        img_quran.startAnimation(anim);
        img_names.startAnimation(anim);
        img_holiday.startAnimation(anim);
        img_dua.startAnimation(anim);
        img_tasbih.startAnimation(anim);
        img_duaRequest.startAnimation(anim);
    }

    @Override
    public void onDestroy() {
        if (quran_adView != null) {
            quran_adView.destroy();
        }
        super.onDestroy();
    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.img_quran:

                ConnectivityManager ConnectionManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = ConnectionManager.getActiveNetworkInfo();
                if (networkInfo != null && networkInfo.isConnected() == true) {
                    Intent intent = new Intent(HomeScreen.this,QuranActivity.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(HomeScreen.this, "Please check your internet connection", Toast.LENGTH_LONG).show();

                }


                break;

            case R.id.img_holiday:

                ConnectivityManager ConnectionManager1 = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo1 = ConnectionManager1.getActiveNetworkInfo();
                if (networkInfo1 != null && networkInfo1.isConnected() == true) {
                    Intent intent1 = new Intent(HomeScreen.this,MuslimHolidayActivity.class);
                    startActivity(intent1);

                } else {
                    Toast.makeText(HomeScreen.this, "Please check your internet connection", Toast.LENGTH_LONG).show();

                }

                break;

            case R.id.img_names:

                ConnectivityManager ConnectionManager2 = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo2 = ConnectionManager2.getActiveNetworkInfo();
                if (networkInfo2 != null && networkInfo2.isConnected() == true) {
                    Intent intent2 = new Intent(HomeScreen.this,NamesActivity.class);
                    startActivity(intent2);


                } else {
                    Toast.makeText(HomeScreen.this, "Please check your internet connection", Toast.LENGTH_LONG).show();

                }


                break;

            case R.id.img_tasbih:

                ConnectivityManager ConnectionManager3 = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo3 = ConnectionManager3.getActiveNetworkInfo();
                if (networkInfo3 != null && networkInfo3.isConnected() == true) {

                    Intent intent3 = new Intent(HomeScreen.this,TasbihActivity.class);
                    startActivity(intent3);


                } else {
                    Toast.makeText(HomeScreen.this, "Please check your internet connection", Toast.LENGTH_LONG).show();

                }

                break;

            case R.id.img_duaRequest:

                ConnectivityManager conn = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo network = conn.getActiveNetworkInfo();
                if (network != null && network.isConnected() == true) {
                    Intent intent4 = new Intent(HomeScreen.this,PrayerRequestActivity.class);
                    startActivity(intent4);


                } else {
                    Toast.makeText(HomeScreen.this, "Please check your internet connection", Toast.LENGTH_LONG).show();

                }

                break;

            case R.id.img_dua:

                ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo4 = connectivityManager.getActiveNetworkInfo();
                if (networkInfo4 != null && networkInfo4.isConnected() == true) {
                    Intent intent5 = new Intent(HomeScreen.this,DailyDuaActivity.class);
                    startActivity(intent5);

                } else {
                    Toast.makeText(HomeScreen.this, "Please check your internet connection", Toast.LENGTH_LONG).show();

                }



                break;

            case R.id.img_menu_bar:
                final Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.menu_dialog);

                //initialize Id's
                TextView  tv_share = (TextView) dialog.findViewById(R.id.tv_share);
                TextView  tv_rate = (TextView) dialog.findViewById(R.id.tv_rate);
                TextView  tv_contact = (TextView) dialog.findViewById(R.id.tv_contact);
                TextView  tv_notify = (TextView) dialog.findViewById(R.id.tv_notify);

                ImageView img_close = (ImageView)dialog.findViewById(R.id.img_close);
                img_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });

                // share click listener
                tv_share.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       /* Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Info Muslims");
                        sharingIntent.putExtra(Intent.EXTRA_TEXT,"http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName());
                        startActivity(Intent.createChooser(sharingIntent, "Share Via"));
                        */
                        try {
                            Intent i = new Intent(Intent.ACTION_SEND);
                            i.setType("text/plain");
                            i.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.app_name));;
                            i.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName());
                            startActivity(Intent.createChooser(i, "Share Via"));
                        } catch(Exception e) {
                            //e.toString();
                        }
                        dialog.dismiss();
                    }
                });


                // rate click listener
                tv_rate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri uri = Uri.parse("market://details?id=" + getApplicationContext().getPackageName());
                        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                        // To count with Play market backstack, After pressing back button,
                        // to taken back to our application, we need to add following flags to intent.
                        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        try {
                            startActivity(goToMarket);
                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName())));
                        }
                        dialog.dismiss();
                    }
                });


                // contact click listener
                tv_contact.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent iContact = new Intent(HomeScreen.this , ContactActivity.class);
                        startActivity(iContact);
                        dialog.dismiss();

                    }
                });

                // notification click listener
                tv_notify.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent iNotify = new Intent(HomeScreen.this , NotificationActivity.class);
                        startActivity(iNotify);
                        dialog.dismiss();

                    }
                });

                dialog.show();

                break;
        }
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_dialog);

        Button btn_ok = (Button) dialog.findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View view) {
                (HomeScreen.this).finishAffinity();
            }
        });

        Button btn_cancel = (Button) dialog.findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
