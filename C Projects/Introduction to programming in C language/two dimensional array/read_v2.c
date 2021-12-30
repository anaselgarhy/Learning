#include<stdio.h>

void main(void){

    int array_2d[2][3];
    int r, c;

    //Input
    for(r=0; r<2; r++){
        printf("Please enter data for row [%d]: ",r);
        for(c=0; c<3; c++)
            scanf("%d",&array_2d[r][c]);
    }

    // Print array
    for(r=0; r<2; r++){
        for(c=0; c<3; c++)
            printf("%3d",array_2d[r][c]);
        printf("\n");
    }


}
