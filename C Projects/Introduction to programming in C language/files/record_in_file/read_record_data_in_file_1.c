#include <stdio.h>
#include <stdlib.h>
void main(void){

    struct{
        int code;
        char name[30];
        float salary;
    }agent;

    FILE *fp_in;
    if((fp_in = fopen("data_record", "rb")) == NULL){
        printf("can't open \"data_record\" file !\n");
        exit(1);
    }

    printf("Code\t Name\t\t\t\t Salary\n");
    printf("--------------------------------------------------------\n");
    while( fread(&agent, sizeof(agent), 1, fp_in) )
        printf("%4d\t %-30s\t%8.2f \n", agent.code, agent.name, agent.salary);
    fclose(fp_in);

}
