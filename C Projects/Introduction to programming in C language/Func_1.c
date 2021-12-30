#include <stdio.h>
int fact(int+);
void main(void){

    int z;
    z = fact(4);
    printf("Fact 4 = %d",fact(4));

}
int fact(int number){

    int f=1;
    for(int i=number; i>0; i--)
        f *=i;
    return f;
}
