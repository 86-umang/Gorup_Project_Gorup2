package com.example.developerhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginSignup extends AppCompatActivity {

    Button btnLogin;
    TextView txtSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);

        btnLogin = findViewById(R.id.btnLogin);
        txtSignUp = findViewById(R.id.txtSignUp);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginSignup.this, MainActivity.class);
                  startActivity(intent);
            }
        });

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginSignup.this, MainActivity.class);
                  startActivity(intent);
            }
        });

        String fullText = "Not Registered Yet? SignUp Now!";

// Create a SpannableString
        SpannableString spannableString = new SpannableString(fullText);

// Find the start and end indices of the text you want to highlight
        int startIndex = fullText.indexOf("SignUp Now!");
        int endIndex = startIndex + "SignUp Now!".length();

// Apply ForegroundColorSpan to highlight the text
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(getResources().getColor(R.color.lavender));
        spannableString.setSpan(colorSpan, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

// Set the modified SpannableString to the TextView
        txtSignUp.setText(spannableString);

    }
}