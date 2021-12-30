#include <stdio.h>
#include <conio.h>
int main(int argc, char *argv[]){
    char name[32];
    char in;
    int age;
    printf("Enter Your Name: ");
    scanf("%s", name);
    printf("Enter Your age: ");
    scanf("%d", &age);

    printf("Do you want to print your name? y/n ");
    // جيت سي اتش اي تستعمل لاسقبال حرف من الكيبورد مع اظهاره
    in = getche();
    if(in == 'y')
        printf("\nYour Name is %s\n", name);
    else
        printf("OK ! \n");

    printf("Do you want to print your age? y/n ");
    // جيت سي اتش تستعمل لاستبالل حرف دون اظهاره
    in = getch();
    if(in == 'y')
        printf("\nYour Age is %d\n",age);
    else
        printf("OK !");

}
