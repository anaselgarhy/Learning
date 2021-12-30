#include <stdio.h>

void main(void){

    char ch; /* -128......127 */
    unsigned char ch2; /* 0...... 255 */
    int number;
    float salary;
    double distance;

    ch = 'A';
    ch2 = 200;
    number = 440;
    salary = 200.20;
    distance = 11442554555254545445446698.255688668863544;

    printf("%c \n", ch);
    printf("%c     %d \n", ch2, ch2);
    printf("%d \n", number);
    printf("%f \n", salary);
    printf("%lf \n", distance);

}
