package com.infomuslims;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

/**
 * Created by renu on 16/08/17.
 */
public class QuranSubTabAdapter extends RecyclerView.Adapter<QuranSubTabAdapter.MyViewHolder> {

private List<QuranSubTabModel> quranSubTabModelList;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView title, urdu;

    public MyViewHolder(View view) {
        super(view);
        title = (TextView) view.findViewById(R.id.tv_quran_urdu);
        urdu = (TextView) view.findViewById(R.id.tv_quran_hindi);
    }
}


    public QuranSubTabAdapter(List<QuranSubTabModel> quranSubTabModelList) {
        this.quranSubTabModelList = quranSubTabModelList;
    }


    @Override
    public QuranSubTabAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quran_subtab_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(QuranSubTabAdapter.MyViewHolder holder, int position) {

        QuranSubTabModel quranSubTabModel = quranSubTabModelList.get(position);
        holder.title.setText(quranSubTabModel.getTitle_hindi());
        holder.urdu.setText(quranSubTabModel.getTitle_urdu());

    }

    @Override
    public int getItemCount() {
        return quranSubTabModelList.size();
    }
}
