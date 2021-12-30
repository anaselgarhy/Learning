#include<stdio.h>

void main(void){
    char *array[4]={"C", "C++", "Java", "python"};

    //pointer to array
    char *(*ptr)[4]=&array;

    for(int i=0; i<4; i++)
        printf("%s\n", array[i]);
    printf("--------------------------\n");

    for(int i=0; i<4; i++)
        printf("%s\n",(*ptr)[i]);
    printf("---------------------------\n");
    //OR
    char **ptr1 =&array;

    for(int i=0; i<4; i++)
        printf("%s\n", *ptr1++);

}
