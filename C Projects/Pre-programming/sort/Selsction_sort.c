#include <stdio.h>

void main(void)
{
    int data[10] ={ 34, 65, 1, 8, 76, 98, 23, 90, 52, 6}; // Unsorted data

    //Selection sort
    for(int i=0; i< sizeof(data)/sizeof(int)-1; i++)
        for(int j=i+1; j< sizeof(data)/sizeof(int); j++)
            if(data[i] > data[j])
            {
                // swap
                int temp=data[i];
                data[i]=data[j];
                data[j]=temp;
            }
    //print sorted data
    for(int i=0; i<sizeof(data)/sizeof(int); i++)
        printf("Data[%d]:  %d\n", i, data[i]);
}
