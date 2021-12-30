#include<stdio.h>

void main(void){

    int h;

    int *ptr=&h;
    void *sptr = &ptr;

    printf("Enter you want hak pointer: ");
    scanf("%p", ptr);

    printf("value of %p point in memory = %d \n",ptr, *ptr);

    getch();




}
