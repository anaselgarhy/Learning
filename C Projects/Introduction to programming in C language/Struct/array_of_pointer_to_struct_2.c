#include<stdio.h>
#include<stdlib.h>

typedef struct employee{
    int id;
    char name[30];
    float salary;
}employee;

void swap(employee *a, employee *b);

void main(void){

    employee *all[100];
    int size;

    system("cls");
    printf("Please enter number of employee less than 100: ");
    scanf("%d", &size);
    fflush(stdin);

    for(int i=0; i<size; i++){

        all[i]=(employee *) malloc(sizeof(employee));

        //check memory
        if(!all[i]){
            printf("\nOut of memory!\n");
            exit(1);
        }


        printf("Employee no[%d]\n", i+1);
        printf("\tID: ");
        scanf("%d", &all[i]->id);
        fflush(stdin);
        printf("\tName: ");
        gets(all[i]->name);
        fflush(stdin);
        printf("\tSalary: ");
        scanf("%f", &all[i]->salary);
    }

    for(int i=0; i<size-1; i++)
        for(int j=i+1; j<size; j++)
            if((*all[i]).id > (*all[j]).id)
                swap(all[i], all[j]);
    printf("\nNO \t\tID \t\tName \t\tSalary\n");
    printf("------------------------------------------------------------------\n");

    for(int i=0; i<size; i++)
        printf("%d\t\t%d\t\t%s\t\t%.2f\n", i+1, (*all[i]).id, (*all[i]).name, (*all[i]).salary);

    //free memory
for(int i=0; i<size; i++)
    free(all[i]);
}

void swap(employee *a, employee *b){

    employee temp = *a;
    *a=*b;
    *b=temp;
}
