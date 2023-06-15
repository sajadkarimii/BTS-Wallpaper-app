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

public class lockad extends RecyclerView.Adapter<lockad.ViewHolder> {
    ArrayList<lock>lsw;

    public lockad(ArrayList<lock> lsw) {
        this.lsw = lsw;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(mobilead.s) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder5, parent, false);
            return new ViewHolder(inflate);
        }
        else
        {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder, parent, false);
            return new ViewHolder(inflate);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        String picUrl="";
        if(!mobilead.s){
            switch (position)
            {
                case 0:{
                    picUrl="l__3_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 1:{
                    picUrl="l__15_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 2:{
                    picUrl="l__1_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 3:{
                    picUrl="l__4_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 4:{
                    picUrl="l__14_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 5:{
                    picUrl="l__11_";
                    holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.mbl_back));
                    break;
                }
                case 6:{
                    picUrl="viewm";
                    break;
                }
            }
        }
        else{
            for(int i=0;i<18;i++) {
                if (position == (i - 1)) {
                    picUrl = "l__" + (i) + "_";
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
                wall.num =3;
                Intent intent = new Intent (holder.itemView.getContext(), wall.class);
                intent.putExtra("objectp",lsw.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lsw.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView pic;
        ConstraintLayout mainLayout;
        ImageButton butt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pic=itemView.findViewById(R.id.first);
            butt=itemView.findViewById(R.id.first);
            mainLayout=itemView.findViewById(R.id.dsds);
        }
    }

}
