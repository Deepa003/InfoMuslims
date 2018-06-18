package com.infomuslims;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;



import java.util.List;

/**
 * Created by renu on 26/08/17.
 */
public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.MyViewHolder> {
    public Context context;
    private List<NotificationModel> notificationModelList;
    Intent intent;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, message, time;
        public ImageView img_notify;
        public RelativeLayout notification_item;


        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tv_title);
            message = (TextView) view.findViewById(R.id.tv_msg);
            time = (TextView) view.findViewById(R.id.tv_time);
            img_notify= (ImageView) view.findViewById(R.id.img_notify);
            notification_item = (RelativeLayout) view.findViewById(R.id.notification_item);


        }
    }


    public NotificationAdapter(List<NotificationModel> notificationModelList, Context context) {
        this.notificationModelList = notificationModelList;
        this.context=context;
    }


    @Override
    public NotificationAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final NotificationAdapter.MyViewHolder holder, final int position) {


        NotificationModel notificationModel = notificationModelList.get(position);
        holder.title.setText(notificationModel.getTitle());
        holder.message.setText(notificationModel.getMessage());
        holder.time.setText(notificationModel.getDate_time());
        String openActivity=notificationModel.getOpenActivity();
        if(openActivity.equals("1"))
        {
            holder.img_notify.setImageResource(R.drawable.quran_icon);

        }else if(openActivity.equals("2"))
        {

            holder.img_notify.setImageResource(R.drawable.names_icon);
        }
        else if(openActivity.equals("3"))
        {
            holder.img_notify.setImageResource(R.drawable.holiday_icon);
        }else if(openActivity.equals("4"))
        {

            holder.img_notify.setImageResource(R.drawable.dailydua);
        }else if(openActivity.equals("5"))
        {

            holder.img_notify.setImageResource(R.drawable.tasbih_icon);
        }else if(openActivity.equals("6"))
        {
            holder.img_notify.setImageResource(R.drawable.duarequest_icon);
        }
        else
        {
            holder.img_notify.setImageDrawable(context.getResources().getDrawable(R.drawable.notification));
        }

        holder.notification_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NotificationModel notificationModel = notificationModelList.get(position);
                String openActivity=notificationModel.getOpenActivity();
                if(openActivity.equals("1"))
                {
                    intent=new Intent(context,QuranActivity.class);

                }else if(openActivity.equals("2"))
                {
                    intent=new Intent(context,NamesActivity.class);
                }
                else if(openActivity.equals("3"))
                {
                    intent=new Intent(context,MuslimHolidayActivity.class);
                }else if(openActivity.equals("4"))
                {
                    intent=new Intent(context,DailyDuaActivity.class);
                }else if(openActivity.equals("5"))
                {
                    intent=new Intent(context,TasbihActivity.class);
                }else if(openActivity.equals("6"))
                {
                    intent=new Intent(context,PrayerRequestActivity.class);
                }
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return notificationModelList.size();
    }
}
