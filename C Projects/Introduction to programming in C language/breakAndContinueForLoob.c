#include <stdio.h>

void main(void){
    int num, sum = 0, i;

    for(i = 1; i<=10; i++){
        printf("%d.Please Enter Number: ", i);
        scanf("%d", &num);
        if(num == 0)
            break;
        if(num <0)
            continue;
        sum += num;
    }
    printf("The sum of the numbers is the %d is [ %d ] \n", i-1, sum);

}
