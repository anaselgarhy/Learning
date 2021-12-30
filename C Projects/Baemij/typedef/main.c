#include <stdio.h>
#include <stdlib.h>

typedef struct Car
{
    char *type;
    char *color;
    int price;
}Car;

void printInfo(Car c);
Car setPrice(Car c, int newPrice);

int main(int argc, char** argv) {

     Car  car1;
        car1.type ="Mazda";
        car1.color="Red";
        car1.price =20000;

        printInfo(car1);
        car1 = setPrice(car1, 9000);
        printInfo(car1);

    typedef unsigned long long BEG;
    BEG x;
    printf("Size of unsigned long long Or BEG = %d", sizeof(x));

    return 0;
}
void printInfo(Car c)
{
    printf("Type : %s \n Color : %s \n Price : %d$ \n", c.type, c.color, c.price);
}
Car setPrice(Car c, int newPrice)
{
    c.price = newPrice;
    return c;
}
