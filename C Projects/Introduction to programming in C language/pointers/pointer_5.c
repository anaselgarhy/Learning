#include<stdio.h>

void main(void){

    char *name="Anas";
    char *p=name;

    printf("%s\n", name);

    for(int i=0; i<sizeof(p)/sizeof(char); i++)
        printf("%c\n", *p++);

    printf("%s\n", name);
    printf("%s\n", name);





}
