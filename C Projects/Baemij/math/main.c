#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(int argc, char *argv[]) {
    double result;
    //2 "3" مرفوعة لاس
    result = pow(2,  3);
    printf("%.1f\n", result);
    //الجزر التربيعي
    result=sqrt(9);
    printf("%.1f\n", result);
    //جا
    result=sin(30 * 3.14/180);
    printf("%.1f\n", result);
    result=asin(3 * 3.14 /180);
    printf("%.1f\n", result);
    result=cos(30 * 3.14/180);
    printf("%.1f\n", result);
    result=tan(30 *3.14/180);
    printf("%.1f\n", result);
    //التقريب لاقرب قيمة اكبر
    result=ceil(9.9);
    printf("%.1f\n", result);
    //التقريب لاقرب قيمة اصغر
    result=floor(9.9);
    printf("%.1f\n", result);
    return 0;
}
