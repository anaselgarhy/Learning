#include <stdio.h>
int factorial(int num);
void main(void){
    printf("Factorial 5 = %d\n", factorial(5));
}
int factorial(int num){
    if(num ==1)
        return 1;
    else
        return (num * factorial(num - 1));
}