#include <stdio.h>
#include <stdlib.h>
typedef union Name
{
    char n[60];
    char firstLetter;
}Name;
int main(int argc, char *argv[]) {
    Name myName;
    printf("Enter your name : ");
    scanf("%s",myName.n);
    printf("Hi mr.%c\n",myName.firstLetter);
	return 0;
}




