#include <stdio.h>

void main(void)
{
    int data[10] ={1, 6, 8, 34, 52, 23, 65, 76, 90, 98}; //little  unsorted data

    //Bubble sort
    short sorted;
    do{
        sorted=1;\
        for(int i=0; i< sizeof(data)/sizeof(int); i++)
            if(data[i] >  data[i+1])
            {
                //swap
                int temp=data[i];
                data[i]=data[i+1];
                data[i+1]=temp;
                //
                i++;
                sorted=0;
            }
     }while(sorted == 0);

    //print sorted data
    for(int i=0; i<sizeof(data)/sizeof(int); i++)
        printf("Data [%d]:  %d\n", i, data[i]);
}
