#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>
void printMenu()
{
    printf("Available arithmetic operations :\n");
    printf(" 1.Plural (+)\t 2.Subtraction(-)\n 3.Beating(x)\t 4.Division(/)\n 5.sin\t 6.cos \t 7.tan\n");
    //4 spase
    printf("    8.pow \t 9.sqrt\n    Type -99 to exit\n Choose the math operation.... ");
}
void SUM();
void SUB();
void DIV();
void MUL();
void SIN();
void COS();
void TAN();
void POW();
void SQRT();
int main(int argc, char *argv[]) {
int operation=0;
do{

    printMenu();
    scanf("%d", &operation);
    switch(operation)
    {
    case 1:
        SUM();
        break;
    case 2:
        SUB();
        break;
        case 3:
        DIV();
        break;
    case 4:
        MUL();
        break;
    case 5:
        SIN();
        break;
    case 6:
        COS();
        break;
    case 7:
        TAN();
        break;
    case 8:
        POW();
        break;
    case 9:
        SQRT();
        break;
    case -99:
        printf("    Goodbay ^_^\n");
        break;
    default:
        printf("Wrong choice\n");
    }
}while(operation !=-99);
    return 0;
}
void SUM()
{
    printf("Enter two numbers\n");
    int x,y;
    scanf("%d %d",&x,&y);
    printf("------\n%d + %d = %d\n",x,y,x+y);
}
void SUB()
{
    printf("Enter two numbers\n");
    int x,y;
    scanf("%d %d",&x,&y);
    printf("------\n%d - %d = %d\n",x,y,x-y);
}
void DIV()
{
    printf("Enter two numbers\n");
    int x,y;
    scanf("%d %d",&x,&y);
    printf("------\n%d x %d = %d\n",x,y,x*y);
}
void MUL()
{
    printf("Enter two numbers\n");
    int x,y;
    scanf("%d %d",&x,&y);
    printf("------\n%d / %d = %d\n",x,y,x/y);
}
void SIN()
{
printf("Enter a number to calculate the sine of the angle... ");
int x;
scanf("%d",&x);
printf("Sin(%d) = %.3f\n",x,sin(x));
}
void COS()
{
printf("Enter a number to calculate the cosine of the angle... ");
int x;
scanf("%d",&x);
printf("Cos(%d) = %.3f\n",x,cos(x));
}
void TAN()
{
printf("Enter a number to calculate the tangent of the angle... ");
int x;
scanf("%d",&x);
printf("Tan(%d) = %.3f\n",x,tan(x));
}
void POW()
{
    printf("Enter the number, then the exponent\n");
    int x,y;
    scanf("%d %d",&x,&y);
    printf("------\n%d ^ %d = %.3f\n",x,y,pow(x,y));
}
void SQRT()
{
printf("Enter a number to find the square root of it... ");
int x;
scanf("%d",&x);
printf("The square root of(%d) = %.3f\n",x,sqrt(x));
}
