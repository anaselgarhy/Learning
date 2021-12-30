#include <stdio.h>
void main(void){
    FILE *fptr;
    char ch;

    fptr = fopen("d:\\Temp\\text.txt", "w");
    while((ch = getche()) != '\r')
        putc(ch, fptr);
    fclose(fptr);

}
