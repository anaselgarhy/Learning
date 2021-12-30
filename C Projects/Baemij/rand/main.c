#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(int argc, char *argv[]) {
    srand(time(0));
    for(int i=0; i<=100; i++)
    {
    int x=5 + (rand() % (30-5+1));
    printf("The random number is : %d\n", x);
    }
    return 0;
}
