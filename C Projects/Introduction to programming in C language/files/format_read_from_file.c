#include <stdio.h>
#include <stdlib.h>
void main(void){

    FILE *fp_in;

    int code;
    char name[30];
    float salary;

    if((fp_in = fopen("employees.txt", "r")) == NULL){
        printf("Don't open file !\n");
        exit(1);
    }

    while(fscanf(fp_in, "%d", &code) != EOF){
        fgets(name, 30, fp_in);
        fscanf(fp_in, "%f", &salary);
        printf("%5d\t%30s\t%7.2f\n", code, name, salary);
    }
    fclose(fp_in);
}
