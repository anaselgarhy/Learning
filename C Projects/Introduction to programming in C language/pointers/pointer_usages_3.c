#include<stdio.h>
int *sum(int a[3], int b[3]);

void main(void){

    //Pass arrays and strings more conveniently return arrays as poinnter

    int a[3]={5,7,6};
    int b[3]={7,8,2};
    int *c;

    //sum
    c=sum(a, b);

    //print
    for(int i=0; i<3; i++)
        printf("%d  ",*c++);




}
int *sum(int a[3], int b[3]){
    static int c[3];
    for(int i=0; i<3; i++)
        c[i]=a[i]+b[i];
    return(c);
}
