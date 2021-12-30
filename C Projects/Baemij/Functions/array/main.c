#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(int argc, char *argv[]) {
    char characters[4][3]={
                                            {'a','g','c'},
                                            {-2,200,'z'},
                                            {'G','d','K'},
                                            {-90,-1,'b'}
                                            };
    printf("%c", characters[0][0]);
    printf("%c", characters[3][2]);
    printf("%c", characters[0][2]);
    printf("%c", characters[2][1]);
    return 0;
}
