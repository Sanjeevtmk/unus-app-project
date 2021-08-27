package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fees extends AppCompatActivity {
    private Button exam_fee;
    private  Button semester_fee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fees);
        exam_fee=findViewById(R.id.exam_fee);
        semester_fee=findViewById(R.id.semester_fee);
        exam_fee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://payonline.puchd.ac.in/");
                Intent exam_fee_Intent = new Intent(Intent.ACTION_VIEW, webpage);
                if(exam_fee_Intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(exam_fee_Intent);
                }
            }
        });
        semester_fee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("http://pgexam.puchd.ac.in/home.aspx");
                Intent semester_fee_Intent = new Intent(Intent.ACTION_VIEW, webpage);
                if(semester_fee_Intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(semester_fee_Intent);
                }
            }
        });
    }
}