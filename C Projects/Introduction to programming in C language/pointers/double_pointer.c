#include<stdio.h>

void main(void){

    int x=200;

    int *ptr1;
    int **ptr2;

    ptr1=&x;
    ptr2=&ptr1;

    printf("x = %d\n", **ptr2);



}
