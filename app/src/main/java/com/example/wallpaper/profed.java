package com.example.wallpaper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class profed extends RecyclerView.Adapter<profed.ViewHolder> {
    ArrayList<prof>pfw;
    public profed(ArrayList<prof> pfw) {
        this.pfw = pfw;
    }
    public static boolean s = false;

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(s) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder4, parent, false);
            return new ViewHolder(inflate);
        }
        else
        {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder1, parent, false);
            return new ViewHolder(inflate);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        String picUrl="";
        if(MainActivity.s)
        {
        switch (position)
        {
            case 0:{
                picUrl="p__2_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                break;
            }
            case 1:{
                picUrl="p__3_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                break;
            }
            case 2:{
                picUrl="p__4_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                break;
            }
            case 3:{
                picUrl="p__5_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                break;
            }
            case 4:{
                picUrl="p__6_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                break;
            }
            case 5:{
                picUrl="p__7_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                break;
            }
            case 6:{
                picUrl="viewp";
                break;
            }
        }
        }
        else
        {
            for(int i=0;i<21;i++)
            {
                if(position==(i-1)) {
                    picUrl = "p__" + (i) + "_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.mbl_back));
                }
            }
        }
        int draw=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(draw)
                .into(holder.pic);

        holder.butt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                wall.num =2;
                Intent intent = new Intent (holder.itemView.getContext(), wall.class);
                intent.putExtra("objects",pfw.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pfw.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView pic;
        ImageButton butt;
        ConstraintLayout mainLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pic=itemView.findViewById(R.id.first);
            butt=itemView.findViewById(R.id.first);
            mainLayout=itemView.findViewById(R.id.dsds);
        }
    }
}
