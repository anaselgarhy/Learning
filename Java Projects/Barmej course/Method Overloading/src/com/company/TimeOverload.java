package com.company;

public class TimeOverload {
    private int hour;
    private int minute;
    private int second;
    public TimeOverload(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public TimeOverload(int hour){
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public TimeOverload(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public TimeOverload(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "الساعة: " + hour + ":" + minute + ":" + second ;
    }
}
