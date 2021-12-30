#include <stdio.h>
#include <stdlib.h>
void main(void){

    FILE *fp_out;

    int code;
    char name[30];
    float salary;

    if((fp_out = fopen("employees.txt", "w")) == NULL){
        printf("Can not open file !\n");
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

        fprintf(fp_out, "%-5d %-30s %-7.2f \n", code, name, salary);
        printf("\n");
    } while(1);
    fclose(fp_out);


}
