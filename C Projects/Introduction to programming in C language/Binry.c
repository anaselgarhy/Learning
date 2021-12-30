#include <stdio.h>

void main(void){


    int num;
    printf("Enter number: ");
    scanf("%d",&num);
    binary(num);
}
void binary(int n){

    if(n>0){
        binary(n/2);
        printf("%d", n%2);
    }





}
