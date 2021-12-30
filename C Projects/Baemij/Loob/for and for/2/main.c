#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(int argc, char *argv[]) {

    for(int i=7; i>=1; i--){
            for(int j=0; j<i; j++)
                printf("%d ", i);

                printf("\n");

    }
    return 0;
}
