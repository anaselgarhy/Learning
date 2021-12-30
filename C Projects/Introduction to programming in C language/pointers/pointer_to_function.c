#include<stdio.h>

void display(int n);

void main(void){

    void (*ptr)(int);

    ptr=&display; // or ptr=display;

    (*ptr)(3); // or ptr(3);



}
void display(int n){
    for(int i=0; i<n; i++)
        printf("Hello Anas\n");
}
