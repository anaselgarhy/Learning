#include <stdio.h>

void main(void){

    float mark;

    printf("Please enter your mark: ");
    scanf("%f", &mark);


    if(mark <50.0)
        printf("Fail \n");
    else if(mark <65)
        printf("Pass \n");
    else if(mark <80)
        printf("Good \n");
    else if(mark <90)
        printf("Very  good \n");
    else
        printf("Excellent \n");



}
//get the student mark and print the grand depend on the table:
/*
* mark <50               =======> Fail
* mark >= 50 && mark < 65 ======> Pass
* mark >= 65 && mark < 80 ======> Good
* mark >= 80 && mark < 90 ======> Very good
* mark >= 90              ======> Excellent
*/









