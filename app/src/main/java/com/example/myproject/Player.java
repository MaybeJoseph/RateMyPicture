package com.example.myproject;

import java.util.ArrayList;
public class Player{

    private String name;
    private int money;
    private int health;
    //code i added
    private String upgrade1;
    private String upgrade2;
    private String upgrade3;
    private ArrayList<Pillow> pillows;

    public Player(String name){
        this.name = name;
        this.money = 100;
        this.health = 150;
        //code i added
        this.upgrade1 = upgrade1;
        this.upgrade2 = upgrade2;
        this.upgrade3 = upgrade3;
        this.pillows = new ArrayList<Pillow>();
    }

    public String getName(){
        return name;
    }

    public int getMoney(){
        return money;
    }

    public int getHealth(){
        return health;
    }

    public void addMoney(int amount){
        money+=amount;
    }

    public void addHealth(int amount){
        health+=amount;
    }

    public void loseMoney(int amount){
        money-=amount;
    }

    public void loseHealth(int amount){
        health-=amount;
    }
    public String getUpgrade1(){
        return upgrade1;
    }

    public String getUpgrade2(){
        return upgrade2;
    }

    public String getUpgrade3(){
        return upgrade3;
    }

    public void addPillow(Pillow pillow){
        pillows.add(pillow);
    }





}