#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void adder(int number[],int size)
{
    int sum = 0;
    for(int i=0; i<size;i++)
    {
        sum=sum+number[i];
    }
    printf("%d", sum);
}

int main(int argc, char *argv[]) {
    int array[4]={10,20,30,40};
    adder(array,4);

    return 0;
}
