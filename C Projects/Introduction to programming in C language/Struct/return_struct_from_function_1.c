#include<stdio.h>
#include<string.h>

typedef struct xx{
    int n;
    int code;
    char name[30];
    float salary;
}person;;

person get_data(void);
void print_info(person p);

void main(void){

    person p1=get_data(),p2=get_data();
    print_info(p1);
    print_info(p2);

}
person get_data(void){

    person temp;

    printf("Please enter n: ");
    scanf("%d", &temp.n);
    fflush(stdin);
    printf("Please enter name: ");
    gets(temp.name);
    printf("Please enter code: ");
    scanf("%d", &temp.code);
    printf("please enter salary: ");
    scanf("%f", &temp.salary);

    return temp;
}
void print_info(person p){
    printf("Person %d:\n", p.n);
    printf("Name: %s\n", p.name);
    printf("Code: %d\n", p.code);
    printf("Salary: %7.2f\n", p.salary);
    printf("----------------------\n\n");
}
