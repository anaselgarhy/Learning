#include<stdio.h>

void main(void){

    int r, c, val;
    int n;
    // read n
    printf("Please enter size: ");
    scanf("%d",&n);
    // Create array
    int magic_array[n+1][n+1];

    // Algorithm
    r=1;
    c=(n+1)/2;
    val = 1;
    do{

        magic_array[r][c]=val;
        if(val%n==0)
            r++;
        else{
            c--;
            r--;
        }
        if(r==0) r=n;
        if(c==0) c=n;
        val++;
    } while(val <= n*n);

    // print magic square
    for(r=1; r<=n; r++){
        for(c=1; c<=n; c++)
            printf(" %4d ",magic_array[r][c]);
        printf("\n");
    }




}
