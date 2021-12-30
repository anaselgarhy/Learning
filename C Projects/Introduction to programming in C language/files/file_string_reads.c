#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void main(void){

    FILE *fptr = fopen("textFile.txt", "r");
    char line[81];

    if(fptr == NULL){
        printf("Can not open file !");
        exit(1);
    }
    while(fgets(line, 80, fptr) != NULL){
        printf("%s", line);
        //puts(line);
        //puts("\n");
    }
    fclose(fptr);

}
