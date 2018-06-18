package com.infomuslims;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import java.util.List;

/**
 * Created by renu on 17/08/17.
 */
public class DailyDuaSubListAdapter extends RecyclerView.Adapter<DailyDuaSubListAdapter.MyViewHolder> {

    private List<DailyDuaSubListModel> dailyDuaSubListModelList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title_urdu, title_hindi, title_english;

        public MyViewHolder(View view) {
            super(view);
            title_urdu = (TextView) view.findViewById(R.id.tv_dua_urdu);
            title_hindi = (TextView) view.findViewById(R.id.tv_dua_hindi);
            title_english = (TextView) view.findViewById(R.id.tv_dua_english);
        }
    }


    public DailyDuaSubListAdapter(List<DailyDuaSubListModel> dailyDuaSubListModelList) {
        this.dailyDuaSubListModelList = dailyDuaSubListModelList;
    }


    @Override
    public DailyDuaSubListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.daily_dua_sublist, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DailyDuaSubListAdapter.MyViewHolder holder, int position) {

        DailyDuaSubListModel dailyDuaSubListModel = dailyDuaSubListModelList.get(position);
        holder.title_hindi.setText(dailyDuaSubListModel.getTitle_hindi());
        holder.title_urdu.setText(dailyDuaSubListModel.getTitle_urdu());
        holder.title_english.setText(dailyDuaSubListModel.getTitle_english());

    }

    @Override
    public int getItemCount() {
        return dailyDuaSubListModelList.size();
    }
}
