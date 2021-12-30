#include <stdio.h>
#include <string.h>

void main(void){
    int degree;
    char name[32],evaluation[24];

    printf("Enter Your name: ");
    scanf("%s",&name);
    printf("Enter Your Degree: ");
    scanf("%d",&degree);

    if(degree >= 90)
        strcpy(evaluation,"Excellent (A)");
    else if(degree <90 && degree >=80)
        strcpy(evaluation, "Very good");
    else if(degree < 80 && degree >= 65)
        strcpy(evaluation, "Good");
    else if(degree < 65 && degree >= 50)
        strcpy(evaluation, "Acceptable");
    else
        strcpy(evaluation, "Failed");

    printf("%s Your evaluation is %s \n", name, evaluation);


}
