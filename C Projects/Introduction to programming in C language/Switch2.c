#include <stdio.h>

void main(){
    int num;

    printf("Enter Number les Than 10 : ");
    scanf("%d", &num);

    switch(num){
        case 1:
        case 3:
        case 5:
        case 7:
        case 9:
            printf("Odd Number \n");
            break;
        case 2:
        case 4:
        case 6:
        case 8:
        case 10:
            printf("Evean Number \n");
            break;
        default:
            printf("Number is not les than 10 !\n");
    }
}
