#include <stdio.h>

void main(void){

    int num, num1, num2, n;
    num1 = -1;
    num2= 1;

    printf("Please Enter The Number of Terms: ");
    scanf("%d", &n);

    do{
        num = num1 + num2;
        printf(" %d \n", num);
        num1 = num2;
        num2 = num;
        n--;
    } while(n>=1);
}
