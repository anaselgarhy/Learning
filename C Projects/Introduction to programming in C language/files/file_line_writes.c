#include <stdio.h>
#include <string.h>
void main(void){

    FILE *fptr;
    char line[81];

    fptr = fopen("textFile.txt", "w"); // Open file
    while(strlen(gets(line)) > 0){
        fputs(line, fptr);
        fputs("\n", fptr);
    }
    fclose(fptr);

}
