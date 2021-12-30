#include <stdio.h>

void main(void){

    int data[20];
    int n, i;
    int newVal;
    int pos;

    printf("Please enter size of array < 20: ");
    scanf("%d", &n);

    for(i=0;i<n;i++){
        printf("Value[%d]: ", i);
        scanf("%d", &data[i]);
    }
    printf("Please enter new item: ");
    scanf("%d", &newVal);

    printf("please enter position to be inserted: ");
    scanf("%d", &pos);

    // Algorithm to insert a new item in array is specific position.
    for(i=n;i>=pos;i--)
        data[i+1]= data[i];
    data[pos] = newVal;

    n++;

    for(i=0;i<n;i++)
        printf("Value [%d] = %d\n", i, data[i]);





}
