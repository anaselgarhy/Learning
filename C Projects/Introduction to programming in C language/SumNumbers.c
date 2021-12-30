#include <stdio.h>
void main(void){

    int num1, num2, sum;

    printf("Please Enter First Number: ");
    scanf("%d", &num1);

    printf("PLease Enter Second Number: ");
    scanf("%d", &num2);

    sum = num1 + num2;
    printf("%d + %d = %d \n", num1, num2, sum);

}
