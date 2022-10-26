package com.test.vetcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class DashBoard extends AppCompatActivity {

    Button btnSOS;
    private Button btnSalir;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        btnSOS=(Button)findViewById(R.id.btnSOS);


        btnSalir = findViewById(R.id.btnSalir);

        btnSOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnSOS = new Intent(DashBoard.this, MainActivity.class);
                startActivity(btnSOS);
            }
        });

        mAuth = FirebaseAuth.getInstance();

        btnSalir.setOnClickListener(view -> {
            mAuth.signOut();
            startActivity(new Intent(this, LoginActivity.class));

        });


        }


    }//End onCreate


