#include <stdio.h>>

void main(void){


    int data[20];
    int n, i;
    int pos;

    printf("Please enter size of array < 20: ");
    scanf("%d", &n);

    for(i=0;i<n;i++){
        printf("Value[%d]: ", i);
        scanf("%d", &data[i]);
    }

     printf("please enter position to be deleted: ");
    scanf("%d", &pos);

    // Algorithm to delete an item in array is specific position.
    for(i=pos;i<n;i++)
        data[i] = data[i+1];
    n--;
    for(i=0;i<n-1;i++)
        printf("Value [%d] = %d \n", i, data[i]);






}
