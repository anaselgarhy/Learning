#include<stdio.h>

void main(void){

    int x=433, y=655;

    swap(&x, &y);
    printf("x = %d\n", x);
    printf("y = %d\n", y);

}
void swap(int *a, int *b){

    int temp=*a;
    *a=*b;
    *b=temp;
}
