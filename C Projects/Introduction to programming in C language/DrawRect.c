#include <stdio.h>
void drawRect(int length, int width);
void main(void){

    drawRect(100, 100);

}
void drawRect(int length, int width){

    int j, k;

    length /=2;
    width /=4;

    for(j =1; j<= width; j++){
        printf("\t\t");

        for(k=1; k<=length; k++){
            printf("\xDB");
        }
        printf("\n");
    }



}
