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

   int n;
   person max_p;
   max_p.salary=0;
    printf("Please enter number of persons: ");
    scanf("%d", &n);

    person p[n];

    //
    for(int i=0; i<n; i++){
        printf("[%d]:\n",i+1);
        p[i]=get_data();
    }

    //
    for(int i=0; i<n; i++)
        if(p[i].salary > max_p.salary)
            max_p = p[i];

    printf("\nPerson data that has the max salary is:\n");
    print_info(max_p);


}
person get_data(void){

    person temp;

    printf("\tEnter n: ");
    scanf("%d", &temp.n);
    fflush(stdin);
    printf("\tEnter name: ");
    gets(temp.name);
    printf("\tEnter code: ");
    scanf("%d", &temp.code);
    printf("\tEnter salary: ");
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
