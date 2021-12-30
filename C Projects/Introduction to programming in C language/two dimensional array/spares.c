#include <stdio.h>

void main(void){

    int counter =0;
    int r, c;
    int matrix[10][10]={{0,0,0,4,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,5,0,0,0,0},
                        {0,0,0,0,0,0,0,0,6,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,8,0},
                        {0,0,6,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,0,0,0},
                        {0,0,0,1,0,0,0,0,0,0}};

    // Scan Matrix , Get counter
    for(r=0; r<10; r++)
        for(c=0; c<10; c++)
            if(matrix[r][c] != 0) counter++;

    // Create spares
    int spares[3][counter];

    // Filling spares
    int k=0;
    for(r=0; r<10; r++)
        for(c=0; c<10; c++)
            if(matrix[r][c] != 0){
                spares[0][k] =r; // Add row number
                spares[1][k] =c; // Add col number
                spares[2][k] =matrix[r][c]; // Add value
                k++;
            }

    // Print spares
    printf("----------Spares----------\n");
    for(r=0; r<3; r++){
        for(c=0; c<k; c++)
            printf("%4d", spares[r][c]);
        printf("\n");
    }

    // Print spares matrix
    k=0;
    printf("----------Spares matrix----------\n");
    for(r=0; r<10; r++){
        for(c=0; c<10; c++)
            if((r==spares[0][k]) && (c==spares[1][k])){
                printf("%4d", spares[2][k]);
                k++;
                }
            else
                printf("%4d",0);
            printf("\n");
    }


}
