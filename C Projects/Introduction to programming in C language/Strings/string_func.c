#include<stdio.h>
#include <string.h>

void main(void){

    int len1, len2;
    char str1[25];
    char str2[25];

    //string copy
    strcpy(str1, "anas");

    //Input
    printf("Enter string one: ");
    gets(str1);
    printf("Enter string two: ");
    gets(str2);

    //get length
    len1=strlen(str1);
    len2=strlen(str2);
     // Print length
     printf("--------Length--------\n");
     printf("String one: %d\n", len1);
     printf("String two: %d\n", len2);

     //String compeer
      printf("--------Compeer--------\n");
      if(strcmp(str1, str2) >0)
        printf("%s > %s\n",str1,str2);
      else if(strcmp(str1, str2) <0)
        printf("%s < %s\n",str1,str2);
      else
        printf("%s = %s\n",str1,str2);

    //
}
