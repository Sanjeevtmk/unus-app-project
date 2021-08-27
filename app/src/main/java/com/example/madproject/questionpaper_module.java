package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.madproject.R;
import com.example.madproject.SanjeevAdapter;

public class questionpaper_module extends AppCompatActivity {
    ListView listview;
    String arr[]={"Computrer Networks","Mobile Application Devlopment","Compiler Design","Linear Algebra and Probability","Modelling and Simulation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionpaper_module);
        listview=findViewById(R.id.listview);
        SanjeevAdapter ad= new SanjeevAdapter(this,R.layout.question_layout,arr);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1uIifeRcKDsjV5er7ohCqi13fEM_4rzdk/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==1){
                    Uri webpage = Uri.parse("");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==2){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1pcOY-3AbwQSJO_Iw_oXOpgvkx1auVZH5/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==3){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1nXwo42daFUofvd2CSAhooVXfp3F1yb3_/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }


                }
                if(position==4){
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1sa8h7-FKCg6k59_cp0zUQteaLYy4zn_4/view");
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