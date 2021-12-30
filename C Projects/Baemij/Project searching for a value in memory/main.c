#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[]) {
        srand(time(0));
        unsigned int s;
        printf("Please enter the memory capacity... ");
        scanf("%d",&s);
        int *memory = (int *)malloc(s);
        for(int i=0 ;i<s; i++)
        {
            memory[i] = 1+rand()%9;
        }
        printf("The values of the matrix are: {");
        for(int i= 0; i<s; i++)
        {
            printf("%d, ", memory[i]);
        }
        printf("}\n");
        int y;
        printf("Please enter the number you want to search for... ");
        scanf("%d",&y);
        int o=0;
        for(int i=0; i<s; i++)
        {
            if(memory[i] == y)
            {
                o++;
            }
        }
        printf("The number of times the number %d repeats in memory is: %d", y, o);



    return 0;
}
