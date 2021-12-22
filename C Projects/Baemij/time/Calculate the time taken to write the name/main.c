#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(int argc, char *argv[]) {
    time_t t1=time(0);
    printf("Please enter your name..... \n");
    char *x[20];
    scanf("%s", x);
    time_t t2 = time(0);
    double differnceTime = difftime(t2, t1);
    printf("your name is %s\n", x);
    printf("Time taken to write the name : %.1f s\n", differnceTime);
    return 0;
}
