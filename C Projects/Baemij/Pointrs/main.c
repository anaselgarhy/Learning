#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    /*
    النجمة تستخدم لتخزين قيمة مؤشر
    ويجب وضع علامة ال & قبل طباعته
    */
    int x=5;
    printf("X Value = %d\n",x);
    printf("X address = %p\n",&x);
    int *xPointer = &x;
    printf("X Pointer = %p\n", &x);
    printf("The value in heading : %p is: %d\n",xPointer,*xPointer);
    //يمكن تغيير قيمة المتغير بواسطة العنون(المؤشر)ز
    *xPointer=10;
    printf("The value in heading : %p is: %d\n",xPointer,*xPointer);
    //ويمكن تعريف المؤشر بالطريقة التاليه
    int y=18, *yPointer=&y;
    printf("%d\n",*yPointer**yPointer);
    printf("%d\n",*&y);

    return 0;
}
