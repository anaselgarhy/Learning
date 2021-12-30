#include<stdio.h>

void main(void){

    int array[]={144.122,2,44,5,7,5,2,0,2,4,77,854,2569,754,253,144};

    //print array
    for(int i=0; i<sizeof(array)/sizeof(int); i++)
        printf("%d ",array[i]);
    printf("\n------------------------------\n");

    //print array usage pointer to fast
    for(int i=0; i<sizeof(array)/sizeof(int); i++)
        printf("%d ",*(array+i));



}
