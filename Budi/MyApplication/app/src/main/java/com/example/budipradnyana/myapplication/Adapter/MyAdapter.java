package com.example.budipradnyana.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.budipradnyana.myapplication.DetailActivity;
import com.example.budipradnyana.myapplication.Model.Mahasiswa;
import com.example.budipradnyana.myapplication.R;

import java.util.List;

/**
 * Created by Budi Pradnyana on 10/27/2016.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    List<Mahasiswa> mhsList;
    Context context;

    public MyAdapter(List<Mahasiswa> mhsList, Context context) {
        this.mhsList = mhsList;
        this.context = context;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mhsimg;
        TextView mhsnama,mhsnim;

        public ViewHolder(View itemView) {
            super(itemView);
            mhsimg = (ImageView) itemView.findViewById(R.id.mhsimg);
            mhsnama = (TextView) itemView.findViewById(R.id.mhsnama);
            mhsnim = (TextView) itemView.findViewById(R.id.mhsnim);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(context).inflate(R.layout.content_scrolling, parent, false);
        ViewHolder viewHolder = new ViewHolder(layout);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Mahasiswa data = mhsList.get(position);
        holder.mhsnama.setText(data.getNama());
        holder.mhsnim.setText(data.getNim());
        Glide.with(context).load(data.getFoto()).centerCrop().into(holder.mhsimg);
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, DetailActivity.class);
                pindah.putExtra("name",data.getNama());
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mhsList.size();
    }
}
