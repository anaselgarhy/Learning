#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void main(void){

    FILE *fp_in;

    int code;
    char name[30];
    float salary;

    fp_in = fopen("dataFormated.bin", "rb"); // rb : read as a binary
    if(fp_in == NULL){
        printf("Can not open the file !\n");
        exit(1);
    }
    while(!feof(fp_in)) // or fp_in != EOF
    {
        if(fread(&code, sizeof(code), 1, fp_in) == 0) //check end of file
            break;
        fread(name, sizeof(name), 1, fp_in);
        fread(&salary, sizeof(salary), 1, fp_in);

        printf("%5d\t%-30s\t%7.2f\n", code, name, salary);
    }
    fclose(fp_in);
}
