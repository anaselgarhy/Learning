#include <stdio.h>

int main() 
{
	int array[5] = {1, 2, 3, 4, 5};
	printf("%p\n", array); // The array is a pointer to the first element of the array
	printf("%p\n", &array[0]);
	
	printf("%d\n", *array);
	printf("%d\n", array[0]);

	// Print the array elements using pointer arithmetic
	// Note that the array is a pointer to the first element of the array
	// so the pointer arithmetic is required to access the elements
	// of the array
	int *ptr = array; // OR int *ptr = &array[0];
	//  array++; // Invalid
    //	ptr++; // Valid
	for (int i = 0; i < sizeof(array)/sizeof(int); i++) {
		printf("%d >> %d\n", i + 1, *ptr++);
	}
	return 0;
}
