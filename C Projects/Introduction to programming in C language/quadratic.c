#include <stdio.h>
#include <math.h>

void main(void){


    float a, b, c;
    float x1, x2;
    float d;

    printf("Please enter  a: ");
    scanf("%f", &a);

    printf("Please enter b: ");
    scanf("%f", &b);

    printf("Please enter c: ");
    scanf("%f", &c);


    if((b* b - 4 * a * c) < 0)
        printf("No real solution! \n");
    else{
        d = sqrt(b* b - 4 * a * c);
        x1 = (-b + d) / (2*a);
        x2 = (-b - d) / (2*a);

        printf("Solution is %5.2f , %5.2f. \n", x1, x2);

    }

}

