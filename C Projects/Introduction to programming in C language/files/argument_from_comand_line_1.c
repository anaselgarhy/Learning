#include <stdio.h>

int main(int argc, char *argv[]){

    printf("Number of argument= %d\n", argc);

    for(int i=0; i<argc; i++)
        printf("[%d] %s \n", i+1, argv[i]);

}
