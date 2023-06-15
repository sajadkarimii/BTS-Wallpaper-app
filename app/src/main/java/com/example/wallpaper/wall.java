package com.example.wallpaper;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.io.IOException;

public class wall extends AppCompatActivity {
    public static int num;

    private ImageView pic;
    private desk object;
    private prof objects;
    private lock objectp;
    private mobile objectm;
    private int source;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wall);

        initview();
        getpack();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void getpack() {
        switch (num)
        {
            case 1:
                object= (desk) getIntent().getSerializableExtra("object");
                int drawd = this.getResources().getIdentifier(object.getPic(),"drawable",this.getPackageName());
                if(MainActivity.s) {
                    switch (drawd) {
                        case 1:
                            source = R.drawable.d__15_;
                            break;
                        case 2:
                            source = R.drawable.d__12_;
                            break;
                        case 3:
                            source = R.drawable.d__13_;
                            break;
                        case 4:
                            source = R.drawable.d__14_;
                            break;
                        case 5:
                            source = R.drawable.d__10_;
                            break;
                        case 6:
                            source = R.drawable.d__11_;
                            break;
                        case 7:
                            deskad.s = true;
                            Intent intent = new Intent(wall.this, walls.class);
                            startActivity(intent);
                            break;
                    }
                }
                else
                {
                    switch (drawd) {
                        case 1:
                            source = R.drawable.d__1_;
                            break;
                        case 2:
                            source = R.drawable.d__2_;
                            break;
                        case 3:
                            source = R.drawable.d__3_;
                            break;
                        case 4:
                            source = R.drawable.d__4_;
                            break;
                        case 5:
                            source = R.drawable.d__5_;
                            break;
                        case 6:
                            source = R.drawable.d__6_;
                            break;
                        case 7:
                            source = R.drawable.d__7_;
                            break;
                        case 8:
                            source = R.drawable.d__8_;
                            break;
                        case 9:
                            source = R.drawable.d__9_;
                            break;
                        case 10:
                            source = R.drawable.d__10_;
                            break;
                        case 11:
                            source = R.drawable.d__11_;
                            break;
                        case 12:
                            source = R.drawable.d__12_;
                            break;
                        case 13:
                            source = R.drawable.d__13_;
                            break;
                        case 14:
                            source = R.drawable.d__14_;
                            break;
                        case 15:
                            source = R.drawable.d__15_;
                            break;
                        case 16:
                            source = R.drawable.d__16_;
                            break;
                        case 17:
                            source = R.drawable.d__17_;
                            break;
                        case 18:
                            source = R.drawable.d__18_;
                            break;
                        case 19:
                            source = R.drawable.d__19_;
                            break;
                        case 20:
                            source = R.drawable.d__20_;
                            break;
                        case 21:
                            source = R.drawable.d__21_;
                            break;
                        case 22:
                            source = R.drawable.d__22_;
                            break;
                        case 23:
                            source = R.drawable.d__23_;
                            break;
                        case 24:
                            source = R.drawable.d__24_;
                            break;
                        case 25:
                            source = R.drawable.d__25_;
                            break;
                        case 26:
                            source = R.drawable.d__26_;
                            break;
                        case 27:
                            source = R.drawable.d__27_;
                            break;
                        case 28:
                            source = R.drawable.d__28_;
                            break;
                        case 29:
                            source = R.drawable.d__29_;
                            break;
                        case 30:
                            source = R.drawable.d__30_;
                            break;
                        case 31:
                            source = R.drawable.d__31_;
                            break;
                        case 32:
                            source = R.drawable.d__32_;
                            break;
                        case 33:
                            source = R.drawable.d__33_;
                            break;
                        case 34:
                            source = R.drawable.d__34_;
                            break;
                        case 35:
                            source = R.drawable.d__35_;
                            break;
                        case 36:
                            source = R.drawable.d__36_;
                            break;
                        case 37:
                            source = R.drawable.d__37_;
                            break;
                        case 38:
                            source = R.drawable.d__38_;
                            break;
                        case 39:
                            source = R.drawable.d__39_;
                            break;
                        case 40:
                            source = R.drawable.d__40_;
                            break;
                        case 41:
                            source = R.drawable.d__41_;
                            break;
                        case 42:
                            source = R.drawable.d__42_;
                            break;
                        case 43:
                            source = R.drawable.d__43_;
                            break;
                    }
                }
                Glide.with(this)
                        .load(source)
                        .into(pic);
                break;
            case 2:
                objects= (prof) getIntent().getSerializableExtra("objects");
                int drawp = this.getResources().getIdentifier(objects.getPic(),"drawable",this.getPackageName());
                if(MainActivity.s) {
                    switch (drawp) {
                        case 1:
                            source = R.drawable.p__2_;
                            break;
                        case 2:
                            source = R.drawable.p__3_;
                            break;
                        case 3:
                            source = R.drawable.p__4_;
                            break;
                        case 4:
                            source = R.drawable.p__5_;
                            break;
                        case 5:
                            source = R.drawable.p__6_;
                            break;
                        case 6:
                            source = R.drawable.p__7_;
                            break;
                        case 7:
                            profed.s = true;
                            Intent intent = new Intent(wall.this, walls.class);
                            startActivity(intent);
                            break;
                    }
                }
                else
                {
                    switch (drawp) {
                        case 1:
                            source = R.drawable.p__1_;
                            break;
                        case 2:
                            source = R.drawable.p__2_;
                            break;
                        case 3:
                            source = R.drawable.p__3_;
                            break;
                        case 4:
                            source = R.drawable.p__4_;
                            break;
                        case 5:
                            source = R.drawable.p__5_;
                            break;
                        case 6:
                            source = R.drawable.p__6_;
                            break;
                        case 7:
                            source = R.drawable.p__7_;
                            break;
                        case 8:
                            source = R.drawable.p__8_;
                            break;
                        case 9:
                            source = R.drawable.p__9_;
                            break;
                        case 10:
                            source = R.drawable.p__10_;
                            break;
                        case 11:
                            source = R.drawable.p__11_;
                            break;
                        case 12:
                            source = R.drawable.p__12_;
                            break;
                        case 13:
                            source = R.drawable.p__13_;
                            break;
                        case 14:
                            source = R.drawable.p__14_;
                            break;
                        case 15:
                            source = R.drawable.p__15_;
                            break;
                        case 16:
                            source = R.drawable.p__16_;
                            break;
                        case 17:
                            source = R.drawable.p__17_;
                            break;
                        case 18:
                            source = R.drawable.p__18_;
                            break;
                        case 19:
                            source = R.drawable.p__19_;
                            break;
                        case 20:
                            source = R.drawable.p__20_;
                            break;
                        case 21:
                            source = R.drawable.p__21_;
                            break;
                    }
                }
                Glide.with(this)
                        .load(source)
                        .into(pic);
                break;
            case 3:
                objectp= (lock) getIntent().getSerializableExtra("objectp");
                int drawl = this.getResources().getIdentifier(objectp.getPic(),"drawable",this.getPackageName());
                if(MainActivity.s) {
                    switch (drawl) {
                        case 1:
                            source = R.drawable.l__3_;
                            break;
                        case 2:
                            source = R.drawable.l__15_;
                            break;
                        case 3:
                            source = R.drawable.l__1_;
                            break;
                        case 4:
                            source = R.drawable.l__4_;
                            break;
                        case 5:
                            source = R.drawable.l__14_;
                            break;
                        case 6:
                            source = R.drawable.l__11_;
                            break;
                        case 7:
                            mobilead.s = true;
                            Intent intent = new Intent(wall.this, walls.class);
                            startActivity(intent);
                            break;
                    }
                }
                else {
                    switch (drawl) {
                        case 1:
                            source = R.drawable.l__1_;
                            break;
                        case 2:
                            source = R.drawable.l__2_;
                            break;
                        case 3:
                            source = R.drawable.l__3_;
                            break;
                        case 4:
                            source = R.drawable.l__4_;
                            break;
                        case 5:
                            source = R.drawable.l__5_;
                            break;
                        case 6:
                            source = R.drawable.l__6_;
                            break;
                        case 7:
                            source = R.drawable.l__7_;
                            break;
                        case 8:
                            source = R.drawable.l__8_;
                            break;
                        case 9:
                            source = R.drawable.l__9_;
                            break;
                        case 10:
                            source = R.drawable.l__10_;
                            break;
                        case 11:
                            source = R.drawable.l__11_;
                            break;
                        case 12:
                            source = R.drawable.l__12_;
                            break;
                        case 13:
                            source = R.drawable.l__13_;
                            break;
                        case 14:
                            source = R.drawable.l__14_;
                            break;
                        case 15:
                            source = R.drawable.l__15_;
                            break;
                        case 16:
                            source = R.drawable.l__16_;
                            break;
                        case 17:
                            source = R.drawable.l__17_;
                            break;
                        case 18:
                            source = R.drawable.l__18_;
                            break;
                }
                }
                Glide.with(this)
                        .load(source)
                        .into(pic);
                break;
            case 4:
                objectm= (mobile) getIntent().getSerializableExtra("objectm");
                int drawm = this.getResources().getIdentifier(objectm.getPic(),"drawable",this.getPackageName());
                if(MainActivity.s) {
                    switch (drawm) {
                        case 1:
                            source = R.drawable.m__9_;
                            break;
                        case 2:
                            source = R.drawable.m__17_;
                            break;
                        case 3:
                            source = R.drawable.m__3_;
                            break;
                        case 4:
                            source = R.drawable.m__4_;
                            break;
                        case 5:
                            source = R.drawable.m__1_;
                            break;
                        case 6:
                            source = R.drawable.m__11_;
                            break;
                        case 7:
                            mobilead.s = true;
                            Intent intent = new Intent(wall.this, walls.class);
                            startActivity(intent);
                            break;
                    }
                }
                else{
                    switch (drawm) {
                        case 1:
                            source = R.drawable.m__1_;
                            break;
                        case 2:
                            source = R.drawable.m__2_;
                            break;
                        case 3:
                            source = R.drawable.m__3_;
                            break;
                        case 4:
                            source = R.drawable.m__4_;
                            break;
                        case 5:
                            source = R.drawable.m__5_;
                            break;
                        case 6:
                            source = R.drawable.m__6_;
                            break;
                        case 7:
                            source = R.drawable.m__7_;
                            break;
                        case 8:
                            source = R.drawable.m__8_;
                            break;
                        case 9:
                            source = R.drawable.m__9_;
                            break;
                        case 10:
                            source = R.drawable.m__10_;
                            break;
                        case 11:
                            source = R.drawable.m__11_;
                            break;
                        case 12:
                            source = R.drawable.m__12_;
                            break;
                        case 13:
                            source = R.drawable.m__13_;
                            break;
                        case 14:
                            source = R.drawable.m__14_;
                            break;
                        case 15:
                            source = R.drawable.m__15_;
                            break;
                        case 16:
                            source = R.drawable.m__16_;
                            break;
                        case 17:
                            source = R.drawable.m__17_;
                            break;
                        case 18:
                            source = R.drawable.m__18_;
                            break;
                        case 19:
                            source = R.drawable.m__19_;
                            break;
                        case 20:
                            source = R.drawable.m__20_;
                            break;
                        case 21:
                            source = R.drawable.m__21_;
                            break;
                        case 22:
                            source = R.drawable.m__22_;
                            break;
                        case 23:
                            source = R.drawable.m__23_;
                            break;
                        case 24:
                            source = R.drawable.m__24_;
                            break;
                        case 25:
                            source = R.drawable.m__25_;
                            break;
                        case 26:
                            source = R.drawable.m__26_;
                            break;
                        case 27:
                            source = R.drawable.m__27_;
                            break;
                        case 28:
                            source = R.drawable.m__28_;
                            break;
                        case 29:
                            source = R.drawable.m__29_;
                            break;
                        case 30:
                            source = R.drawable.m__30_;
                            break;
                        case 31:
                            source = R.drawable.m__31_;
                            break;
                        case 32:
                            source = R.drawable.m__32_;
                            break;
                        case 33:
                            source = R.drawable.m__33_;
                            break;
                        case 34:
                            source = R.drawable.m__34_;
                            break;
                        case 35:
                            source = R.drawable.m__35_;
                            break;
                        case 36:
                            source = R.drawable.m__36_;
                            break;
                        case 37:
                            source = R.drawable.m__37_;
                            break;
                        case 38:
                            source = R.drawable.m__38_;
                            break;
                        case 39:
                            source = R.drawable.m__39_;
                            break;
                        case 40:
                            source = R.drawable.m__40_;
                            break;
                        case 41:
                            source = R.drawable.m__41_;
                            break;
                        case 42:
                            source = R.drawable.m__42_;
                            break;
                        case 43:
                            source = R.drawable.m__43_;
                            break;
                        case 44:
                            source = R.drawable.m__44_;
                            break;
                        case 45:
                            source = R.drawable.m__45_;
                            break;
                        case 46:
                            source = R.drawable.m__46_;
                            break;
                        case 47:
                            source = R.drawable.m__47_;
                            break;
                        case 48:
                            source = R.drawable.m__48_;
                            break;
                        case 49:
                            source = R.drawable.m__49_;
                            break;
                        case 50:
                            source = R.drawable.m__50_;
                            break;
                        case 51:
                            source = R.drawable.m__51_;
                            break;
                        case 52:
                            source = R.drawable.m__52_;
                            break;
                        case 53:
                            source = R.drawable.m__53_;
                            break;
                        case 54:
                            source = R.drawable.m__54_;
                            break;
                        case 55:
                            source = R.drawable.m__55_;
                            break;
                        case 56:
                            source = R.drawable.m__56_;
                            break;
                        case 57:
                            source = R.drawable.m__57_;
                            break;
                        case 58:
                            source = R.drawable.m__58_;
                            break;
                        case 59:
                            source = R.drawable.m__59_;
                            break;
                        case 60:
                            source = R.drawable.m__60_;
                            break;
                        case 61:
                            source = R.drawable.m__61_;
                            break;
                        case 62:
                            source = R.drawable.m__62_;
                            break;
                        case 63:
                            source = R.drawable.m__63_;
                            break;
                        case 64:
                            source = R.drawable.m__64_;
                            break;
                        case 65:
                            source = R.drawable.m__65_;
                            break;
                        case 66:
                            source = R.drawable.m__66_;
                            break;
                        case 67:
                            source = R.drawable.m__67_;
                            break;
                        case 68:
                            source = R.drawable.m__68_;
                            break;
                        case 69:
                            source = R.drawable.m__69_;
                            break;
                        case 70:
                            source = R.drawable.m__70_;
                            break;
                        case 71:
                            source = R.drawable.m__71_;
                            break;
                        case 72:
                            source = R.drawable.m__72_;
                            break;
                        case 73:
                            source = R.drawable.m__73_;
                            break;
                        case 74:
                            source = R.drawable.m__74_;
                            break;
                        case 75:
                            source = R.drawable.m__75_;
                            break;
                        case 76:
                            source = R.drawable.m__76_;
                            break;
                        case 77:
                            source = R.drawable.m__77_;
                            break;
                        case 78:
                            source = R.drawable.m__78_;
                            break;
                        case 79:
                            source = R.drawable.m__79_;
                            break;
                        case 80:
                            source = R.drawable.m__80_;
                            break;
                        case 81:
                            source = R.drawable.m__81_;
                            break;
                        case 82:
                            source = R.drawable.m__82_;
                            break;
                        case 83:
                            source = R.drawable.m__83_;
                            break;
                        case 84:
                            source = R.drawable.m__84_;
                            break;
                        case 85:
                            source = R.drawable.m__85_;
                            break;
                        case 86:
                            source = R.drawable.m__86_;
                            break;
                        case 87:
                            source = R.drawable.m__87_;
                            break;
                        case 88:
                            source = R.drawable.m__88_;
                            break;
                        case 89:
                            source = R.drawable.m__89_;
                            break;
                        case 90:
                            source = R.drawable.m__90_;
                            break;
                        case 91:
                            source = R.drawable.m__91_;
                            break;
                        case 92:
                            source = R.drawable.m__92_;
                            break;
                        case 93:
                            source = R.drawable.m__93_;
                            break;
                        case 94:
                            source = R.drawable.m__94_;
                            break;
                        case 95:
                            source = R.drawable.m__95_;
                            break;
                        case 96:
                            source = R.drawable.m__96_;
                            break;
                        case 97:
                            source = R.drawable.m__97_;
                            break;
                        case 98:
                            source = R.drawable.m__98_;
                            break;
                        case 99:
                            source = R.drawable.m__99_;
                            break;
                        case 100:
                            source = R.drawable.m__100_;
                            break;
                        case 101:
                            source = R.drawable.m__101_;
                            break;
                        case 102:
                            source = R.drawable.m__102_;
                            break;
                    }
                }
                Glide.with(this)
                        .load(source)
                        .into(pic);
                break;
        }
    }


    public void setwallpaper (View view){
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),source);
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this,"wallpaper changed successfuly ", Toast.LENGTH_SHORT).show();
        }
        catch (IOException e){
            Toast.makeText(this,"wallpaper don't changed successfuly",Toast.LENGTH_SHORT).show();
        }
    }

    public void back (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void download (View view){

    }


    private void initview() {
        pic = findViewById(R.id.imageView);
    }

}