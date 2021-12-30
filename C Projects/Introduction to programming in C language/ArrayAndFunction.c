#include <stdio.h>
#include <limits.h>

#define MAX_VALUE 5

int sumArray(int array[], int size);
int sumArray(int a[], int size);

void main(void){



    int days[MAX_VALUE] = {43, 23, 54, 76, 8};

    int sum;
    int max;

    sum = sumArray(days, MAX_VALUE);
    max = maxArray(days, MAX_VALUE);

    printf("Sum values is %d\n", sum);
    printf("Max value is %d \n", max);

}
int sumArray(int array[], int size){
    int sum, i;
    for(i=0;i<size;i++)
        sum += array[i];
    return (sum);
}
int maxArray(int a[], int size){
    int max = INT_MIN, i;
    for(i=0;i<size;i++)
        max = (max < a[i])? a[i]:max;
    return (max);

}
