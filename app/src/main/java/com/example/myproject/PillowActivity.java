package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PillowActivity extends AppCompatActivity {

    private Button btnReturn, btnReject, btnSave, btnLove, btnCash, btnLikes, btnViewSaved;
    private TextView tvDesc;
    private int savedResult, likeResult, rejectResult, viewSavedResult, loveResult, cashResult = 0;
    private int minCash = 100_000_000;
    private int maxCash = 400_000_000;

    private Player player;
    private Pillow pillow;


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

        tvDesc = findViewById(R.id.tv_desc);

/*
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            tvDesc.setText("Return")


            }
        });

        btnReject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random_int = (int)Math.floor(Math.random() * (maxCash - minCash + 1) + minCash);
                tvDesc.setText("Disliked" + rejectResult++;);



            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random_int = (int)Math.floor(Math.random() * (maxCash - minCash + 1) + minCash);
                tvDesc.setText("Saved" + random_int + savedResult++;);

            }
        });
        btnLove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDesc.setText("Your Likes" + loveResult++;);

            }
        });

        btnCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random_int = (int)Math.floor(Math.random() * (maxCash - minCash + 1) + minCash);
                tvDesc.setText("Cash: " + random_int );

            }
        });

        btnLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random_int = (int)Math.floor(Math.random() * (maxCash - minCash + 1) + minCash);
                tvDesc.setText("Likes" +  random_int + likeResult++;);


            }
        });

        btnViewSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDesc.setText("Saved" + viewSavedResult++;);

            }
        });

 */



    }

    private void upgrade1(){
        player.addHealth(50);
        tvDesc.setText("Congragulations you have passed day 5! As a token of appreciation here is 50 bonus health.");
    }

    private void upgrade2(){
        player.addHealth(100);
        tvDesc.setText("Congragulations you have passed day 15! As a token of appreciation here is 100 bonus health.");
    }

    private void upgrade3() {
        tvDesc.setText("Congragulations you have passed day 25! As a token of appreciation here is 200 bonus health.");
        player.addHealth(200);
    }

    private void upgradePlayer(){
        int day = 1;
        if (day >= 5)         upgrade1();
        else if (day >= 20) upgrade2();
        else if (day >= 35) upgrade3();
    }

    private void pillowMaker(){
        tvDesc.setText("Make a pillow\n1. make pillow \n2. Blood Sacrifice");

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.addPillow(makePillow());
                System.out.println(player.getName() + " made a pillow\nPlus $50, lose 25 health.");
                player.addMoney(50);
                player.loseHealth(25);
                displayStats();
            }
        });
       btnReject.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               player.loseMoney(100);
               player.addHealth(200);
               //dont make a pillow
               System.out.println(player.getName() + " didn't make a pillow\nLose $100 for 200 health.");
               displayStats();

           }
       });


    }

    private void displayStats(){
        System.out.println("Player: " + player.getName());
        System.out.println("Money: " +  player.getMoney());
        System.out.println("Health: " + player.getHealth());
    }

    private Pillow makePillow(){
        boolean isPretty;
        boolean isComfortable;
        System.out.println("Make a pillow! Do you want it to be pretty?");
        System.out.println("\n1. yes\n(-$30, +65 health)\n2. no\n(+$10, -35 health)");
        int choice = scanscan.nextInt();

        if (choice == 1)   isPretty = true;
        else               isPretty = false;
        System.out.println("Do you want it to be comfortable:");
        System.out.println("\n1. yes\n(-$80, +55 health)\n2. no\n(+$25, -40 health)");
        choice = scanscan.nextInt();
        if (choice == 1)   isComfortable = true;
        else               isComfortable = false;

        Pillow myPillow = new Pillow(isPretty, isComfortable);

        if(isComfortable) {
            player.loseMoney(80);
            player.addHealth(55);
            System.out.println("For the cost of comfortable pillows it loses a massive $60, but you gain 55 health for a good nights sleep\n");
        } else {
            player.addMoney(25);
            player.loseHealth(40);
            System.out.println("For an uncomfortable rest, you gain $25, but lose 40 health.\n");
        }

        if(isPretty){
            player.loseMoney(30);
            player.addHealth(65);
            System.out.println("For a pretty pillow it will cost $30 extra but you get a massive health bonus of 65\n");
        } else {
            player.addMoney(10);
            player.loseHealth(35);
            System.out.println("For ignoring the pretty pillow you choose to sell the glitter for $10. The glitter extra glitter develops backlash\n-Lose 35 health.\n");
        }


        return myPillow;

    }
}