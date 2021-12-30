
#include <stdio.h>
#include <stdlib.h>
void main(void){

    struct{
        int code;
        char name[30];
        float salary;
    }agent;

    long int rec_num;
    long int offset;

    FILE *fp_in;
    if((fp_in = fopen("data_record", "rb")) == NULL){
        printf("can't open \"data_record\" file !\n");
        exit(1);
    }

    printf("Please enter record number: ");
    scanf("%d", &rec_num);
    offset = (rec_num-1)*sizeof(agent);

    if( fseek(fp_in, offset, 0) == 0){
        fread(&agent, sizeof(agent), 1, fp_in);
        printf("Record number[%d]: \n", rec_num);
        printf("Code: %d\n", agent.code);
        printf("Name: %s\n", agent.name);
        printf("Salary: %8.2f\n", agent.salary);
    }
    else{
        printf("Not record !");
        exit(1);
    }
    fclose(fp_in);
}
