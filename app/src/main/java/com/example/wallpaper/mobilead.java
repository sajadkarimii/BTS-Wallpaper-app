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


public class mobilead extends RecyclerView.Adapter<mobilead.ViewHolder> {
    ArrayList<mobile>mbl;
    public mobilead(ArrayList<mobile> mbl) {
        this.mbl = mbl;
    }
    public static boolean s = false;

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(s)
        {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder5,parent,false);
            return new ViewHolder(inflate);
        }
        else {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder,parent,false);
            return new ViewHolder(inflate);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        String picUrl="";
        if(MainActivity.s)
        {
        switch (position) {
            case 0: {
                picUrl = "m__9_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.mbl_back));
                break;
            }
            case 1: {
                picUrl = "m__17_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.mbl_back));
                break;
            }
            case 2: {
                picUrl = "m__3_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.mbl_back));
                break;
            }
            case 3: {
                picUrl = "m__4_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.mbl_back));
                break;
            }
            case 4: {
                picUrl = "m__1_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.mbl_back));
                break;
            }
            case 5: {
                picUrl = "m__11_";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(), R.drawable.mbl_back));
                break;
            }
            case 6: {
                picUrl = "viewm";
                break;
            }
        }
        }
        else
        {
            for(int i=0;i<102;i++)
            {
                if(position==(i-1)) {
                    picUrl = "m__" + (i) + "_";
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
                wall.num = 4;
                Intent intent = new Intent(holder.itemView.getContext(), wall.class);
                intent.putExtra("objectm", mbl.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mbl.size();
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
