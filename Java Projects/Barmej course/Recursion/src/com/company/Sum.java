package com.company;

public class Sum {
    public int sumCalc(int num){
        if(num == 0){
            return 0;
        } else {
            return sumCalc(num - 1) + num;
        }
    }
}
