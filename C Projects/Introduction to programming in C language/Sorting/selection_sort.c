#include <stdio.h>
void main(void){
    //Data not sort
    int data[] ={54, 5, 76, 800, 4, 3, 98, 23, 765, 1000, 87};
    //
    int n;
    int i, j;

    //Get size of array
    n = sizeof(data)/sizeof(data[0]);


    //Print data before sort
    printf(" data before sort \n");
    printf("==================\n");
    for(i=0;i<n;i++)
        printf("Value[%d]: %d \n", i, data[i]);

    //Algorithm for sorting data using selection sort
    for(i=0; i<n-1; i++)
        for(j=i+1; j<n; j++)
            if(data[i] > data[j]){
                int temp = data[i];
                data[i]=data[j];
                data[j]=temp;
            }

    //Print data after sort
    printf("\n data after sort \n");
    printf("==================\n");
    for(i=0;i<n;i++)
        printf("Value[%d]: %d \n", i, data[i]);

}
