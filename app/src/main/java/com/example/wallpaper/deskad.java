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

public class deskad extends RecyclerView.Adapter<deskad.ViewHolder> {
    ArrayList<desk>dtw;
    public deskad(ArrayList<desk> dtw) {
        this.dtw = dtw;
    }
    public static boolean s = false;

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(s)
        {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder3,parent,false);
            return new ViewHolder(inflate);
        }
        else{
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder2,parent,false);
            return new ViewHolder(inflate);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        String picUrl="";
        if(!s){
            switch (position)
            {
                case 0:{
                    picUrl="d__15_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 1:{
                    picUrl="d__12_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 2:{
                    picUrl="d__13_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 3:{
                    picUrl="d__14_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 4:{
                    picUrl="d__10_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 5:{
                    picUrl="d__11_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 6:{
                    picUrl="viewd";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
            }
        }
        else{
            for(int i=0;i<43;i++)
            {
                if(position==(i-1)) {
                    picUrl = "d__" + (i) + "_";
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
                wall.num=1;
                Intent intent = new Intent (holder.itemView.getContext(), wall.class);
                intent.putExtra("object",dtw.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dtw.size();
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
