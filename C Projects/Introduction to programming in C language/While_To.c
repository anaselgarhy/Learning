#include <stdio.h>
#include <conio.h>

void main(void){

    char ch;

    while((ch = getch()) != 27){
        printf("You press char %c with ASCII code %d \n", ch, ch);
    }
    printf("Goodbye ^_~ \n");

}
