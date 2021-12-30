#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) {

    printf("Enter array size.....\n");
    int size;
    scanf("%d",&size);
    int *array = (int *)malloc(size);
    int *pointer=array;
    for(int i=0;i<size;i++,array++)
    {
        *(array)=20;
    }
    array= pointer;
    for(int i=0;i<size;i++,array++)
    {
        printf("--- %d\n",*array);
    }
    array=pointer;
    free(array);
    return 0;
}
