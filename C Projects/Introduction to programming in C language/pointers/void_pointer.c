#include<stdio.h>

void main(void){

    int x=200;
    float f=54.6;
    double d=654.87600;
    char c='A';

    void *ptr;

    ptr=&x;
    printf("x = %d\n",*((int *)ptr));

    ptr=&f;
    printf("f = %f\n", *((float *)ptr));

    ptr=&d;
    printf("d = %lf\n", *((double *)ptr));

    ptr=&c;
    printf("c = %c\n", *((char *)ptr));



}
