#include <stdio.h>

int main(int argc, char *argv[]){

    float num1, num2;
    char op[64];
    printf(" > ");
    scanf("%f%c%f",&num1, &op, &num2);

    printf("num1 = %f\n",num1);
    printf("num2 = %f\n", num2);
    printf("op : %c\n",op);

}
