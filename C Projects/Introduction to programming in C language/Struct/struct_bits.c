#include <stdio.h>

void main(void){

    struct wdate{
        unsigned int d;
        unsigned int m;
        unsigned int y;
    };

    struct date{
        unsigned int d:5; // 5 bits
        unsigned int m:4; // 4 bits
        unsigned int y:12; // 12 bits
    };

    struct wdate d1 = {5, 3, 2021};
    struct date d2 = {5, 3, 2021};

    printf("%d/%d/%d \n", d1.d, d1.m, d1.y);
    printf("Size of d1 Bayte = %d \n\n", sizeof(d1));

    printf("%d/%d/%d \n", d2.d, d2.m, d2.y);
    printf("Size of d2 = %d Bayte \n\n", sizeof(d2));


}
