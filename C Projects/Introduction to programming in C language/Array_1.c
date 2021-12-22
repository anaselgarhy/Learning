#include <stdio.h>
#include <limits.h>

void main(void){


    int days[366];
    int i, n;
    int sum, max, min, negative;

    i=0;

    do{

        printf("day[%d]: ",i+1);
        scanf("%d", &days[i]);
    } while(days[i++] !=0);
    n = i-1;

    //Get sum of array
    sum =0;
    for(i =0; i<n; i++)
        sum += days[i];
    printf("\nSum = %d\n", sum);

    //Get average
    printf("\nAverage of this days is %f \n", (float)sum/n);

    //Get max value
    max = INT_MIN;
    for(i=0;i<n;i++)
        max = (max < days[i])? days[i] : max;
    printf("\nMax value is %d \n", max);

    //Get min value
    min = INT_MAX;
    for(i=0;i<n;i++)
        min=(min > days[i])? days[i] : min;
    printf("\nMin value is %d \n", min);

    // Is there a negative value?
    negative = 0;
    for(i=0;i<n;i++)
        negative = (days[i] < 0)? negative+=1 : negative;
    printf("\nIs there a negative value? : %s \n", (negative > 0)? "True":"False");



    printf("\n Data stored in array is: \n");

    for(i=0; i<n; i++)
        printf("Value in position %d is %d \n", i+1, days[i]);





}
