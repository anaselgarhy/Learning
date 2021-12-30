package com.company;

public class arrays {
    public static void main(String[] args){
        int array[] = {1,2,3,4,5};
        try{
            System.out.println(array[6]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index out of array!");
            System.out.println(e);
        }


    }
}
