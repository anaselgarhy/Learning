# include <stdio.h>

int main(void) 
{
	int a;
	a = 3;

	int* ptra = &a;

	printf("a value is %d\n", a);
	printf("ptra value is %x\n", ptra);
	printf("ptra value is %d\n", *ptra);

	// Derereferencing
	*ptra = 5;
	printf("a value is %d\n", a);
}
