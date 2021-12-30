#include<stdio.h>
#include<string.h>

void main(void){

    struct person{
        int code;
        char name[30];
        float salary;
    }p1, p2;

    //
    p1.code=41124;
    strcpy(p1.name, "Ahmed");
    p1.salary=65567.76;

    //assignment
    p2=p1;

    printf("Person 2:\n");
    printf("Code: %d\n",p2.code);
    printf("Name: %s\n",p2.name);
    printf("Salary: %7.2f\n\n",p2.salary);


}
