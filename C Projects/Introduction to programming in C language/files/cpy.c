#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]){

    if(argc < 3){
        printf("invalid number of parameter!\n");
        exit(1);
    }
    FILE *fp_in, *fp_out;
    char ch;
    if((fp_in = fopen(argv[1], "r")) == NULL){
        printf("Can't open file \"%s\" ! \n", argv[1]);
        exit(2);
    }
    if((fp_out = fopen(argv[2], "w")) == NULL){
        printf("Can not open file \"%s\" ! \n", argv[2]);
        exit(2);
    }
    //copy
    while((ch=getc(fp_in)) != EOF)
        putc(ch, fp_out);
    fclose(fp_in);
    fclose(fp_out);
    printf("Done ^-^\n");
}
