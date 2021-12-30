#include <stdio.h>
#include <limits.h>
void main(void){

    int num = 1;
    int max = INT_MIN;

    printf("Please enter number terminated by end.\n");

    do{
        if(scanf("%d", &num) == 0)
            break;
        if(num > max )
            max = num;
    } while(1);
    printf("The max number is: %d", max);



}
