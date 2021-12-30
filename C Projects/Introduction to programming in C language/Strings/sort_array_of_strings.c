#include<stdio.h>
#include<string.h>

void main(void){

    int i, j, count;
    char names[100][30], temp[30];

    //Read counter
    printf("How many strings you are going to enter: ");
    scanf("%d",&count);

    //Clear keyboard buffer
    fflush(stdin);

    //Input names
    for(i=0; i<count; i++){
        printf("Enter name [%d]: ", i+1);
        gets(names[i]);
    }

    //Sorting
    for(i=0; i<count-1; i++)
        for(j=i+1; j<count; j++)
            if(strcmp(names[i], names[j])>0){
                strcpy(temp, names[i]);
                strcpy(names[i], names[j]);
                strcpy(names[j], temp);
            }

    //Print names after sorting
    printf("\nNames after sorting\n");
    printf("-----------------------\n");
    for(i=0; i<count; i++)
        puts(names[i]);



}
