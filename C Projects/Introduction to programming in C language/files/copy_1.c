#include <stdio.h>
void main(void){

    FILE *fp_in, *fp_out;
    char ch;
    //
    if((fp_in = fopen("d:\\Temp\\text.txt", "r")) == NULL){
        printf("can't open the file !!\n");
        exit(1);
    }
    if((fp_out = fopen("d:\\Temp\\text_copy.txt", "w")) == NULL){
        printf("Can not open the file !\n");
        exit(2);
    }

    while((ch=getc(fp_in)) != EOF)
        putc(ch, fp_out);
    fclose(fp_in);
    fclose(fp_out);

}
