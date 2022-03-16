#include <stdio.h>

int sumOfArray(int arr[], int size) // int *arr or int arr[] is also correct
{
	// Can't caulcate the array length because it's a pointer to the first element
	int sum = *arr; 
	for (int i = 1; i < size; i++) 
	{
		sum += arr[i]; // *(arr + i) also works
	}
	return sum;
}

int main() {
	int arr[] = {1, 2, 3, 4, 5};
	int arrSize = sizeof(arr) / sizeof(int);
	printf("%d", sumOfArray(arr, arrSize));
	return 0;
}
