#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]) {
    char name[20];
    int age;
    float weigt;

    printf("Please enter your name, your age and your weight....\n");
    scanf("%s %2d %f",name, &age, &weigt);
    printf("        Hello \"%s\"\n",name);
    printf("        You are %d years old\n",age);
    printf("        And your weight is %.2f kg\n",weigt);
    return 0;
}
