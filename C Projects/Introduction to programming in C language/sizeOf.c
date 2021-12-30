#include <stdio.h>

void main(void){

    printf("Size Of Cahr: %d Byte \n", sizeof(char));
    printf("Size Of Unsigned Cahr: %d Byte \n", sizeof(unsigned char));

    printf("--------------------------------------------------\n");

    printf("Size Of Int: %d Byte \n", sizeof(int));
    printf("Size Of Unsigned Int: %d Byte \n", sizeof(unsigned int));
    printf("Size Of Long Int: %d Byte \n", sizeof(long int));
    printf("Size Of Long Long Int: %d Byte \n", sizeof(long long int));
    printf("Size Of Unsigned Long Int: %d Byte \n", sizeof(unsigned long int));

    printf("--------------------------------------------------\n");

    printf("Size Of Float: %d Byte \n", sizeof(float));
//    printf("Size Of Unsigned Float: %d Byte \n", sizeof(unsigned float));
//    printf("Size Of Long Float: %d Byte \n", sizeof(long float));
//    printf("Size Of Unsigned Long Float: %d Byte \n", sizeof(unsigned long float));

    printf("--------------------------------------------------\n");

    printf("Size Of Double: %d Byte \n", sizeof(double));
//    printf("Size Of Unsigned Double: %d Byte \n", sizeof(unsigned double));
    printf("Size Of Long Double: %d Byte \n", sizeof(long double));
//    printf("Size Of Unsigned Long Double: %d Byte \n", sizeof(unsigned long double));

}
