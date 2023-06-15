package com.example.wallpaper;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2,adapter3,adapter4;
    private RecyclerView recyclerView,recyclerView2,recyclerView3,recyclerView4;

    public static boolean s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView();
        recyclerViewl();
        recyclerViewp();
        recyclerViewd();
        s = true;
        profed.s = false;
        deskad.s = false;
        mobilead.s = false;

    }

    private void recyclerView() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<mobile> mbl=new ArrayList<>();
        mbl.add(new mobile("1"));
        mbl.add(new mobile("2"));
        mbl.add(new mobile("3"));
        mbl.add(new mobile("4"));
        mbl.add(new mobile("5"));
        mbl.add(new mobile("6"));
        mbl.add(new mobile("7"));

        adapter = new mobilead(mbl);
        recyclerView.setAdapter(adapter);
    }

    private void recyclerViewl() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView2=findViewById(R.id.recyclerView2);
        recyclerView2.setLayoutManager(linearLayoutManager);

        ArrayList<lock> lsw=new ArrayList<>();
        lsw.add(new lock("1"));
        lsw.add(new lock("2"));
        lsw.add(new lock("3"));
        lsw.add(new lock("4"));
        lsw.add(new lock("5"));
        lsw.add(new lock("6"));
        lsw.add(new lock("7"));

        adapter2 = new lockad(lsw);
        recyclerView2.setAdapter(adapter2);
    }

    private void recyclerViewp() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView3=findViewById(R.id.recyclerView3);
        recyclerView3.setLayoutManager(linearLayoutManager);

        ArrayList<prof> pfw=new ArrayList<>();
        pfw.add(new prof("1"));
        pfw.add(new prof("2"));
        pfw.add(new prof("3"));
        pfw.add(new prof("4"));
        pfw.add(new prof("5"));
        pfw.add(new prof("6"));
        pfw.add(new prof("7"));

        adapter3 = new profed(pfw);
        recyclerView3.setAdapter(adapter3);
    }

    private void recyclerViewd() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView4=findViewById(R.id.recyclerView4);
        recyclerView4.setLayoutManager(linearLayoutManager);

        ArrayList<desk> dtw=new ArrayList<>();
        dtw.add(new desk("1"));
        dtw.add(new desk("2"));
        dtw.add(new desk("3"));
        dtw.add(new desk("4"));
        dtw.add(new desk("5"));
        dtw.add(new desk("6"));
        dtw.add(new desk("7"));

        adapter4 = new deskad(dtw);
        recyclerView4.setAdapter(adapter4);
    }
}