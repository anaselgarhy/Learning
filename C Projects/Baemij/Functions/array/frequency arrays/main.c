#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(int argc, char *argv[]) {
    const int size = 5;
    int values[5]={0,1,1,1,2};
    const int rangeSize = 3;
    int frequencyarray[3]={0};
    for(int i=0; i<size; i++)
    {
        frequencyarray[values[i]]++;
    }
    for(int i=0; i < rangeSize; i++)
    {
        printf("Values: %d | Frequency: %d\n",  i, frequencyarray[i]);
    }
    return 0;
}
