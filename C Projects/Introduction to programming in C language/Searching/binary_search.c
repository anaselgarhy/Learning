#include <stdio.h>

#define MAXSIZE 100

void main(void){
    float data[MAXSIZE];
    float key;
    int n, i;
    int pos;
    int lower, mid, upper;

    //Input size
    printf("please size < %d: ", MAXSIZE);
    scanf("%d", &n);

    //Input data
    for(i=0; i<n; i++){
        printf("Value[%d]: ", i+1);
        scanf("%f", &data[i]);
    }

    //Input search value
    printf("Please enter key to be located: ");
    scanf("%f", &key);

    //Search for key in array
    pos =0;
    upper=n-1;  //Max value in array
    lower=0;
    do{
        mid = (lower + upper)/2;
        if(key == data[mid]){
            pos = mid;
            break;
        }
        else if(key > data[mid])
            lower =mid +1;
        else
            upper = mid -1;
    }while(lower <= upper);

    if(pos == -1)
        printf(" %.2f is not located in data \n", key);
    else
        printf(" %.2f is located in position in %d ^__^ \n", key, pos);
}
