#include <stdio.h>
int liner_search(int array[], int size, int key);
void main(void){
    int data[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int key;
    int location;

    printf("Please enter value to be located:  ");
    scanf("%d", &key);

    location = liner_search(data, sizeof(data)/sizeof(int), key);
    if(location == -1)
        printf("%d not located in data \n", key);
    else
        printf("%d is located at position %d \n", key, location);
}
int liner_search(int array[], int size, int key){
    int i;
    for(i=0; i<size; i++)
        if(array[i] == key)
            return i;
        if(i==size)
            return -1;
}