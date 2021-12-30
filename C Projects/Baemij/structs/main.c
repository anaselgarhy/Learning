#include <stdio.h>
#include <stdlib.h>

void userInterface()
{
    printf(" Choose the car you want :\n");
    printf(" car1 OR car2 OR car3 OR car4 \n ");

}

struct Car
{
    char *type;
    char *color;
    int price;
}car3,car4;

int main(int argc, char** argv) {

    int exit =0;
    int input;
    int inp[4]={1,2,3,4};
    do
        {
        userInterface();
        scanf("%d", &input);

        struct Car car1;
        car1.type ="Mazda";
        car1.color="Red";
        car1.price =20000;

        struct Car car2;
        car2.type="BMW";
        car2.color="Black";
        car2.price=30000;

        car3.type="Toyota";
        car3.color="White";
        car3.price=25000;

    if(input == inp[0]){

        printf("Car1 : \n Type : %s \n color : %s \n Price : %d$\n", car1.type, car1.color, car1.price);
    }
    else if(input == inp[1])
    {
        printf("Car2 : \n Type : %s\n Color : %s \n Price : %d$\n",car2.type,car2.color, car2.price);
    }
        else if(input == inp[2])
    {
        printf("Car2 : \n Type : %s\n Color : %s \n Price : %d$\n",car3.type,car3.color, car3.price);
    }
    }while(input != exit);

    return 0;
}
