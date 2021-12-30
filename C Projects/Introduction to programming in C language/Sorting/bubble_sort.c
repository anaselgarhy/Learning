#include <stdio.h>
#define true 1
#define false 0
void main(void){
    //Data not sort
    int data[] ={54, 5, 76, 800, 4, 3, 98, 23, 765, 1000, 87};
    //
    int n;
    int i;
    short int sorted;

    //Get size of array
    n = sizeof(data)/sizeof(data[0]);


    //Print data before sort
    printf(" data before sort \n");
    printf("==================\n");
    for(i=0;i<n;i++)
        printf("Value[%d]: %d \n", i, data[i]);

    //Algorithm for sorting data using bubble sort
    do{
        sorted= true;
        for(i=0; i<n-1; i++)
        if(data[i] > data[i+1]){
            int temp = data[i];
            data[i] = data[i+1];
            data[i+1] = temp;
            sorted = false;
        }
    } while(!sorted);
    //Print data after sort
    printf("\n data after sort \n");
    printf("==================\n");
    for(i=0;i<n;i++)
        printf("Value[%d]: %d \n", i, data[i]);

}
