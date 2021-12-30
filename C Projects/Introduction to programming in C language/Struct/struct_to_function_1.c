#include<stdio.h>
typedef struct xx{
        int n;
        int code;
        char name[30];
        float salary;
    }person;
void print_info(person p);
void increment_code(person *p);
void increment_n(person *p);
void change_name(person *p, char newName[30]);

void main(void){



    person p1={1, 4333, "AnAS", 5443.98};
    print_info(p1);

    increment_n(&p1);
    change_name(&p1, "Mohamed");
    increment_code(&p1);
    print_info(p1);



}
void print_info(person p){

    printf("Person %d:\n", p.n);
    printf("Name: %s\n", p.name);
    printf("Code: %d\n", p.code);
    printf("Salary: %7.2f\n", p.salary);
    printf("--------------------\n");
}
void increment_code(person *p){
    p->code++; // or (*p).code++;
}
void increment_n(person *p){
    (*p).n++; //or p->n++;
}
void change_name(person *p, char newName[30]){
    strcpy(p->name, newName);
}
