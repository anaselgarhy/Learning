#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *link;
};

void main(void){

    struct node *front, *back, *ptr;

    int size;

    system("cls");

    printf("Please size of queue: ");
    scanf("%d", &size);

    front = NULL;

    for(int i=1; i<=size; i++){
        if(front==NULL){
            front=(struct node*)malloc(sizeof(struct node));
            front =ptr;
        }
        else{
            ptr->link=(struct node *)malloc(sizeof(struct node));
            ptr= ptr->link; // or (*ptr).link;
            back =ptr;
        }

        if(ptr!=NULL){
            printf("Please value[%d]: ",i);
            scanf("%d", &ptr->data);
            ptr->link=NULL;
        }
        else{
            printf("\nError of memory!\n");
        }
    }

    //print queue
    ptr =front;
    printf("Print Queue:\n");
    while(ptr!=NULL){
        printf(" %d -> ",ptr->data);
        ptr=ptr->link;
    }

    //
    printf("\n--------------------------------------\n");
    printf("Value in front queue is %d\n", (*front).data);
    printf("Value in back queue is %d\n", back->data);

    //free memory



}








