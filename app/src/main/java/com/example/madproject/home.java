package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.madproject.SessionManager;
import com.example.madproject.SQLiteHandler;

import java.util.HashMap;

public class home extends AppCompatActivity {
    public Button About;
    public Button notice;
    public Button fees;
    public Button result;
    public Button question;
    public Button books;
    public Button notes;
    public Button contacts;
    public TextView Username;
    public TextView Roll;
    public Button Logout;
    String Username_holder;
    String roll_holder;
    private SQLiteHandler db;
    private SessionManager session;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // SqLite database handler
        db = new SQLiteHandler(getApplicationContext());

        // session manager
        session = new SessionManager(getApplicationContext());

        if (!session.isLoggedIn()) {
            logoutUser();
        }

        // Fetching user details from sqlite
        HashMap<String, String> user = db.getUserDetails();

        String name = user.get("name");
        String roll_no = user.get("roll_no");
        String email = user.get("email");

        setContentView(R.layout.activity_home);
        About= findViewById(R.id.about_btn);
        notice=findViewById(R.id.notice);
        fees=findViewById(R.id.fee);
        result=findViewById(R.id.result);
        question=findViewById(R.id.question);
        books=findViewById(R.id.books);
        notes=findViewById(R.id.notes);
        contacts=findViewById(R.id.contacts);
        Username=findViewById(R.id.username);
        Roll=findViewById(R.id.roll);
        Logout=findViewById(R.id.logout);
        //describing the buttons function below
        //Intent userintent = getIntent();
        //Username_holder = userintent.getStringExtra(login.UserEmail);
        //Username.setText(Username_holder);
        //Intent rollintent = getIntent();
        //roll_holder = rollintent.getStringExtra(login.UserEmail);
        //Username.setText(Username_holder);

        // Displaying the user details on the screen
        Username.setText(name);
        Roll.setText(roll_no);
        //txtEmail.setText(email);


        // Logout button click event
        Logout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                logoutUser();
            }
        });




        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "about is opening", Toast.LENGTH_SHORT).show();
               Intent intent= new Intent(home.this,about_pussgrc.class);
                startActivity(intent);
            }
        });
        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://ssgpurch.puchd.ac.in/show-noticeboard.php?nbid=1");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                Toast.makeText(home.this, "opening notice", Toast.LENGTH_SHORT).show();
                if(webIntent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(webIntent);
                }
            }
        });
        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this,fees.class);
                startActivity(intent);
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://eakadamik.in/uiethsp/");
                Intent result_Intent = new Intent(Intent.ACTION_VIEW, webpage);
                Toast.makeText(home.this, "opening results", Toast.LENGTH_SHORT).show();
                if(result_Intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(result_Intent);
                }

            }
        });
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(home.this,questionpaper_module.class);
                startActivity(intent);
            }
        });
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(home.this,book_module.class);
                startActivity(intent);
            }
        });
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(home.this,notes_module.class);
                startActivity(intent);
            }
        });
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "opening faculty and staff contacts", Toast.LENGTH_SHORT).show();
                Uri webpage = Uri.parse("https://ssgpurch.puchd.ac.in/show-faculty.php");
                Intent contact_intent = new Intent(Intent.ACTION_VIEW, webpage);
                if(contact_intent.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(contact_intent);
                }

            }
        });

    }
    private void logoutUser() {
        session.setLogin(false);

        db.deleteUsers();

        // Launching the login activity
        Intent intent = new Intent(home.this, login.class);
        startActivity(intent);
        finish();
    }

}