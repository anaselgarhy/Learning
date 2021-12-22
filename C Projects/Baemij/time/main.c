#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(int argc, char *argv[]) {
    time_t t = time(0);
    printf("\tTime = %d\n", t);
    char *time = ctime(&t);
    printf("\t%s\n", time);
    return 0;
}
