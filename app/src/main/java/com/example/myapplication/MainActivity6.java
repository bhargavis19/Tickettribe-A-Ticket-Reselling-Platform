package com.example.myapplication;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

    public class MainActivity6 extends AppCompatActivity {
    final Calendar c= Calendar.getInstance();
    EditText name;
    EditText dob;
    EditText email;
    Button save;
    ImageButton back;
    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        name = findViewById(R.id.name);
        dob = findViewById(R.id.editText1);
        email = findViewById(R.id.emailid);
        save = findViewById(R.id.button);
        back = findViewById(R.id.back);
        DatePickerDialog.OnDateSetListener date =new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                c.set(Calendar.YEAR, year);
                c.set(Calendar.MONTH,month);
                c.set(Calendar.DAY_OF_MONTH,day);
                updateLabel();
            }

            private void updateLabel() {
                String myFormat="dd/MM/yyyy";
                SimpleDateFormat dateFormat=new SimpleDateFormat(myFormat, Locale.ENGLISH);
                dob.setText(dateFormat.format(c.getTime()));
            }
        };
        dob.setOnClickListener(view -> new DatePickerDialog(MainActivity6.this,date,c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show());


        back.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity6.this, RecyclerView.class);
            startActivity(intent);
        });

        back.setOnClickListener(v -> {
            Intent i= new Intent(MainActivity6.this, MainActivity7.class);
            startActivity(i);
        });

        save.setOnClickListener(v -> {
            Intent i=new Intent(MainActivity6.this,MainActivity7.class);
            st=name.getText().toString();
            i.putExtra("User",st);
            Toast profileSaved = Toast.makeText(getApplicationContext(), "Profile Saved",Toast.LENGTH_SHORT);
            startActivity(i);
            profileSaved.show();
            finish();


        });




    }
}