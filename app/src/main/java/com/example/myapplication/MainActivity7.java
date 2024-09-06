package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity7 extends AppCompatActivity {
    TextView Name;
    TextView button3;
    String st;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);

        Name = findViewById(R.id.username);
        button3 = findViewById(R.id.tvManageProfile);

        button3.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity7.this, MainActivity6.class);
            startActivity(i);
        });

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            st = extras.getString("User");
            if (st != null) {
                Name.setText(st);
            }
        }

        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        TextView button = findViewById(R.id.InviteFriends);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity5.class);
                startActivity(intent);
            }
        });
        TextView button2 = findViewById(R.id.tvSellTickets);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, TicketSell.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity6.class);
                startActivity(intent);
            }
        });


        TextView logoutTextView = findViewById(R.id.Logout);
        logoutTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call signOut method to log out the user
                mAuth.signOut();

                startActivity(new Intent(MainActivity7.this, MainActivity2.class));
                finish(); // optional: close the current activity
            }
        });

        ImageButton button4 = findViewById(R.id.back);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, RecyclerView.class);
                startActivity(intent);
            }
        });

        TextView button5 = findViewById(R.id.About);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, Abouthelp.class);
                startActivity(intent);
            }
        });

        TextView Cart = findViewById(R.id.tvCart);
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, Cart.class);
                startActivity(intent);
            }
        });
    }
}