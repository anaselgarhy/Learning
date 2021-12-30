#include<stdio.h>


void main(void){

    int x =677;
    float f=65.8;
    double d=64.9876;

    int *pointer_int = &x;
    float *pointer_float = &f;
    double *pointer_double = &d;

    // print size of pointers
    printf("size of x pointer is : %d Byte.\n",sizeof(pointer_int));
    printf("size of f pointer is : %d Byte.\n",sizeof(pointer_float));
    printf("size of d pointer is : %d Byte.\n",sizeof(pointer_double));



}
