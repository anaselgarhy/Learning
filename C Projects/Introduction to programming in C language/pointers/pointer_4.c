#include<stdio.h>

void main(void){

    int x[]= {100, 265, 54,76,755};

    int *ptr;
    int i;

    ptr=x;

    printf("value x[1] = %d\n", ++*ptr);// increment value of pointer

    for(i=0; i<sizeof(x)/4; i++)
        printf("value %d = %d\n",i+1, *ptr++);// increment  pointer

    printf("==================================\n\n");

    for(i=0; i<sizeof(x)/sizeof(int); i++)
        printf("Value %d = %d \n", i+1, x[i]);






}
