#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void main(void){

    FILE *fp_out;

    int code;
    char name[30];
    float salary;

    fp_out = fopen("dataFormated.bin", "wb"); // wb : write as a binary
    if(fp_out == NULL){
        printf("Can not open the file !\n");
        exit(1);
    }
    do{
        printf("Code: ");
        scanf("%d", &code);
        if(code == 0)
            break;
        fflush(stdin);
        printf("Name: ");
        gets(name);
        fflush(stdin);
        printf("Salary: ");
        scanf("%f", &salary);
        //Write data in file as a binary
        fwrite(&code, sizeof(code), 1, fp_out);
        fwrite(name, sizeof(name), 1, fp_out);
        fwrite(&salary, sizeof(salary), 1, fp_out);
        printf("\n");
    } while(1);
    fclose(fp_out);
}
