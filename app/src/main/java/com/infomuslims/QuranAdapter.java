package com.infomuslims;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.List;

/**
 * Created by renu on 12/08/17.
 */
public class QuranAdapter extends RecyclerView.Adapter<QuranAdapter.MyViewHolder> {

    private static final int FADE_DURATION = 1000;
    private List<QuranModel> quranModelList;
    static Context context;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, urdu, genre;
        public RelativeLayout rl_quran;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            urdu = (TextView) view.findViewById(R.id.urdu);
            rl_quran = (RelativeLayout) view.findViewById(R.id.rl_quran);

        }

    }


    public QuranAdapter(Context context,List<QuranModel> quranModelList) {
        this.quranModelList = quranModelList;
        this.context=context;
    }


    @Override
    public QuranAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quran_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final QuranAdapter.MyViewHolder holder, int position) {

        if((position%2)==0)
        {
            holder.rl_quran.setBackgroundColor(Color.parseColor("#F9F9F9"));

        }
        else if((position%2)!=0)
        {

            holder.rl_quran.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        final QuranModel quranModel = quranModelList.get(position);
        holder.title.setText(quranModel.getTitle());
        holder.genre.setText(quranModel.getGenre());
        holder.urdu.setText(quranModel.getUrdu());


        holder.rl_quran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = quranModel.getTitle().toString();
                System.out.print(str);

                System.out.print(context);
                Intent intent = new Intent(context, QuranSubListActivity.class);
                intent.putExtra("keyName", str);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


            }
        });

        setScaleAnimation(holder.itemView);
    }
    private void setFadeAnimation(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(FADE_DURATION);
        view.startAnimation(anim);
    }

    private void setScaleAnimation(View view) {
        ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim.setDuration(FADE_DURATION);
        view.startAnimation(anim);
    }

    @Override
    public int getItemCount() {
        return quranModelList.size();
    }


}
