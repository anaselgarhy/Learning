#include<stdio.h>

void main(void){

    int x=300;
    int y=522;

    const int *ptr=&x;

    //يمكن تغيير قيمة البوينتر
    ptr=&y;
    printf("y = %d", *ptr);

    //ولاكن لايمكن  تغيير قيمة المتغير الزي يحمل عنوانهه البوينتر
    *ptr =144;




}
