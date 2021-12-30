#include<stdio.h>

int add(int a, int b);
int subtract(int a, int b);
int multiply(int a, int b);
int divide(int a, int b);

void main(void){

    int num1, num2, op;
    int (*ptr[4])(int, int) ={&add, &subtract, &multiply, divide};

    printf("Enter first number: ");
    scanf("%d", &num1);
    printf("Enter second number: ");
    scanf("%d", &num2);
    printf("Please select operation (1-add, 2-subtract, 3-multiply, 4-divide): ");
    scanf("%d", &op);

    int re = ptr[op-1](num1,num2);

    printf("%d %c %d = %d.\n",num1,((op==1)?'+':(op==2)?'-':(op==3)?'*':'/'),num2,re);


}
int add(int a, int b){
    return(a+b);
}
int subtract(int a, int b){
    return(a-b);
}
int multiply(int a, int b){
    return(a*b);
}
int divide(int a, int b){
    return(a/b);
}

















