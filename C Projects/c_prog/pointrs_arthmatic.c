#include <stdio.h>

int main () 
{
    int a = 7;
	int *ptra = &a;

    printf("Address ptra = %d\n", ptra);
	printf("Size of integere is %d bytes\n", sizeof(int));
	printf("Addresss ptra + 1 = %d\n", (++ptra));
	return 0;
}
