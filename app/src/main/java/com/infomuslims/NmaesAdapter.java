package com.infomuslims;

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
 * Created by renu on 15/08/17.
 */
public class NmaesAdapter extends RecyclerView.Adapter<NmaesAdapter.MyViewHolder> {

    private static final int FADE_DURATION =1000 ;
    private List<NamesModel> namesModelList;
    int count=0;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre, tv_list_names;
        public RelativeLayout rl_name;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title_names);
            genre = (TextView) view.findViewById(R.id.genre_names);
            year = (TextView) view.findViewById(R.id.urdu_names);
            tv_list_names = (TextView) view.findViewById(R.id.tv_list_names);
            rl_name = (RelativeLayout) view.findViewById(R.id.rl_name);
        }
    }


    public NmaesAdapter(List<NamesModel> namesModelList) {
        this.namesModelList = namesModelList;
    }


    @Override
    public NmaesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.names_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NmaesAdapter.MyViewHolder holder, int position) {


        if((position%2)==0)
        {
            holder.rl_name.setBackgroundColor(Color.parseColor("#F9F9F9"));

        }
        else if((position%2)!=0)
        {

            holder.rl_name.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        NamesModel namesModel = namesModelList.get(position);
        holder.title.setText(namesModel.getTitle_names());
        holder.genre.setText(namesModel.getGenre_names());
        holder.year.setText(namesModel.getUrdu_names());
        holder.tv_list_names.setText(namesModel.getCount());


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
        return namesModelList.size();
    }
}
