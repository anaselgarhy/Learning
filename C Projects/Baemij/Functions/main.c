#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void potato(){
 printf("Potato \n");
}
void printNumberPotato(int number)
{
    for(int i=0; i<number; i++)
        printf("Potato\n");
}
int power(int number)
{
    return number * number;
}
int power2(int number)
{
    printf("%d", number * number);
}
int max(int x, int y)
{
    if(x>y)
        return x;

      return y;
}
int center(int a1, int a2, int a3, int a4)
{
    int cen = (a1+a2+a3+a4)/4;
    return cen;
}

int main(int argc, char *argv[]) {
   /* int result = power(3);
    printf("%d\n\n", result);
    power2(4);*/
    int m=max(2, 3);
    printf("%d\n\n", m);
    printf("_________________\n");
    int a = center(6, 2,8,7);
    printf("%d\n", a);
    return 0;
}
