#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) {
    int array[4]={10,20,30,40};
    int *arPtr=&array[0];
    printf("array value = %p\n", array);
    printf("address Array = %p\n", &array);
    for(int i=0; i<4;i++,arPtr++)
    {
    printf("address array[%d] = %p\n",i,*(arPtr+i));


    printf("array[%d] = %d\n",i,*arPtr);

    }
    return 0;
}
