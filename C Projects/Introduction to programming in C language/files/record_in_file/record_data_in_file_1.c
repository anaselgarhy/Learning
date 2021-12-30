#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>
void main(void){

    struct{
        int code;
        char name[30];
        float salary;
    }agent;

    FILE *fp_out;
    char answer;

    if((fp_out = fopen("data_record", "wb")) == NULL){
        printf("can't open \"data_record\" file !\n");
        exit(1);
    }

    do{
        printf("Code: ");
        scanf("%d", &agent.code);
        fflush(stdin);
        printf("Name: ");
        gets(agent.name);
        fflush(stdin);
        printf("Salary: ");
        scanf("%f", &agent.salary);
        fwrite(&agent, sizeof(agent), 1, fp_out);
        printf("another agent ? [y/n]: ");
        answer = getche();
        putchar('\n');
        putchar('\n');
    }while(answer == 'y');
    fclose(fp_out);

}
