#include <stdio.h>

int main() 
{
	int a = 5;
	printf("a = %d\n", a);
	int *ptrOfA = &a;
	printf("ptrOfA = %p\n", ptrOfA);
	printf("*ptrOfA = %d\n", *ptrOfA);
	int **ptrOfPtrOfA = &ptrOfA;
	printf("ptrOfPtrOfA = %p\n", ptrOfPtrOfA);
	printf("*ptrOfPtrOfA = %p\n", *ptrOfPtrOfA);
	printf("**ptrOfPtrOfA = %d\n", **ptrOfPtrOfA);
	int ***ptrOfPtrOfPtrOfA = &ptrOfPtrOfA;
	printf("ptrOfPtrOfPtrOfA = %p\n", ptrOfPtrOfPtrOfA);
	printf("*ptrOfPtrOfPtrOfA = %p\n", *ptrOfPtrOfPtrOfA);
	printf("**ptrOfPtrOfPtrOfA = %p\n", **ptrOfPtrOfPtrOfA);
	printf("***ptrOfPtrOfPtrOfA = %d\n", ***ptrOfPtrOfPtrOfA);
	return 0;
}
