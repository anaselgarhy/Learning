#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(int argc, char *argv[]) {
    int temp;
    int max=-999;
    for(int i=0; i<4; i++){
        printf("Enter num\n");
        scanf("%d", &temp);
        printf("\n");
        if(temp > max){
            max = temp;
        }
    }
    printf("The largest number you entered here %d\n", max);



    return 0;
}
