#include <stdio.h>

void main(void){

    int row, cole;

    for(row = 1; row<=12; row++){

        for(cole = 1; cole<=12; cole++)
            printf(" %4d ", row * cole);
        printf("\n");
    }

}
