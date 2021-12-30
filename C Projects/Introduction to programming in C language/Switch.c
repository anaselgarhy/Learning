#include <stdio.h>
#include <math.h>

int main(void){

    double num1, num2, rev;
    char op;
    do{
        printf(" > ");
        scanf("%lf %c %lf", &num1, &op, &num2);

        switch(op){
            case '+':
                rev = num1 + num2;
            break;
            case '-':
                rev = num1 + num2;
            break;
            case '*':
                rev = num1 * num2;
            break;
            case '/':
                rev = num1 / num2;
            break;
            case '%':
                rev = (int)num1 % (int)num2;
            break;
            case '^':
                rev = pow(num1, num2);
            break;
            default:
                printf("Error ! \n");
            break;
        }
        printf(" = %.3lf \n", rev);
    } while(1<2);
}
