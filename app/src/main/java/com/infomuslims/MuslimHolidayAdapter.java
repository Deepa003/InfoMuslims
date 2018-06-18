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
 * Created by renu on 13/08/17.
 */
public class MuslimHolidayAdapter extends RecyclerView.Adapter<MuslimHolidayAdapter.MyViewHolder> {

    private static final int FADE_DURATION = 1000;
    private List<MuslimHolidayModel> muslimHolidayModelList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title_holiday, date_holiday;
        public RelativeLayout rl_holiday;

        public MyViewHolder(View view) {
            super(view);
            title_holiday = (TextView) view.findViewById(R.id.title_holiday);
            date_holiday = (TextView) view.findViewById(R.id.date_holiday);
            rl_holiday = (RelativeLayout) view.findViewById(R.id.rl_holiday);
        }
    }


    public MuslimHolidayAdapter(List<MuslimHolidayModel> muslimHolidayModelList) {
        this.muslimHolidayModelList = muslimHolidayModelList;
    }


    @Override
    public MuslimHolidayAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.muslim_holiday_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MuslimHolidayAdapter.MyViewHolder holder, int position) {

        if((position%2)==0)
        {
            holder.rl_holiday.setBackgroundColor(Color.parseColor("#F9F9F9"));

        }
        else if((position%2)!=0)
        {

            holder.rl_holiday.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        MuslimHolidayModel muslimHolidayModel = muslimHolidayModelList.get(position);
        holder.title_holiday.setText(muslimHolidayModel.getTitle_holiday());
        holder.date_holiday.setText(muslimHolidayModel.getDate_holiday());

        setFadeAnimation(holder.itemView);
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
        return muslimHolidayModelList.size();
    }
}
