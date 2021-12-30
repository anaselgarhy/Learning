#include <stdio.h>

void main(void){
    int num, sum = 0, i;

    for(i=1; i<=10; i++){
        printf("Enter value[%d]: ", i);
        scanf("%d", &num);
        sum +=num;
    }
    printf("Smed of the values entered is [ %d ]", sum);
}
