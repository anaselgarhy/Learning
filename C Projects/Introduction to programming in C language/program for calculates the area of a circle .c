#include <stdio.h>
#include <conio.h>
#include <math.h>
#define PI 3.14159265359

void userInterfase();
void main(void){

     char op;

    float r, area, length, width, s, a, b, c, num;
    int num1, num2;

    userInterfase();
    op =getch();

    switch(op){
        case '1':
                printf("Enter Radius: ");
                scanf("%f", &r);
                area = (r * r) * PI;
                printf("Area  = %.2f \n", area);
        break;
        case '2':
            printf("Enter Length: ");
            scanf("%f", &length);
            printf("Enter Width: ");
            scanf("%f", &width);
            area = length * width;
            printf("Area = %.2f", area);
        break;
        case '3':
            printf("Enter side A: ");
            scanf("%f", &a);
            printf("Enter side B: ");
            scanf("%f", &b);
            printf("Enter side C: ");
            scanf("%f", &c);
            s = (a + b + c)/2;
            area = sqrt(s*(s-a)*(s-b)*(s-c));
            printf("Area  = %.2f \n", area);
        break;
        case '4':
            printf("Enter number 1: ");
            scanf("%d", &num1);
            printf("Enter number 2: ");
            scanf("%d", &num2);
            printf(" %d + %d = %d \n", num1, num2, (num1+num2));
        break;
        case '5':
            printf("Enter number: ");
            scanf("%f", &num);
            printf("%.1f is a %s \n", num, (num>0)? "positive":(num==0)? "zero":"negative");
        break;
        case '6':
            printf("Enter number: ");
            scanf("%f", &num);
            printf("%5.1f is %s", num, (((int)num%2)==1)? "odd":"even");
        break;
        case '7':

        break;
        case '8':

        break;

    }



}
void userInterfase(){
    printf("Choose an operation: \n");
    printf("[1]Calculate the area of a circle\t\t\t[2]Calculate the area of a rectangle\n");
    printf("[3]Calculate the area of a triangle\t\t\t[4]Sum of tow integer\n");
    printf("[5]Determine number positive or negative or zero\t[6]Determine number odd or even\n");
    printf("[7]\t[8]\n");
}








