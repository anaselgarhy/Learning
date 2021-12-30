#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *link;
};

void main(void){

    struct node *top, *ptr;

    int size;

    system("cls");

    printf("Please size of stuck: ");
    scanf("%d", &size);

    top = NULL;

    for(int i=1; i<=size; i++){
        if(top==NULL){
            top=(struct node*)malloc(sizeof(struct node));
            top =ptr;
            ptr->link=NULL;
        }
        else{
            ptr=(struct node *)malloc(sizeof(struct node));
            ptr->link= top;
            top=ptr;
        }

        if(ptr!=NULL){
            printf("Please value[%d]: ",i);
            scanf("%d", &ptr->data);
        }
        else{
            printf("\nError of memory!\n");
        }
    }

    //print Stuck
    ptr =top;
    printf("Print Stuck:\n");
    while(ptr!=NULL){
        printf(" %d -> ",ptr->data);
        ptr=ptr->link;
    }

    //
    printf("\n--------------------------------------\n");
    printf("Value in front queue is %d\n", top->data);




    //free memory



}








