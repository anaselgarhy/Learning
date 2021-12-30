#include<stdio.h>

void main(void){

    int x=200;
    //pointer
    int *ptr;

    ptr=&x;

    printf("x = %d\n",x);

    printf("address x = %u\n", &x);

    printf("address x using pointer = %u\n", ptr);

    printf("x = %d using pointer ptr that pointer to x or assign address x \n", *ptr);

    printf("================================================\n\n");


    *ptr =330;

    printf("x = %d", x);
















}
