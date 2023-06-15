package com.example.wallpaper;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class walls extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2,adapter3,adapter4;
    private RecyclerView recyclerView,recyclerView2,recyclerView3,recyclerView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walls);

        MainActivity.s = false;
        funcrun();
    }

    private void funcrun() {
        switch (wall.num)
        {
            case 4:
                recyclerView();
                break;
            case 3:
                recyclerViewl();
                break;
            case 2:
                recyclerViewp();
                break;
            case 1:
                recyclerViewd();
                break;
        }
    }

    private void recyclerView() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<mobile> mbl=new ArrayList<>();
        for (int i = 1;i<=102;i++)
        {
            mbl.add(new mobile(String.format("%s",i)));
        }


        adapter = new mobilead(mbl);
        recyclerView.setAdapter(adapter);
    }

    private void recyclerViewl() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView2=findViewById(R.id.recycler);
        recyclerView2.setLayoutManager(linearLayoutManager);

        ArrayList<lock> lsw=new ArrayList<>();
        for (int i = 1;i<=18;i++)
        {
            lsw.add(new lock(String.format("%s",i)));
        }

        adapter2 = new lockad(lsw);
        recyclerView2.setAdapter(adapter2);
    }

    private void recyclerViewp() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView3=findViewById(R.id.recycler);
        recyclerView3.setLayoutManager(linearLayoutManager);

        ArrayList<prof> pfw=new ArrayList<>();
        for (int i = 1;i<=21;i++)
        {
            pfw.add(new prof(String.format("%s",i)));
        }

        adapter3 = new profed(pfw);
        recyclerView3.setAdapter(adapter3);
    }

    private void recyclerViewd() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView4=findViewById(R.id.recycler);
        recyclerView4.setLayoutManager(linearLayoutManager);

        ArrayList<desk> dtw=new ArrayList<>();
        for (int i = 1;i<=43;i++)
        {
            dtw.add(new desk(String.format("%s",i)));
        }


        adapter4 = new deskad(dtw);
        recyclerView4.setAdapter(adapter4);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}