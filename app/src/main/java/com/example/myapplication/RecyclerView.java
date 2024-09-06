package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {
    ArrayList<SlideModel> imageList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        //imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.picture2, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.picture2, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.picture2, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.picture2, ScaleTypes.CENTER_CROP));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);

        ImageView button3 = findViewById(R.id.imageView2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerView.this, MainActivity7.class);
                startActivity(intent);
            }
        });
        TextView allevents = findViewById(R.id.seeall);
        allevents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a new activity via a intent.
                Intent i = new Intent(RecyclerView.this, allevents.class);
                startActivity(i);
            }
        });
        SearchView searchview = findViewById(R.id.searchV);
        searchview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a new activity via a intent.
                Intent i = new Intent(RecyclerView.this,Searchevents.class);
                startActivity(i);
            }
        });

    }
}