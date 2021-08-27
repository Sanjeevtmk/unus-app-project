package com.example.madproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chootdev.recycleclick.RecycleClick;
import com.example.madproject.book;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class book_module extends AppCompatActivity {
    book o1= new book("The C","Denis M Ritchie");
    book o2= new book("Thomas Calculus","Thomas");
    book o3= new book("Higher engineering mathematics","BS Garewal");
    book o4= new book("Switching and Finite Automata Therory","Zvi Kohavi");
    book o5= new book("Computer System Architecture","morris Manno");
    book o6= new book("Data Structures","Sahani");
    book o7= new book("Operating System Concepts" ,"Galvin");
    book o8= new book("Modern Operating System","Tanenbaum");
    book o9= new book("Discrete Mathematics ","Kenneth H Rosen");
    book o10= new book("Probability","Sheldon Ross");
    book o11= new book("Formal Language and Automata","Peter Linz");
    book o12= new book("Computer Algorithms","Sahani");
    book o13= new book("Introduction to Algorithm ","Cormen");
    book o14= new book("Database Management System","Raghu Rama Krishan");
    book o15= new book("Database System Concepts","Henry F Korth");
    book o16= new book("Fundamentals of DBMS","Navathe");
    book o17= new book("Data Communication and Networking","Behrouz A Frouzan");
    book o18= new book("Compilers","Ulman & Aho");

    book [] books= {o1,o2,o3 ,o4,o5,o6,o7,o8,o9,o10,o11,o12,o13,o14,o15,o16,o17,o18};

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_module);


        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad= new CustomAdapter(books);

        RecycleClick.addTo(recyclerView).setOnItemClickListener(new RecycleClick.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                if(position==0)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1zJ0sow2ICTJagUPlgsruvuIQhKr9oCpG/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==1)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1NH4cjeSJWKdHisN9MNmRDeQ2ucZiaMcS/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==2)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1l8x_EOsb4SisFEOmYvJc5QRYOFDfG36j/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==3)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1kGuHZ__GC3NwZINCkMD2f2BvLsqmFnBI/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==4)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1AVk4b5QHOwyoGfG9zfRmZWLObPBjvaBf/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==5)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1wCqQoolv4vuA1I8Ns7RAW0NS8o2gJedT/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==6)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/14LD2Baib315D9rokjm1oqvef1t5yzqB7/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==7)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1VbWnxnwIYogLPu5Eh-wljLLoAx30qjiJ/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==8)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1j18L9BJ4k8ygI70y1Nxdt0Aw-tGdFi2V/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==9)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1Xqrlj7lpiixVPy9BY9RHJHEFCQLUe-tf/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==10)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1_K0d1pugt_Mr2O8KLGD4-cXdtGEItO8q/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==11)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1-ocfHenkC-ivJBZ8UBXrD392EKgKHK7p/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==12)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1fihKFB6gJ-PxMFQx544EufdTQryRdZGZ/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==13)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1XRCTD1B8YsPJJO6NEtrTxkjoskSiYq6t/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==14)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1m3ZU6TnbtfAg01km9at7vs0A9xbtw8km/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==15)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/11h2SCoK6RIJfkGqNhxfTGiVGLbSDilOT/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }

                if(position==16)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/1mGnGgp5_i26yR7nl_boBJLu04HoRUtpR/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }
                if(position==17)
                {
                    Uri webpage = Uri.parse("https://drive.google.com/file/d/118CVRiB40ffcSELERBdKhxdjoEzRkIn4/view");
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                    if(webIntent.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(webIntent);
                    }

                }




            }
        });
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}