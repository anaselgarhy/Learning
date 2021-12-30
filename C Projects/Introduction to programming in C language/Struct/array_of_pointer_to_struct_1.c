
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
   person *p[100];
   person max_p;
   max_p.salary=0;

  // printf("Size of person struct %d Byts.\n\n", sizeof(person));
    printf("Please enter number of persons < 100: ");
    scanf("%d", &n);



    //
    for(int i=0; i<n; i++){
        printf("[%d]:\n",i+1);
        p[i]=(person *)malloc(sizeof(person));

        //

    printf("\tEnter n: ");
    scanf("%d", &p[i]->n);
    fflush(stdin);
    printf("\tEnter name: ");
    gets(p[i]->name);
    printf("\tEnter code: ");
    scanf("%d", &p[i]->code);
    printf("\tEnter salary: ");
    scanf("%f", &p[i]->salary);
    fflush(stdin);
    }

    //
    for(int i=0; i<n; i++)
        if(p[i]->salary > max_p.salary)
            max_p = *p[i];

    printf("\nPerson data that has the max salary is:\n");
    print_info(max_p);

    //free memory
    for(int i=0; i<n; i++)
        free(p[i]);


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
