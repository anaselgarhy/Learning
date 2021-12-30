#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(int argc, char **argv)
{
int array[5] = {1, 2, 3, 4, 5};

printf("%d\n", array[1]);

for(int i = 0; i < 5; i++)
{
    printf("%d\n", array[i]);
}


	return 0;
}
