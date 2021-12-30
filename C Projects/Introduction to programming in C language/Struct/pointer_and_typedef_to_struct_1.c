#include <stdio.h>

void main(void){

    typedef struct xx{
        int code;
        char name[30];
        float salary;
    }person;

    person p1={2112, "Ahmed", 535.7}, p2={2134, "Emad", p1.salary};
    person *ptr;

    ptr=&p1;

    (*ptr).code=5344; // or  ptr -> code=5344;
    ptr -> salary=7654.76;

    printf("Person 2:\n");
    printf("Name: %s\n",p1.name);
    printf("Code: %d\n", p1.code);
    printf("Salary: %7.2f\n\n",p1.salary);


}
