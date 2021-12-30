#include <stdio.h>
#include <string.h>

void main(void){

    struct person{
        int code;
        char name[30];
        float salary;
    };

    struct person p1, p2;

    p1.code =1111;
    strcpy(p1.name, "Ahmed");
    p1.salary=5551.11;

    p2.code=4145;
    strcpy(p2.name, "Mohamed");
    p2.salary=55589;

    printf("Code: %d\n", p1.code);
    printf("Name: %s\n", p1.name);
    printf("Salary: %7.2f\n\n",p1.salary);

    printf("Code: %d\n", p2.code);
    printf("Name: %s\n", p2.name);
    printf("Salary: %7.2f\n\n",p2.salary);



    //
    struct person p3={3224, "Ali", 4324.87};

    printf("Code: %d\n", p3.code);
    printf("Name: %s\n", p3.name);
    printf("Salary: %7.2f\n\n",p3.salary);


}
