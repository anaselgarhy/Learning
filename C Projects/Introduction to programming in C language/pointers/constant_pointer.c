#include<stdio.h>

void main(void){

    int x=300;
    int y =122;
    int *const ptr=&x;

    //لا يمكن تغيرر هنوان البوينتر
    ptr=&y;

    //ولاكن يمكن تغيير القية التي يشير اليها
    *ptr=222;
    printf("x = %d\n", x);



}
