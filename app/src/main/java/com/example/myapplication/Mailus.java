package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class Mailus extends AppCompatActivity {
    EditText editTextTo, editTextSubject, editTextMessage;
    Button buttonSend;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mailus);
        editTextTo = findViewById(R.id.to);
        editTextSubject = findViewById(R.id.subject);
        editTextMessage = findViewById(R.id.Content);
        buttonSend = findViewById(R.id.buttonSend);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = editTextTo.getText().toString();
                String subject = editTextSubject.getText().toString();
                String message = editTextMessage.getText().toString();
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rfc822");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
                emailIntent.putExtra(Intent.EXTRA_TEXT, message);
                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                } catch (ActivityNotFoundException ex) {
                    Toast.makeText(Mailus.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ImageButton imageButton = findViewById(R.id.imageinsta);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the URL of the website you want to redirect to
                String url = "https://www.instagram.com/bmlmunjaluniversity/";

                // Create a new Intent with ACTION_VIEW and parse the URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Start the activity with the intent
                startActivity(intent);
            }
        });
        ImageButton linkedn = findViewById(R.id.imagelinkedn);
        linkedn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the URL of the website you want to redirect to
                String url = "https://www.linkedin.com/search/results/all/?fetchDeterministicClustersOnly=true&heroEntityKey=urn%3Ali%3Afsd_profile%3AACoAACStdwUBjWSlDGdQ9XlFxV4DCgEJ2QsW_QM&keywords=bml%20munjal%20university%20(bmu)%20hero%20group&origin=RICH_QUERY_SUGGESTION&position=0&searchId=9f66aba7-534e-4459-8c98-4df85f3d4edf&sid=geM&spellCorrectionEnabled=false";

                // Create a new Intent with ACTION_VIEW and parse the URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Start the activity with the intent
                startActivity(intent);
            }
        });
        Button back = findViewById(R.id.buttonSend);
        back.setOnClickListener(v -> {
            Intent i= new Intent(Mailus.this, Abouthelp.class);
            startActivity(i);
        });
        ImageButton facebook = findViewById(R.id.imagefacebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the URL of the website you want to redirect to
                String url = "https://www.facebook.com/share/ZDJzTLoAPE7vvxNx/?mibextid=qi2Omg";

                // Create a new Intent with ACTION_VIEW and parse the URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Start the activity with the intent
                startActivity(intent);
            }
        });
        ImageButton X = findViewById(R.id.imageX);
        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the URL of the website you want to redirect to
                String url = " https://x.com/Ticketribe?t=hHOg1z9X1DaWLysT8JXGKw&s=08";

                // Create a new Intent with ACTION_VIEW and parse the URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Start the activity with the intent
                startActivity(intent);
            }
        });
    }
}
