#include <stdio.h>

int main(void) 
{
	int a = 1025;
	int *p = &a;
	printf("Size of int is %d\n", sizeof(int));
	printf("Size of int pointer is %d\n", sizeof(p));

	printf("Adrress of p is %d, and valu is %d\n", p, *p);

	char *p0 = (char *)p; // cast p from int* to char*
	printf("Adrress of p0 is %d, and valu is %d\n", p0, *p0);
	printf("Size of char pointer is %d\n", sizeof(p0));
	return 0;
}
