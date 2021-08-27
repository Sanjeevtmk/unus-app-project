package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.madproject.R;
import com.example.madproject.SanjeevAdapter2;

public class notes_module extends AppCompatActivity {
    ListView listview;
    String arr[]={"Quantam Physics","Digital Electronics","Computer Architecture","Programming","Data Structures","Algorithms","Operating System","Database Management","Computrer Networks","Theroy of Commputation","Compiler Design"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_module);
        listview=findViewById(R.id.listview);
        SanjeevAdapter2 ad= new SanjeevAdapter2(this,R.layout.sanjeevlayout,arr);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1kGuHZ__GC3NwZINCkMD2f2BvLsqmFnBI/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==1){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1WXCTrLy46nrSLca0u_5sLEwm6m-rtbHI/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==2){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1LIJevAL7mIJvx_-YI1vbIkF9kfuhsKx6/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==3){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1ts2rpTfgdUFjjSmF5tumHRZZynE5UUhY/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==4){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1gmB2v5-WRGUL9jSFGzgYiWmAOLU_m6G0/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==5){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1fDSEp_Q-R_M5A_12rdmnO-GnJEZwfsOF/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==6){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1oByBufKVj1ieiL8PRAYX2xRy1EDk2eeO/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==7){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1KGjJfO0KPHOSGaovQBb3xG3pK7eIsEDg/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==8){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1DiHP9EaYCkHaz78iLL2QYlXNoWFb4rbR/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==9){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1Hl1P17bH9NHPPK92JM2X5P-EKUXPVDxT/view1");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==10){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1cGN6zcSov41SaiAtJvIliYbOHhvYj8Ov/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }




            }


        });
        listview.setAdapter(ad);

    }
}