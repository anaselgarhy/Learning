package com.company;

public class Ebreeq {
    private String liquidType;
    private int liquidAmount;
    public static final int MAX_LIQUID_AMOUNT =99;
    public static final int FINJAN_LIQUID_AMOUNT =25;
    public Ebreeq(String liquidType){
        this.liquidType = liquidType;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public int getLiquidAmount() {
        return liquidAmount;
    }
    public void fill(){
        fill(MAX_LIQUID_AMOUNT-liquidAmount);
    }
    public void clean(){
        liquidAmount=0;
    }
    public boolean isEmpty(){
        return liquidAmount==0;
    }
    public boolean serve(){
        boolean didServe =false;
        if(getFanajeen()!=0){
            liquidAmount-= FINJAN_LIQUID_AMOUNT;
            didServe=true;
        }
        return didServe;
    }
    private int getFanajeen(){
        return liquidAmount/FINJAN_LIQUID_AMOUNT;
    }
    public void fill(int liquidAmount){
        int newAmount = this.liquidAmount+liquidAmount;
        if(newAmount>MAX_LIQUID_AMOUNT){
            throw new IllegalArgumentException("هناك الكثيير من ال"+liquidType);
        }
        this.liquidAmount = newAmount;
    }
}
