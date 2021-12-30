#include<stdio.h>

void main(void){

    //Return more than one value from a function

    int x=7, y=3;
    int div, reminder;

    divide(x, y, &div, &reminder);

    printf("Divide %d/%d=%d, Reminder %d%%%d=%d.\n ",x,y,div,x,y,reminder);

}
void divide(int a, int b, int *d, int *r){
    *d=a/b;
    *r=a%b;
}
