#include<stdio.h>

void main(void){

    int array[]={400, 500, 600, 700, 800, 900};

    printf("%d\n", array[3]);

    printf("%d\n", *(array+3));

    printf("%d\n", 3[array]);



}
