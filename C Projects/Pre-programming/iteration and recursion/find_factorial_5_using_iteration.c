#include <stdio.h>
int factorial(int num);
void main(void){
    printf("Factorial 5 = %d\n", factorial(5));
}
int factorial(int num){
    int f=1;
    for(int i=num; i>0; i--)
        f*=i;
    return f;
}
