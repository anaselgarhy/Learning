#include <stdio.h>

void increment(int *ptrNum) 
{
	*ptrNum = (*ptrNum) + 1;
}

int main() 
{
	int num = 5;
	increment(&num);
	printf("%d\n", num);
	return 0;
}
