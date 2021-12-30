#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int main(int argc, char *argv[]) {

       int h;
       int w;
       while(true){
       printf("Please enter the length\n");
       scanf("%d", &h);
       printf("Please enter the width\n");
       scanf("%d", &w);
           for(int j=0; j<h; j++){
           for(int i=0; i<w; i++){
            printf("* ");
           }
           printf("\n");
       }
       }
    return 0;
}
