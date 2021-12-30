#include <stdio.h>
int search(int array[], int size, int key);
void main(void){
    int data[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int key;
    int location;

    printf("Please enter value to be located:  ");
    scanf("%d", &key);
    location = search(data, sizeof(data)/sizeof(int), key);
    if(location == -1)
        printf("%d not located in data \n", key);
    else
        printf("%d is located at position %d \n", key, location);
}
int search(int array[], int size, int key){
    if(size == 0)
        return -1;
    else{
        if(array[size - 1] == key)
            return size - 1;
        else
            return (search(array, size-1, key));
    }
}
