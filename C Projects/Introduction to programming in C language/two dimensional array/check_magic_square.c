#include<stdio.h>

void main(void){


    int r, c, size;

    // input size
    printf("Please enter size: ");
    scanf("%d", &size);

    //Create array
    int magic_square[size][size];

    //Reade Magic Square
    for(r=0; r<size; r++){
        printf("Enter row [%d]: ", r);
        for(c=0; c<size; c++)
            scanf("%d", &magic_square[r][c]);
    }
    //
    if(check_magic(size, magic_square))
        printf("The square is a square magic \n");
    else
        printf("The square is not square magic! \n");



}
int check_row(int size, int array[size][size], int row){
    // get magic sum
    int m_sum = (size*(size*size+1))/2;

    // get sum of row
    int r_sum=0;
    for(int c=0; c<size; c++)
        r_sum = r_sum +array[row][c];

    // Return result
    return ((r_sum == m_sum)? 1:0);
}
int check_col(int size, int array[size][size], int col){
    // get magic sum
    int  m_sum = (size*(size*size+1))/2;

    // get sum of col
    int c_sum =0;
    for(int r=0; r<size; r++)
        c_sum = c_sum + array[r][col];

    // Return result
    return ((c_sum == m_sum)? 1:0);
}
int check_diag(int size, int array[size][size], char diag){
   // get sum magic
   int m_sum = (size *(size*size+1))/2;

   // get sum diagonal
   int d_sum =0;
    // lift or right
    switch(diag){
        case 'l':
            for(int r=0; r<size; r++)
                for(int c=0; c<size; c++)
                if(r==c)
                    d_sum += array[r][c];
        break;
        case 'r':
            for(int r=0; r<size; r++)
                for(int c=0; c<size; c++)
                    if(r+c == size-1)
                        d_sum += array[r][c];
        break;
    }

    // Return result
    return (d_sum == m_sum)? 1:0;
}
int check_magic(int size, int array[size][size]){
    //
    short int magic =1;
    int r, c;

    //check row
    for(r=0; r<size; r++)
        if(check_row(size, array, r)==0){
            printf("Row %d is not magic row \n",r+1);
            magic=0;
        }
    //check col
    for(c=0; c<size; c++)
        if(check_col(size, array, c) == 0){
            printf("Col %d is not magic col \n",c+1);
            magic=0;
        }
    //check diagonal lift
    if(check_diag(size, array, 'l') == 0){
        printf("Diagonal %s is not magic diagonal \n","lift");
        magic=0;
    }
    //check diagonal right
    if(check_diag(size, array, 'r') == 0){
        printf("Diagonal %s is not magic diagonal \n","right");
        magic=0;
    }

    //Return result
    return (magic);
}































