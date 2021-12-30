#include <stdio.h>

void main(void){

    double num = 1, sum = 0.0;
    int i = 1;

    printf("Please Enter Values Terminated  by 0 To STOP \n");

    while(num != 0.00){
        printf("[%d]Number: ", i);
        scanf("%lf", &num);
        sum += num;
        i++;
    }
    printf("Sum of %d previous numbers = %.2f", --i, sum);

}
