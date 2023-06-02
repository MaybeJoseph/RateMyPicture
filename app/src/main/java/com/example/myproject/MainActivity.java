package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnReturn, btnReject, btnSave, btnLove, btnCash, btnLikes, btnViewSaved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReturn    =   findViewById(R.id.btn_return);
        btnReject    =   findViewById(R.id.btn_reject);
        btnSave      =   findViewById(R.id.btn_save);
        btnLove      =   findViewById(R.id.btn_love);
        btnCash      =   findViewById(R.id.btn_cash);
        btnLikes     =   findViewById(R.id.btn_Likes);
        btnViewSaved =   findViewById(R.id.btn_viewSaved);


        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        btnReject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
        btnLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        btnCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        btnLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        btnViewSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });



    }
}