#include <stdio.h>
int var_G =277;
void main(void){


    printf("var_G = %d\n", var_G);

    extern int var_G;
    printf("var_G = %d\n \xDB", var_G);

    register int n =1;


    sum(2);
    sum(1);



}
void sum(int n){

    static int s = 5;
    printf("n = %d \n",s++);


}
