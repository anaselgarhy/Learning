#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[]) {
     int n=1;
     unsigned long int numLoob=0;
    for(int i=0;i=1;i++){

    /*
            1       |----------------------------|
           1 1      |                            |
          1 1 1     |                            |
         1 1 1 1    |                            |
        1 1 1 1 1   |                            |
       1 1 1 1 1 1  |                            |
      1 1 1 1 1 1 1 |                            |
       ----------------------------------------
    */
        printf("\t\t\t%d\n",n);
        printf("\t\t       %d% d\n",n,n);
        printf("\t\t      %d %d %d\n",n,n,n);
        printf("\t\t     %d %d %d %d\n",n,n,n,n);
        printf("\t\t    %d %d %d %d %d\n",n,n,n,n,n);
        printf("\t\t   %d %d %d %d %d %d\n",n,n,n,n,n,n);
        printf("\t\t  %d %d %d %d %d %d %d\n",n,n,n,n,n,n,n);
        printf("\t\t %d %d %d %d %d %d %d %d\n",n,n,n,n,n,n,n,n);
        printf("\t\t%d %d %d %d %d %d %d %d %d\n",n,n,n,n,n,n,n,n,n);
        numLoob++;
        switch(numLoob){
                /*
                1   1   1   1   1 0 0 0   1111 000
                */
                case 10000:
                    printf("----------------------------------------------------\n");
                    for(int i=0; i< 10000;i++){
                        printf("\t\t\t%d\n",n);
                        printf("\t\t       %d% d\n",n,n);
                        printf("\t\t      %d %d %d\n",n,n,n);
                        printf("\t\t\t%d\n",n);
                        printf("\t\t\t%d\n",n);
                        printf("\t\t\t%d\n",n);
                        printf("\t\t\t%d\n\n",n);
                    }

                case 20000:
                    for(int i=0; i< 10000;i++){
                    printf("\t\t\t\t\t      / \n");
        printf("\t\t\t\t             /\n");
        printf("\t\t\t\t            /\n");
        printf("\t\t\t\t           /\n");
        printf("\t\t\t\t          /\n");
        printf("\t\t\t\t         /\n");
        printf("\t\t\t\t        /\n");
        printf("\t\t\t\t       /\n");
        printf("\t\t\t\t      /\n");
        printf("\t\t\t\t     /\n");
        printf("\t\t\t\t    /\n");
        printf("\t\t\t\t   /\n");
        printf("\t\t\t\t  /\n");
        printf("\t\t\t\t /\n");
        printf("\t\t\t\t/\n");
        printf("\t\t\t\ \n");
        printf("\t\t\t \ \n");
        printf("\t\t\t  \ \n");
        printf("\t\t\t   \ \n");
        printf("\t\t\t    \ \n");
        printf("\t\t\t     \ \n");
        printf("\t\t\t\t          /\n");
        printf("\t\t\t\t          /\n");
        printf("\t\t\t\t          /\n");
        printf("\t\t\t\t          /\n");

                    }
                    break;

        }
    }
    return 0;
}
