#include <stdio.h>

void main(void){
    float data[100];
    float key;
    int n, i;
    int pos;

    //Input size
    printf("please size < 100: ");
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
    pos =-1;
    for(i=0; i<n; i++)
        if(data[i] == key){
            pos=i;
            break;
        }
    if(pos == -1)
        printf(" %.2f is not located in data \n", key);
    else
        printf(" %.2f is located in position in %d ^__^ \n", key, pos);







}
