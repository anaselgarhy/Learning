#include <stdio.h>
void main(void){
    FILE *fptr;
    char ch;

    fptr = fopen("d:\\Temp\\text.txt", "r");
    while((ch=getc(fptr)) != EOF)
        putc(ch,stdout);
    fclose(fptr);
}
