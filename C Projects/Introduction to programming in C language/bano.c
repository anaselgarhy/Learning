#include <stdio.h>
void move(int number, char a, char c, char b);

void main(void){

    int number;
    char a ='A';
    char b ='B';
    char c ='C';

    printf("Please enter number of disks: ");
    scanf("%d", &number);
    move(number, a, c, b);
}
void move(int number, char a, char c, char b){

    if(number == 1)
        printf(" move from table %c to %c \n", a, c);
    else{
        move(number -1, a, b, c);
        printf(" move from table %c to %c \n", a, c);
        move(number-1, b, c, a);
    }


}
